package sarvarmasharipov72.edulife.ui.Courses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ui.Courses.model.MyCourse
import sarvarmasharipov72.edulife.ui.Courses.model.Recommended


class Courses : Fragment() {

    var adapter: CoursesAdapter? = null
    var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_courses, container, false)

        adapter = CoursesAdapter()
        recyclerView = view.findViewById(R.id.recyclerCourses)

        recyclerView?.adapter = adapter

        recyclerView?.layoutManager = LinearLayoutManager(requireContext())
        adapter?.setData(myCourseGenered(), recommendedCourse())

        return view
    }

    private fun myCourseGenered() =
        listOf(
            MyCourse("Web design (UI/UX) design", 118, 34, 17, 4, 7, 5),
            MyCourse("Web design (UI/UX) design", 118, 34, 17, 4, 7, 5),
            MyCourse("Web design (UI/UX) design", 118, 34, 17, 4, 7, 5),
            MyCourse("Web design (UI/UX) design", 118, 34, 17, 4, 7, 5)
        )

    private fun recommendedCourse() = listOf<Recommended>(
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
        Recommended(
            "Beginner",
            "Ingiliz tili (Beginner)",
            "Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kurslarimizga chegirma",
            199000,
            33
        ),
    )

    override fun onDestroy() {
        super.onDestroy()
        adapter = null
        recyclerView = null
    }

}