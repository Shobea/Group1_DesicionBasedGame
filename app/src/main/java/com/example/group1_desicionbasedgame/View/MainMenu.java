package com.example.group1_desicionbasedgame.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group1_desicionbasedgame.R;

public class MainMenu extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button play,credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main_menu);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.intro);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        play=findViewById(R.id.toGame);
        credits=findViewById(R.id.toCredits);

        play.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        credits.setOnClickListener(v -> startActivity(new Intent(this, Credits.class)));
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}


