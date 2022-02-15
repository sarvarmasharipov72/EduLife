package sarvarmasharipov72.edulife.ui.Rating

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.model.RatingModel
import sarvarmasharipov72.edulife.ui.Home.HomeViewModel
import sarvarmasharipov72.edulife.ui.Rating.adapter.RatingAdapter


class Rating : Fragment() {
    private val homeViewModel: HomeViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_rating, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerRating)
        val adapter = RatingAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter.setData(getData())
        view.findViewById<ImageButton>(R.id.ratingBackButton).setOnClickListener {
            findNavController().navigate(R.id.action_rating_to_homeFragment)
        }
        return view
    }
    fun getData (): List<RatingModel> = listOf(
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(2, "Farrux Bozorboyev", "Web design"),
        RatingModel(3, "Farrux Bozorboyev", "Web design"),
        RatingModel(4, "Farrux Bozorboyev", "Web design"),
        RatingModel(5, "Farrux Bozorboyev", "Web design"),
        RatingModel(6, "Farrux Bozorboyev", "Web design"),
        RatingModel(7, "Farrux Bozorboyev", "Web design"),
        RatingModel(8, "Farrux Bozorboyev", "Web design"),
        RatingModel(9, "Farrux Bozorboyev", "Web design"),
        RatingModel(10, "Farrux Bozorboyev", "Web design"),
        RatingModel(11, "Farrux Bozorboyev", "Web design"),
        RatingModel(12, "Farrux Bozorboyev", "Web design"),
        RatingModel(13, "Farrux Bozorboyev", "Web design"),
        RatingModel(14, "Farrux Bozorboyev", "Web design"),
        RatingModel(15, "Farrux Bozorboyev", "Web design"),
        RatingModel(16, "Farrux Bozorboyev", "Web design"),
        RatingModel(17, "Farrux Bozorboyev", "Web design"),
        RatingModel(18, "Farrux Bozorboyev", "Web design")
    )

}