package sarvarmasharipov72.edulife.ui.Profile

import android.os.Bundle
import android.view.*
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.ui.Profile.adapter.ProfileAdapter

class Profile: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile,container,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerProfile)
        recyclerView.adapter = ProfileAdapter()
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val appbar = (requireActivity() as AppCompatActivity)
        appbar.setSupportActionBar(view.findViewById(R.id.toolbarProfile))

        view.findViewById<ImageButton>(R.id.profileBackButton).setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_homeFragment)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.profile_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}