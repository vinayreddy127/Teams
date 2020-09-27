package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
      //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setTeam_Name("Team 1");
        ob1.setShort_name("@team1");
        ob1.setTeam_Description("This is team 1");
        ob1.setTeam_Members("mem 1, mem2");
        ob1.setImgname(R.drawable.team);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setTeam_Name("Team 2");
        ob2.setShort_name("@team2");
        ob2.setTeam_Description("This is team 2");
        ob2.setTeam_Members("mem 2, mem6");
        ob2.setImgname(R.drawable.team);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setTeam_Name("Team 3");
        ob3.setShort_name("@team3");
        ob3.setTeam_Description("This is team 3");
        ob3.setTeam_Members("mem 27, mem68");
        ob3.setImgname(R.drawable.team);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setTeam_Name("Team 4");
        ob4.setShort_name("@team4");
        ob4.setTeam_Description("This is team 4");
        ob4.setTeam_Members("mem 4, mem6");
        ob4.setImgname(R.drawable.team);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setTeam_Name("Team 5");
        ob5.setShort_name("@team5");
        ob5.setTeam_Description("This is team 5");
        ob5.setTeam_Members("mem 56, mem66");
        ob5.setImgname(R.drawable.team);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setTeam_Name("Team 6");
        ob6.setShort_name("@team6");
        ob6.setTeam_Description("This is team 6");
        ob6.setTeam_Members("mem 28, mem69");
        ob6.setImgname(R.drawable.team);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setTeam_Name("Team 7");
        ob7.setShort_name("@team7");
        ob7.setTeam_Description("This is team 7");
        ob7.setTeam_Members("mem 23, mem667");
        ob7.setImgname(R.drawable.team);
        holder.add(ob7);



        return holder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        MenuItem item=menu.findItem(R.id.search_menu);

        SearchView searchView=(SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
