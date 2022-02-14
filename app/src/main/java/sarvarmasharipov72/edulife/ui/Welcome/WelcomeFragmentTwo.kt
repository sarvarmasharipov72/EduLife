package sarvarmasharipov72.edulife.ui.Welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import sarvarmasharipov72.edulife.R

class WelcomeFragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_welcome_two, container, false)
        view.findViewById<ImageButton>(R.id.btnPrevWelcomeTwo).setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragmentTwo_to_welcomeFragmentOne)
        }
        return view
    }

}