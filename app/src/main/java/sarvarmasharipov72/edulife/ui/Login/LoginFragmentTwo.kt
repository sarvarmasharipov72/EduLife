package sarvarmasharipov72.edulife.ui.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import sarvarmasharipov72.edulife.R

class LoginFragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login_two, container, false)
        view.findViewById<ImageButton>(R.id.btnPrevLoginTwo).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragmentTwo_to_loginFragmentOne)
        }
        view.findViewById<MaterialButton>(R.id.btnKirishFragmentTwo).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragmentTwo_to_homeFragment)
        }
        return view
    }

}