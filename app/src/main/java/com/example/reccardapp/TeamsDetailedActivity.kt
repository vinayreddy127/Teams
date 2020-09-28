package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamsDetailedActivity extends AppCompatActivity
{
   ImageView detail_Img;
   TextView detail_team_Name,detail_short_Name, detail_team_Description, detail_team_Members;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams_activity_main_detail);

        detail_Img=(ImageView)findViewById(R.id.detail_img);
        detail_team_Name=(TextView)findViewById(R.id.detail_team_name);
        detail_short_Name=(TextView)findViewById(R.id.detail_short_name);
        detail_team_Description=(TextView)findViewById(R.id.detail_team_description);
        detail_team_Members=(TextView)findViewById(R.id.detail_team_members);

        detail_Img.setImageResource(getIntent().getIntExtra("imagename",0));
        detail_team_Name.setText(getIntent().getStringExtra("teamName"));
        detail_short_Name.setText(getIntent().getStringExtra("shortName"));
        detail_team_Description.setText(getIntent().getStringExtra("teamDescription"));
        detail_team_Members.setText(getIntent().getStringExtra("teamMembers"));
    }
}
