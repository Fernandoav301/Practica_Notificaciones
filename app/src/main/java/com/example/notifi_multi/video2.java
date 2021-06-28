package com.example.notifi_multi;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class video2 extends AppCompatActivity {
    Button reproducir, pause, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
        reproducir= (Button)findViewById(R.id.btn1);
        pause= (Button)findViewById(R.id.pause);
        stop= (Button)findViewById(R.id.stop);

        Uri myUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        VideoView videoView = (VideoView) findViewById(R.id.video);
        videoView.setVideoURI(myUri);
        videoView.setMediaController(new MediaController( this));
        videoView.requestFocus();


        reproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }

        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                videoView.seekTo(0 );
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });
    }


}