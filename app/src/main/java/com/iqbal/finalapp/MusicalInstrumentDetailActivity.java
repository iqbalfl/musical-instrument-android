package com.iqbal.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MusicalInstrumentDetailActivity extends AppCompatActivity {

    TextView txtName, txtDescription;
    ImageView imgInstrument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_instrument_detail);

        txtName = findViewById(R.id.text_name);
        txtDescription = findViewById(R.id.text_desc);
        imgInstrument = findViewById(R.id.image_instrument);

        // ambil data dari intent
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", 0);

        // set to view
        txtName.setText(name);
        txtDescription.setText(description);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail "+name);
        }

        Glide.with(getApplicationContext())
                .load(image)
                .into(imgInstrument);
    }
}
