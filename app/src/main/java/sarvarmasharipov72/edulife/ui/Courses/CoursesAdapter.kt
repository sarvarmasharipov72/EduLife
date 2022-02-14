package sarvarmasharipov72.edulife.ui.Courses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ui.Courses.model.MyCourse
import sarvarmasharipov72.edulife.ui.Courses.model.Recommended
import sarvarmasharipov72.edulife.ui.Login.LoginFragmentTwo
import java.lang.StringBuilder

class CoursesAdapter : RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {
    companion object {
        private const val MY_COURSE = 0
        private const val FILTER = 1
        private const val RECOMMENDED = 2
    }

    private var listOne = emptyList<MyCourse>()
    private var listTwo = emptyList<Recommended>()

    open class CoursesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class MyCourseHolder(view: View) : CoursesViewHolder(view) {
        private val nameMyCourse = view.findViewById<TextView>(R.id.nameMyCourse)
        private val completeVideo = view.findViewById<TextView>(R.id.completeVideo)
        private val completeTask = view.findViewById<TextView>(R.id.completeTask)
        private val complateTest = view.findViewById<TextView>(R.id.complateTest)

        fun bind(myCourse: MyCourse) {
            nameMyCourse.text = myCourse.nameMyCourse
            completeVideo.text = change(myCourse.complateVideo, myCourse.video)
            completeTask.text = change(myCourse.complateTask, myCourse.task)
            complateTest.text = change(myCourse.complateTest, myCourse.test)
        }

        private fun change(complate: Int, all: Int): CharSequence? {
            return "$complate/$all"
        }

    }

    class MyCourseFilter(view: View) : CoursesViewHolder(view)

    class RecommendedCourse(view: View) : CoursesViewHolder(view) {
        private val levelCourse = view.findViewById<TextView>(R.id.levelCourseCourse)
        private val nameCource = view.findViewById<TextView>(R.id.nameCourceCourse)
        private val textCource = view.findViewById<TextView>(R.id.textCourceCourse)
        private val price = view.findViewById<TextView>(R.id.priceCourse)
        private val discount = view.findViewById<TextView>(R.id.discountCourse)

        fun bind(recommended: Recommended) {
            levelCourse.text = recommended.levelCourse
            nameCource.text = recommended.nameCourse
            textCource.text = recommended.textCourse
            price.text = changes(recommended.price.toString())
            discount.text = recommended.discount.toString()
        }

        fun changes(price: String): String{
            val size:Int = price.length

            return if (size <= 3 ) "$price so'm"
            else {
                val endWith = price.toInt()%1000
                val startWith = price.toInt()/1000

                return if (price.endsWith("000")) {
                    "$startWith.000 so'm"
                } else "$startWith.$endWith so'm"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        return when (viewType) {
            MY_COURSE -> MyCourseHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_courses_my_course, parent, false))
            FILTER -> MyCourseFilter(LayoutInflater.from(parent.context).inflate(R.layout.filter_item, parent, false))
            else -> RecommendedCourse(LayoutInflater.from(parent.context).inflate(R.layout.recommended_item, parent, false))
        }
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        when (holder) {
            is MyCourseHolder -> holder.bind(listOne[position])
            is RecommendedCourse -> holder.bind(listTwo[position - listOne.size - 1])
        }
    }

    override fun getItemCount(): Int = listOne.size + listTwo.size + 1

    override fun getItemViewType(position: Int): Int {
        return when {
            position < listOne.size -> {
                MY_COURSE
            }
            position == listOne.size -> {
                FILTER
            }

            else -> {
                RECOMMENDED
            }
        }
    }

    fun setData(listOne: List<MyCourse>, listTwo: List<Recommended>) {
        this.listOne = listOne
        this.listTwo = listTwo
        notifyDataSetChanged()
    }
}