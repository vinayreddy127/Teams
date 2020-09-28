package com.example.reccardapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder
{
    ImageView img;
    TextView name,shortname, desc, teamMembers;
    public myviewholder(@NonNull View itemView)
    {
        super(itemView);
        img=itemView.findViewById(R.id.img1);
        name=itemView.findViewById(R.id.team_name);
        shortname=itemView.findViewById(R.id.team_short_name);
        desc=itemView.findViewById(R.id.team_description);
        teamMembers=itemView.findViewById(R.id.team_members);
    }
}
