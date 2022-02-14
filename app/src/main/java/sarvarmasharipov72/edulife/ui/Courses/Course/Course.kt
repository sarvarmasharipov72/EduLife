package sarvarmasharipov72.edulife.ui.Courses.Course

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import sarvarmasharipov72.edulife.R

class Course : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_course, container, false)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarCourse)
        val appBar = (requireActivity() as AppCompatActivity)

        appBar.setSupportActionBar(toolbar)
        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.course_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return true
    }



}