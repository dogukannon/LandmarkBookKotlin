package com.dogukan.landmarkbookkotlin


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dogukan.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) :RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>(){

    class LandmarkHolder(val binding: RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
    val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return LandmarkHolder(binding)
    }


    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerTextView.text = landmarkList.get(position).name

        //after clicking the image
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetalilsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)

        }


    }
    override fun getItemCount(): Int {
        return landmarkList.size
    }


}