package sarvarmasharipov72.edulife.ui.Rating.adapter

import android.graphics.Color
import android.graphics.ColorSpace
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.model.RatingModel

class RatingAdapter : RecyclerView.Adapter<RatingAdapter.RatingViewHolder>() {
    val HEADER = 0
    val BODY = 1
    var list = emptyList<RatingModel>()
    open class RatingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class HeaderViewHolder(itemView: View) : RatingViewHolder(itemView)

    class BodyViewHolder(itemView: View) : RatingViewHolder(itemView){
        val container = itemView.findViewById<ConstraintLayout>(R.id.rating_body_container)
        val rating = itemView.findViewById<TextView>(R.id.rating)
        val ratingName = itemView.findViewById<TextView>(R.id.ratingName)
        val ratingCourse = itemView.findViewById<TextView>(R.id.ratingCourse)
        fun bind (rating: RatingModel) {
            if (rating.id % 2 == 1) {
                this.rating.text = rating.id.toString()
                this.rating.setTextColor(ContextCompat.getColor(itemView.context, R.color.textColorGreen))
                this.ratingName.setTextColor(ContextCompat.getColor(itemView.context, R.color.textColorGreen))
                this.ratingCourse.setTextColor(ContextCompat.getColor(itemView.context, R.color.textColorGreen))
                ratingName.text = rating.name
                ratingCourse.text = rating.course
            } else {
                container.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.white))
                this.rating.text = rating.id.toString()
                ratingName.text = rating.name
                ratingCourse.text = rating.course
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatingViewHolder {
        return when (viewType) {
            HEADER -> HeaderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rating_header, parent, false))
            else -> BodyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rating_body, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RatingViewHolder, position: Int) {
        if (holder is BodyViewHolder) {
            holder.bind(list[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            return HEADER
        } else {
            return BODY
        }
    }

    fun setData(list: List<RatingModel>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size
}
