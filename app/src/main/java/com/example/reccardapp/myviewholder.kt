package com.example.reccardapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class myviewholder(itemView: View) : ViewHolder(itemView) {
    var img: ImageView
    var name: TextView
    var shortname: TextView
    var desc: TextView
    var teamMembers: TextView

    init {
        img = itemView.findViewById(R.id.img1)
        name = itemView.findViewById(R.id.team_name)
        shortname = itemView.findViewById(R.id.team_short_name)
        desc = itemView.findViewById(R.id.team_description)
        teamMembers = itemView.findViewById(R.id.team_members)
    }
}