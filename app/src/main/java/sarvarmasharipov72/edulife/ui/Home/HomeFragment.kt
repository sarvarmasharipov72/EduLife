package sarvarmasharipov72.edulife.ui.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import de.hdodenhof.circleimageview.CircleImageView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ViewModel

class HomeFragment : Fragment() {
    private val homeViewModel: HomeViewModel by activityViewModels()
    val KEY_FRAGMENT = "key_fragment"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val viewModel = ViewModel()
        view.findViewById<CircleImageView>(R.id.homeCircleImage).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profile)
        }

        homeViewModel.itemCourses.observe(this, {
            if (it) {
//                findNavController().navigate(R.id.action_homeFragment_to_courses)
                homeViewModel.itemSelectedCourses(false)
            }
        })

        homeViewModel.itemReyting.observe(this, {
            if (it) {
                findNavController().navigate(R.id.action_homeFragment_to_rating)
                homeViewModel.itemSelectedReyting(false)
            }
        })

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        childFragmentManager.setFragmentResultListener("key",)
    }
}