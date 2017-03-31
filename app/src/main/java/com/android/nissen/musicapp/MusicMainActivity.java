package com.android.nissen.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Josh Nissen on 3/30/2017.
 */

public class MusicMainActivity extends AppCompatActivity {
    private TextView mMuiscLibrary;
    private TextView mNowPlaying;
    private TextView mRandomSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_main);

        mMuiscLibrary = (TextView) findViewById(R.id.music_library);
        mNowPlaying = (TextView) findViewById(R.id.now_playing);
        mRandomSong = (TextView) findViewById(R.id.random_song);


        mMuiscLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicMainActivity.this, MusicLibraryActivity.class);
                startActivity(intent);

            }
        });

        mNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicMainActivity.this, MusicPlayingActivity.class);
                startActivity(intent);
            }
        });

        mRandomSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicMainActivity.this, MusicPlayingActivity.class);
                startActivity(intent);
            }
        });



    }
}
