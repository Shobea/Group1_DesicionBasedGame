package com.example.group1_desicionbasedgame.View;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group1_desicionbasedgame.Model.Hero;
import com.example.group1_desicionbasedgame.Model.Monster;
import com.example.group1_desicionbasedgame.R;

import java.util.Objects;
import java.util.Random;

public class battle extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView heroName, heroHP;
    TextView monsterName, monsterHP;
    Button btn5;
    int counter = 0;
    int monsterHealth, personHealth;

    Hero person = new Hero("Ambut", 700, 40, 80);
    Monster allMonster = new Monster(75, 125);
    Monster troll = new Monster("Troll", 500);
    Monster ogre = new Monster("Ogre", 500);
    Monster direWolf = new Monster("Dire Wolf", 650);
    Monster goblin = new Monster("Goblin", 650);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_battle);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dungeon);
        mediaPlayer.start();

        heroName = findViewById(R.id.txtHeroName);
        heroHP = findViewById(R.id.txtHeroHealth);
        monsterName = findViewById(R.id.txtMonsterName);
        monsterHP = findViewById(R.id.txtMonsterHealth);
        heroName.setText(String.valueOf(person.getName()));
        heroHP.setText(String.valueOf(person.getHealth()));
        personHealth = person.getHealth();

        btn5 = findViewById(R.id.button5);

        switch (getIntent().getIntExtra("clicked", 1)) {
            case 1:
                Toast.makeText(this, "Troll has appeared! Defeat it to escape the dungeon!", Toast.LENGTH_LONG).show();
                monsterName.setText(String.valueOf(troll.getName()));
                monsterHP.setText(String.valueOf(troll.getHealth()));
                monsterHealth = troll.getHealth();
                personDPS();
                break;
            case 2:
                Toast.makeText(this, "Ogre has appeared! Defeat it to escape the dungeon!", Toast.LENGTH_SHORT).show();
                monsterName.setText(String.valueOf(ogre.getName()));
                monsterHP.setText(String.valueOf(ogre.getHealth()));
                monsterHealth = ogre.getHealth();
                personDPS();
                break;
            case 3:
                Toast.makeText(this, "Dire wolf has appeared! Defeat it to escape the dungeon!", Toast.LENGTH_SHORT).show();
                monsterName.setText(String.valueOf(direWolf.getName()));
                monsterHP.setText(String.valueOf(direWolf.getHealth()));
                monsterHealth = direWolf.getHealth();
                personDPS();
                break;
            case 4:
                Toast.makeText(this, "Goblin has appeared! Defeat it to escape the dungeon!", Toast.LENGTH_SHORT).show();
                monsterName.setText(String.valueOf(goblin.getName()));
                monsterHP.setText(String.valueOf(goblin.getHealth()));
                monsterHealth = goblin.getHealth();
                personDPS();
                break;
        }
    }

    public void personDPS() {
        btn5.setOnClickListener(view -> {
            ++counter;
            Random randomizer = new Random();
            if (counter % 2 == 1) {
                int personDPS = randomizer.nextInt(person.getMaxAtk() - person.getMinAtk()) + person.getMinAtk();
                monsterHealth = monsterHealth - personDPS;
                monsterHP.setText(String.valueOf(monsterHealth));
            } else if (counter % 2 == 0) {
                int monsterDPS = randomizer.nextInt(allMonster.getMaxAtk() - allMonster.getMinAtk()) + allMonster.getMinAtk();
                personHealth = personHealth - monsterDPS;
                heroHP.setText(String.valueOf(personHealth));
            }
            if (monsterHealth <= 0) {
                monsterHP.setText("0");
                btn5.setVisibility(View.GONE);
            }
            else if (personHealth <= 0) {
                heroHP.setText("0");
                btn5.setVisibility(View.GONE);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();

    }
}