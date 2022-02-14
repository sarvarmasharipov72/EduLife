package sarvarmasharipov72.edulife.ui.Welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import sarvarmasharipov72.edulife.R

class WelcomeFragment : Fragment() {
    private lateinit var binding: WelcomeFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<MaterialButton>(R.id.buttonBoshlash).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_welcomeFragmentOne)
        }
        view.findViewById<MaterialButton>(R.id.buttonKirish).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        return view
    }
}