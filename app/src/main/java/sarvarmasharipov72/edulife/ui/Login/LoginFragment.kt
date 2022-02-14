package sarvarmasharipov72.edulife.ui.Login

import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.bind(inflater.inflate(R.layout.fragment_login, container, false))

        val spannableString = SpannableString("Foydalanish shartlari bilan tanishib chiqdim")
        val sColor = ForegroundColorSpan(resources.getColor(R.color.blue_span))
        spannableString.setSpan(sColor,0,21,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.chekboxText.text = spannableString
        binding.login.setOnClickListener {

        }
        binding.btnPrevLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }
        binding.btnlogin.setOnClickListener {
            var phoneNumber: CharSequence = binding.login.text
            if (Patterns.PHONE.matcher(phoneNumber).matches()) {
                findNavController().navigate(R.id.action_loginFragment_to_loginFragmentOne)
            }
        }
        return binding.root
    }

}