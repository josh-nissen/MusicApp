package com.android.nissen.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Josh Nissen on 3/30/2017.
 */

public class MusicPlayingActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;
    private ImageButton playButton;
    private ImageButton pauseButton;
    private ImageButton stopButton;
    private Button detailsButton;
    private Button libraryButton;
    private boolean isStopped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_playing);

        mPlayer = MediaPlayer.create(this, R.raw.tfk_courtesy_call);
        playButton = (ImageButton) findViewById(R.id.play_button);
        pauseButton = (ImageButton) findViewById(R.id.pause_button);
        stopButton = (ImageButton) findViewById(R.id.stop_button);
        detailsButton = (Button) findViewById(R.id.songButton);
        libraryButton = (Button) findViewById(R.id.libButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isStopped == true) {
                    mPlayer = MediaPlayer.create(MusicPlayingActivity.this, R.raw.tfk_courtesy_call);
                    isStopped = false;
                }
                mPlayer.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.pause();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.stop();
                isStopped = true;
            }
        });

        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicPlayingActivity.this, MusicDetailsActivity.class);
                startActivity(intent);

            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusicPlayingActivity.this, MusicLibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}