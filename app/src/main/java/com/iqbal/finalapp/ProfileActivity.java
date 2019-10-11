package com.iqbal.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    CircleImageView imageProfile;
    ImageView icGithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageProfile = findViewById(R.id.image_profile);

        Glide.with(getApplicationContext())
                .load(R.drawable.profile)
                .into(imageProfile);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Profile");
        }

        icGithub = findViewById(R.id.ic_github);
        icGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/iqbalfl/musical-instrument-android"));
                startActivity(browserIntent);
            }
        });
    }
}
