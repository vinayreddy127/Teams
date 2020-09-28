package com.example.reccardapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class myadapter(var data: ArrayList<Model>, var context: Context) : RecyclerView.Adapter<myviewholder>(), Filterable {
    var backup: ArrayList<Model> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.teamssinglerow, parent, false)
        return myviewholder(view)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val temp = data[position]
        holder.img.setImageResource(data[position].img_Name)
        holder.name.text = data[position].team_Name
        holder.shortname.text = data[position].short_Name
        holder.desc.text = data[position].team_Description
        holder.teamMembers.text = data[position].team_Members
        holder.img.setOnClickListener {
            val intent = Intent(context, TeamsDetailedActivity::class.java)
            intent.putExtra("imagename", temp.img_Name)
            intent.putExtra("teamName", temp.team_Name)
            intent.putExtra("shortName", temp.short_Name)
            intent.putExtra("teamDescription", temp.team_Description)
            intent.putExtra("teamMembers", temp.team_Members)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getFilter(): Filter {
        return filter
    }

    private var filter: Filter = object : Filter() {
        // background thread
        override fun performFiltering(keyword: CharSequence): FilterResults {
            val filtereddata = ArrayList<Model>()
            if (keyword.toString().isEmpty()) filtereddata.addAll(backup) else {
                for (obj in backup) {
                    if (obj.team_Name.toString().toLowerCase().contains(keyword.toString().toLowerCase())) filtereddata.add(obj)
                }
            }
            val results = FilterResults()
            results.values = filtereddata
            return results
        }

        // main UI thread
        override fun publishResults(constraint: CharSequence, results: FilterResults) {
            data.clear()
            data.addAll((results.values as ArrayList<Model>))
            notifyDataSetChanged()
        }
    }

    init {
        backup = ArrayList(data)
    }
}