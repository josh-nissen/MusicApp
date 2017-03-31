package com.android.nissen.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Josh Nissen on 3/30/2017.
 */

public class MusicLibraryActivity extends AppCompatActivity {

    private Button playingButton;
    private Button detailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_library);
        detailsButton = (Button) findViewById(R.id.detButton);
        playingButton = (Button) findViewById(R.id.playingButton);

        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicLibraryActivity.this, MusicDetailsActivity.class);
                startActivity(intent);

            }
        });

        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicLibraryActivity.this, MusicPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}