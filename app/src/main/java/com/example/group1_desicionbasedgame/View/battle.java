package com.example.group1_desicionbasedgame.View;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.group1_desicionbasedgame.Model.Hero;
import com.example.group1_desicionbasedgame.Model.Monster;
import com.example.group1_desicionbasedgame.R;

public class battle extends AppCompatActivity {
    TextView heroName, heroHP, heroMP;
    TextView monsterName, monsterHP, monsterMP;
    Button btn;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_battle);
    //Previous page (Buttons in main activity)
    btn1 = findViewById(R.id.button);
    btn2 = findViewById(R.id.button2);
    btn3 = findViewById(R.id.button3);
    btn4 = findViewById(R.id.button4);

    btn = findViewById(R.id.button5);

    heroName = findViewById(R.id.txtHeroName);
    heroHP = findViewById(R.id.txtHeroHealth);
    heroMP = findViewById(R.id.txtHeroMana);

    monsterName = findViewById(R.id.txtMonsterName);
    monsterHP = findViewById(R.id.txtMonsterHealth);
    monsterMP = findViewById(R.id.txtMonsterMana);

    Hero person =new Hero("Ambut",1000,1000,1000);
    Monster golem = new Monster("Golem", 2000, 300, 25);
    Monster highOrc = new Monster("High Orc", 2000, 300, 25);
    Monster naga = new Monster("Naga", 2000, 300, 25);
    Monster troll = new Monster("Troll", 2000, 300, 25);
    Monster direWolf = new Monster("Dire Wolf", 2000, 300, 25);
    Monster goblinChief = new Monster("Goblin Chief", 2000, 300, 25);
    Monster spectre = new Monster("Spectre", 2000, 300, 25);
    Monster ogre = new Monster("Ogre", 2000, 300, 25);

    heroName.setText(String.valueOf(person.getName()));
    heroHP.setText(String.valueOf(person.getHealth()));
    heroMP.setText(String.valueOf(person.getMana()));



}
}