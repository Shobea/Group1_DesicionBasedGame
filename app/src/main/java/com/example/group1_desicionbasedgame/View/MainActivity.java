package com.example.group1_desicionbasedgame.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.group1_desicionbasedgame.R;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    int decision;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        //buttons
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);

        text=findViewById(R.id.textView2);

        String setting =

                "You wake up in inside a dark room. \n" + " “Where am I?” \n"
                        + "As your eyesight adjusts to the darkness of the room, you see that you are inside a dungeon. You see four openings in front of you. \n" +
                        " “I won’t be able to survive if I stay here” \n" + "Due to your curiosity, you decided to explore the dungeon. \n" +
                        "You decided to explore the dungeon and check where the openings will lead you. \n" +
                        "Where will you go\n" +
                        "\n1. Enter room in the far left." +
                        "\n2. Follow hallway on the left" +
                        "\n3. Follow hallway on the right" +
                        "\n4. Enter room in the far right";

        //set listeners
        text.setText(setting);
        btn1.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);
        btn4.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {

        String choice = "";

        switch (view.getId()) {
            case R.id.button:
                decision = 1;
                if (decision == 1) { //1st layer
                    choice = "You decided to enter the room in the far left. \n" +
                            "\n" +
                            "Upon entering, you see a sleeping man in the distance. \n" +
                            "\n" +
                            "What will you do? \n";
                    text.setText(choice);
                    btn1.setText("1.Steal his items \n");
                    btn2.setText("2.Ignore him and explore the room");
                    btn3.setText("Wake him up");
                    btn4.setText("Observe him");
                    break;
                }
                    switch (view.getId()) {
                        case R.id.button://2nd layer
                            choice = "You approached the man and decided to steal his things that were scattered on the floor. Because of the noise you were making, he woke up.  \n"+
                                    "What will you do?";
                            text.setText(choice);
                            btn1.setText("Continue to steal his items"); //3rd
                            btn2.setText("Ask why you are inside the dungeon.");
                            btn3.setText("Help him get up");
                            btn4.setText("Attack man");
                            break;

                        case R.id.button2://2nd layer
                            choice = "You decided to ignore him and search for useful items in the room. You accidentally tripped over a rock which led you to fall. Because of the noise that you made, the man wake wakes.";
                            text.setText(choice);
                            btn1.setText("Ask help from him");
                            btn2.setText("Stand up \n");
                            btn3.setText("Ask why you are inside the dungeon");
                            btn4.setText("Attack man ");
                            break;

                        case R.id.button3://2nd layer
                            choice = "You wanted to wake him up to ask why you were trapped in the dungeon. -You notice the man's weird body proportion and huge scars. You... \n";
                            text.setText(choice);
                            btn1.setText("Ask what happened");
                            btn2.setText("Ask why he is here");
                            btn3.setText("Ask if he is okay");
                            btn4.setText("Attack man");
                            break;

                        case R.id.button4://2nd layer
                            choice = "You decided to observe him for a while. He suddenly shouts in pain. You... \n";
                            text.setText(choice);
                            btn1.setText("Leave the room");
                            btn2.setText("Approach the man");
                            btn3.setText("Help the man");
                            btn4.setText("Attack the man");
                            break;
                    }



            case R.id.button2:
                decision = 2;
                if (decision == 2) { //1st layer
                    choice = "You decided to enter the room in the far left. \n" +
                            "\n" +
                            "Upon entering, you see a sleeping man in the distance. \n" +
                            "\n" +
                            "What will you do? \n";
                    text.setText(choice);
                    btn1.setText("1.Steal his items \n");
                    btn2.setText("2.Ignore him and explore the room");
                    btn3.setText("Wake him up");
                    btn4.setText("Observe him");
                    break;
                }
        }
    }
}
