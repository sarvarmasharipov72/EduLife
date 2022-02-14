package sarvarmasharipov72.edulife.ui.HomeSubFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ViewModel
import sarvarmasharipov72.edulife.model.HomeModel
import sarvarmasharipov72.edulife.ui.Home.adapter.HomeAdapter

class HomeSubFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_sub, container, false)

//        RecyclerView
        val recycler = view.findViewById<RecyclerView>(R.id.homeRecycler)
        val adapter = HomeAdapter()
        val viewModel = ViewModel()
        recycler.adapter = adapter
        adapter.setData(listOf(HomeModel("Ingiliz tili(Beginner)","Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kur...",190.000,33),
            HomeModel("Ingiliz tili(Beginner)","Ingiliz tilini beginner darajasiga atigi 3 oyda chiqing va keyingi kur...",190.000,33)))

//        Reyting OnClick
        view.findViewById<ImageButton>(R.id.taskImage3).setOnClickListener {
            val result = "result"
            setFragmentResult("request_key", bundleOf("bundle_key" to result))
        }
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}