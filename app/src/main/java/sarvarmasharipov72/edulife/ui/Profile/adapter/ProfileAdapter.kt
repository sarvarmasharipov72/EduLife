package sarvarmasharipov72.edulife.ui.Profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.R

class ProfileAdapter : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {
    private val list = listOf<Profile>(
    Profile(R.drawable.ic_time_history, "Tugatilgan kurslar", "3"),
    Profile(R.drawable.ic_home_work, "Uyga vazifa", "13"),
    Profile(R.drawable.ic_rating_profile, "Reyting", "16"),
    Profile(R.drawable.ic_points, "Ball", "136 pt"),
    Profile(R.drawable.ic_time_history, "Amaliyotlar tarixi"),
    Profile(R.drawable.ic_time_history, "Sotib olingan kurslar tarixi"),
    Profile(R.drawable.ic_my_certificates, "Sertifikatlarim"),
    Profile(R.drawable.ic_about_us, "Biz haqimizda")
    )
    class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileItemIcon = itemView.findViewById<ImageView>(R.id.profileItemIcon)
        val profileItemText = itemView.findViewById<TextView>(R.id.profileItemText)
        val profileItemCounter = itemView.findViewById<TextView>(R.id.profileItemCounter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent, false))
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.profileItemIcon.setImageResource(list[position].icon)
        holder.profileItemText.text = (list[position].text)
        holder.profileItemCounter.text = (list[position].counter)
    }

    override fun getItemCount(): Int = list.size - 1



    private data class Profile(val icon: Int, val text: String, val counter: String = "")
}