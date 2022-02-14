package sarvarmasharipov72.edulife.ui.Welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import sarvarmasharipov72.edulife.R

class WelcomeFragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome_one, container, false)
        view.findViewById<ImageButton>(R.id.btnPrevWelcomeOne).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragmentOne_to_welcomeFragment)
        }
        view.findViewById<MaterialButton>(R.id.btnNextWelcomeOne).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragmentOne_to_welcomeFragmentTwo)
        }

        return view
    }


}