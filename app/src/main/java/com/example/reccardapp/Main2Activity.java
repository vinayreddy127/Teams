package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
   ImageView detailImg;
   TextView detail_team_name,detail_short_name, detail_team_description, detail_team_members;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        detailImg=(ImageView)findViewById(R.id.detail_img);
        detail_team_name=(TextView)findViewById(R.id.detail_team_name);
        detail_short_name=(TextView)findViewById(R.id.detail_short_name);
        detail_team_description=(TextView)findViewById(R.id.detail_team_description);
        detail_team_members=(TextView)findViewById(R.id.detail_team_members);

        detailImg.setImageResource(getIntent().getIntExtra("imagename",0));
        detail_team_name.setText(getIntent().getStringExtra("teamName"));
        detail_short_name.setText(getIntent().getStringExtra("ShortName"));
        detail_team_description.setText(getIntent().getStringExtra("TeamDescription"));
        detail_team_members.setText(getIntent().getStringExtra("teamMembers"));
    }
}
