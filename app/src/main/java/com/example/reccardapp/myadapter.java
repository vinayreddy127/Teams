package com.example.reccardapp;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Normalizer2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class myadapter extends RecyclerView.Adapter<myviewholder> implements Filterable
 {
   ArrayList<Model> data;
   ArrayList<Model> backup;
   Context context;

    public myadapter(ArrayList<Model> data, Context context)

    {
        this.data = data;
        this.context=context;
        backup=new ArrayList<>(data);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position)
    {
       final Model temp=data.get(position);

        holder.img.setImageResource(data.get(position).getImgname());
        holder.name.setText(data.get(position).getTeam_Name());
        holder.shortname.setText(data.get(position).getShort_name());
        holder.desc.setText(data.get(position).getTeam_Description());
        holder.teamMembers.setText(data.get(position).getTeam_Members());

       holder.img.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                 Intent intent=new Intent(context,Main2Activity.class);
                 intent.putExtra("imagename",temp.getImgname());
                 intent.putExtra("teamName",temp.getTeam_Name());
                 intent.putExtra("shortName",temp.getShort_name());
                 intent.putExtra("teamDesc",temp.getTeam_Description());
                 intent.putExtra("teamMembers",temp.getTeam_Members());
                 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 context.startActivity(intent);
           }
       });

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }


     @Override
     public Filter getFilter() {
         return filter;
     }

      Filter filter=new Filter() {
          @Override
          // background thread
          protected FilterResults performFiltering(CharSequence keyword)
          {
              ArrayList<Model> filtereddata=new ArrayList<>();

                if(keyword.toString().isEmpty())
                    filtereddata.addAll(backup);
                else
                {
                   for(Model obj : backup)
                   {
                      if(obj.getTeam_Name().toString().toLowerCase().contains(keyword.toString().toLowerCase()))
                          filtereddata.add(obj);
                   }
                }

                FilterResults results=new FilterResults();
                results.values=filtereddata;
                return results;
          }

          @Override  // main UI thread
          protected void publishResults(CharSequence constraint, FilterResults results)
          {
             data.clear();
             data.addAll((ArrayList<Model>)results.values);
             notifyDataSetChanged();
          }
      };
 }
