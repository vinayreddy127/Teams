package com.example.reccardapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamsDetailedActivity : AppCompatActivity() {
    var detail_Img: ImageView? = null
    var detail_team_Name: TextView? = null
    var detail_short_Name: TextView? = null
    var detail_team_Description: TextView? = null
    var detail_team_Members: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teams_activity_main_detail)
        detail_Img = findViewById<View>(R.id.detail_img) as ImageView
        detail_team_Name = findViewById<View>(R.id.detail_team_name) as TextView
        detail_short_Name = findViewById<View>(R.id.detail_short_name) as TextView
        detail_team_Description = findViewById<View>(R.id.detail_team_description) as TextView
        detail_team_Members = findViewById<View>(R.id.detail_team_members) as TextView
        detail_Img!!.setImageResource(intent.getIntExtra("imagename", 0))
        detail_team_Name!!.text = intent.getStringExtra("teamName")
        detail_short_Name!!.text = intent.getStringExtra("shortName")
        detail_team_Description!!.text = intent.getStringExtra("teamDescription")
        detail_team_Members!!.text = intent.getStringExtra("teamMembers")
    }
}