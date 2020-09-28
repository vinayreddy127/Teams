package com.example.reccardapp

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class TeamsMainActivity : AppCompatActivity() {
    var rcv: RecyclerView? = null
    var adapter: myadapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teams_activity_main)
        title = "Recycler and Card View Demo"
        rcv = findViewById<View>(R.id.recview) as RecyclerView
        //  rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = myadapter(dataqueue(), applicationContext)
        rcv!!.adapter = adapter

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);
        val gridLayoutManager = GridLayoutManager(this, 1)
        rcv!!.layoutManager = gridLayoutManager
    }

    fun dataqueue(): ArrayList<Model> {
        val holder = ArrayList<Model>()
        val ob1 = Model()
        ob1.team_Name = "Team 1"
        ob1.short_Name = "@team1"
        ob1.team_Description = "This is team 1"
        ob1.team_Members = "mem 1, mem2"
        ob1.img_Name = R.drawable.teams
        holder.add(ob1)
        val ob2 = Model()
        ob2.team_Name = "Team 2"
        ob2.short_Name = "@team2"
        ob2.team_Description = "This is team 2"
        ob2.team_Members = "mem 2, mem6"
        ob2.img_Name = R.drawable.teams
        holder.add(ob2)
        val ob3 = Model()
        ob3.team_Name = "Team 3"
        ob3.short_Name = "@team3"
        ob3.team_Description = "This is team 3"
        ob3.team_Members = "mem 27, mem68"
        ob3.img_Name = R.drawable.teams
        holder.add(ob3)
        val ob4 = Model()
        ob4.team_Name = "Team 4"
        ob4.short_Name = "@team4"
        ob4.team_Description = "This is team 4"
        ob4.team_Members = "mem 4, mem6"
        ob4.img_Name = R.drawable.teams
        holder.add(ob4)
        val ob5 = Model()
        ob5.team_Name = "Team 5"
        ob5.short_Name = "@team5"
        ob5.team_Description = "This is team 5"
        ob5.team_Members = "mem 56, mem66"
        ob5.img_Name = R.drawable.teams
        holder.add(ob5)
        val ob6 = Model()
        ob6.team_Name = "Team 6"
        ob6.short_Name = "@team6"
        ob6.team_Description = "This is team 6"
        ob6.team_Members = "mem 28, mem69"
        ob6.img_Name = R.drawable.teams
        holder.add(ob6)
        val ob7 = Model()
        ob7.team_Name = "Team 7"
        ob7.short_Name = "@team7"
        ob7.team_Description = "This is team 7"
        ob7.team_Members = "mem 23, mem667"
        ob7.img_Name = R.drawable.teams
        holder.add(ob7)
        return holder
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        val item = menu.findItem(R.id.search_menu)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                adapter!!.getFilter().filter(newText)
                return false
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
}