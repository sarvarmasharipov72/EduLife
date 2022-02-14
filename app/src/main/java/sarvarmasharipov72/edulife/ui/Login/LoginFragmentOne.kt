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

class LoginFragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login_one, container, false)
        view.findViewById<ImageButton>(R.id.btnPrevLoginOne).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragmentOne_to_loginFragment)
        }
        view.findViewById<MaterialButton>(R.id.btnKirishFragmentOne).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragmentOne_to_loginFragmentTwo)
        }
        return view
    }

}