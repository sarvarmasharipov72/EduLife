package sarvarmasharipov72.edulife.ui.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import de.hdodenhof.circleimageview.CircleImageView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ViewModel

class HomeFragment : Fragment() {

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
        childFragmentManager.setFragmentResultListener("request_key", requireActivity()) { requestKey, bundle ->
            val result = bundle.getString("bundle_key")
            findNavController().navigate(R.id.action_homeFragment_to_rating)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        childFragmentManager.setFragmentResultListener("key",)
    }
}