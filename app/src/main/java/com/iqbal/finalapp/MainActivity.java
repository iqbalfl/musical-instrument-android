package com.iqbal.finalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.iqbal.finalapp.layouts.DividerItemDecoration;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvMusicalInstrument;
    private ArrayList<MusicalInstrument> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMusicalInstrument = findViewById(R.id.rv_musical_instrument);
        rvMusicalInstrument.setHasFixedSize(true);
        rvMusicalInstrument.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL, 8));

        list.addAll(MusicalInstrumentData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMusicalInstrument.setLayoutManager(new LinearLayoutManager(this));
        MusicalInstrumentAdapter listInstrumentAdapter = new MusicalInstrumentAdapter(list);
        rvMusicalInstrument.setAdapter(listInstrumentAdapter);

        listInstrumentAdapter.setOnItemClickCallback(new MusicalInstrumentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(MusicalInstrument data) {
                actionSelectedInstrument(data);
            }
        });
    }

    private void actionSelectedInstrument(MusicalInstrument data) {
        Intent intent = new Intent(this, MusicalInstrumentDetailActivity.class);
        intent.putExtra("image", data.getPhoto());
        intent.putExtra("name", data.getName());
        intent.putExtra("description", data.getDetail());

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setAction(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setAction(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_profile:
                // intent profile
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            default:
                Toast.makeText(this, "Unknown", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
