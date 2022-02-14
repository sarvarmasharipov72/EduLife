package sarvarmasharipov72.edulife.ui.Home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sarvarmasharipov72.edulife.model.HomeModel
import sarvarmasharipov72.edulife.R

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    lateinit var list: List<HomeModel>
    class HomeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.nameCource)
        val text = itemView.findViewById<TextView>(R.id.textCource)
        val sum = itemView.findViewById<TextView>(R.id.price)
        val skidka = itemView.findViewById<TextView>(R.id.discount)
        fun bind(homeModel: HomeModel){
            name.text = homeModel.name
            text.text = homeModel.text
            sum.text = homeModel.sum.toString() + "00 so'm"
            skidka.text = homeModel.skidka.toString() +"%"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_home,parent,false))
    }

    fun setData(list: List<HomeModel>){
        this.list = list
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}