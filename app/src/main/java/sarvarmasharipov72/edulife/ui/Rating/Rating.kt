package sarvarmasharipov72.edulife.ui.Rating

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R
import sarvarmasharipov72.edulife.model.RatingModel
import sarvarmasharipov72.edulife.ui.Rating.adapter.RatingAdapter


class Rating : Fragment() {

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
        return view
    }
    fun getData (): List<RatingModel> = listOf(
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design"),
        RatingModel(1, "Farrux Bozorboyev", "Web design")
    )

}