package com.example.group1_desicionbasedgame.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.group1_desicionbasedgame.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PopupWindow popupWindow;
    private RelativeLayout relativeLayout;
    private LayoutInflater layoutInflater;
    Button btn1, btn2, btn3, btn4;
    int decision, turn, option,select;
    TextView text;
    String choice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        //buttons
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);

        text = findViewById(R.id.textView2);

        relativeLayout=(RelativeLayout)findViewById(R.id.relative);

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
        turn++;
        switch (view.getId()) {
            case R.id.button:
                option = 1;
                if (turn == 1) {
                    decision = 1;
                    select=5;
                }
                dialogueText();
                break;
            case R.id.button2:
                option = 2;
                if (turn == 1) {
                    decision = 2;
                    select=6;
                }
                dialogueText();
                break;
            case R.id.button3:
                option = 3;
                if (turn == 1) {
                    decision = 3;
                    select=7;
                }
                dialogueText();
                break;
            case R.id.button4:
                option = 4;
                if (turn == 1) {
                    decision = 4;
                    select=8;
                }
                dialogueText();
                break;
        }
    }

    @SuppressLint("SetTextI18n")
    public void dialogueText() {
        if (decision == 1 && turn == 1) { //choice 1
            choice = "You decided to enter the room in the far left. \n" +
                    "\n" +
                    "Upon entering, you see a sleeping man in the distance. \n" +
                    "\n" +
                    "What will you do? \n";
            text.setText(choice);
            btn1.setText("1.Steal his items \n");
            btn2.setText("2.Ignore him and explore the room\n");
            btn3.setText("3. Wake him up\n");
            btn4.setText("4. Observe him\n");
        } else if (decision == 1 && turn == 2 && option == 1) { //1.1
            choice = "You approached the man and decided to steal his things that were scattered on the floor. Because of the noise you were making, he woke up.  \n" +
                    "What will you do?";
            text.setText(choice);
            btn1.setText("Continue to steal his items"); //3rd
            btn2.setText("Ask why you are inside the dungeon.");
            btn3.setText("Help him get up");
            btn4.setText("Attack man");
        } else if (decision == 1 && turn == 2 && option == 2) { //1.2
            choice = "You decided to ignore him and search for useful items in the room.\n " +
                    "You accidentally tripped over a rock which led you to fall.\n " +
                    "Because of the noise that you made, the man wake wakes.  \n";
            text.setText(choice);
            btn1.setText("1. Ask help from him  \n");
            btn2.setText("2.Stand up\n ");
            btn3.setText("3. Ask why you are inside the dungeon\n ");
            btn4.setText("4. Attack man\n ");
        } else if (decision == 1 && turn == 2 && option == 3) { //1.3
            choice = "You wanted to wake him up to ask why you were trapped in the dungeon. \n " +
                    " \n-You notice the man's weird body proportion and huge scars. You... ";
            text.setText(choice);
            btn1.setText("1.Ask what happened  \n");
            btn2.setText("2.Ask why he is here ");
            btn3.setText("3. Ask if he is okay ");
            btn4.setText("4. Attack man ");
        } else if (decision == 1 && turn == 2 && option == 4) { //1.4
            choice = "You decided to observe him for a while.\n" +
                    " He suddenly shouts in pain. You...\n ";
            text.setText(choice);
            btn1.setText("1.Leave the room  \n");
            btn2.setText("2.Approach the man ");
            btn3.setText("3. Help the man ");
            btn4.setText("4. Attack man ");
        } else if ( decision == 1 || turn == 2 && option == 4 ||  select!=5 &&select!=6 &&select!=7 &&select!=8) { //1.4
            choice="The man is actually a troll! Prepare to fight.";
            text.setText(choice);
            buttonStateDisable();
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        if (decision == 1 && turn == 1) { //choice 1
            choice = "You decided to enter the room in the far left. \n" +
                    "\n" +
                    "Upon entering, you see a sleeping man in the distance. \n" +
                    "\n" +
                    "What will you do? \n";
            text.setText(choice);
            btn1.setText("1.Steal his items \n");
            btn2.setText("2.Ignore him and explore the room\n");
            btn3.setText("3. Wake him up\n");
            btn4.setText("4. Observe him\n");
        } else if (decision == 1 && turn == 2 && option == 1) { //1.1
            choice = "You approached the man and decided to steal his things that were scattered on the floor. Because of the noise you were making, he woke up.  \n" +
                    "What will you do?";
            text.setText(choice);
            btn1.setText("Continue to steal his items"); //3rd
            btn2.setText("Ask why you are inside the dungeon.");
            btn3.setText("Help him get up");
            btn4.setText("Attack man");
        } else if (decision == 1 && turn == 2 && option == 2) { //1.2
            choice = "You decided to ignore him and search for useful items in the room.\n " +
                    "You accidentally tripped over a rock which led you to fall.\n " +
                    "Because of the noise that you made, the man wake wakes.  \n";
            text.setText(choice);
            btn1.setText("1. Ask help from him  \n");
            btn2.setText("2.Stand up\n ");
            btn3.setText("3. Ask why you are inside the dungeon\n ");
            btn4.setText("4. Attack man\n ");
        } else if (decision == 1 && turn == 2 && option == 3) { //1.3
            choice = "You wanted to wake him up to ask why you were trapped in the dungeon. \n " +
                    " \n-You notice the man's weird body proportion and huge scars. You... ";
            text.setText(choice);
            btn1.setText("1.Ask what happened  \n");
            btn2.setText("2.Ask why he is here ");
            btn3.setText("3. Ask if he is okay ");
            btn4.setText("4. Attack man ");
        } else if (decision == 1 && turn == 2 && option == 4) { //1.4
            choice = "You decided to observe him for a while.\n" +
                    " He suddenly shouts in pain. You...\n ";
            text.setText(choice);
            btn1.setText("1.Leave the room  \n");
            btn2.setText("2.Approach the man ");
            btn3.setText("3. Help the man ");
            btn4.setText("4. Attack man ");
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (decision == 2 && turn == 1) { //choice 3
            choice = "You decided to follow the hallway on the left. The room is full of various weapons.  \n" +
                    "\n" +
                    "What will you do? ";
            text.setText(choice);
            btn1.setText("Take stronger shield");
            btn2.setText("Take heavy mace");
            btn3.setText("Take sharp dagger");
            btn4.setText("Take minotaur’s axe");
        } else if (decision == 2 && turn == 2 && option == 1) { //3.1
            choice = "You replaced your shield with a new one. What will you do next? ";
            text.setText(choice);
            btn1.setText("Continue searching for items "); //3rd
            btn2.setText("Check for damages on the shield ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a short break ");
        } else if (decision == 2 && turn == 2 && option == 2) { //3.2
            choice = "You replaced your sword with a heavy mace. What will you do next?  ";
            text.setText(choice);
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        } else if (decision == 2 && turn == 2 && option == 3) { //3.3
            choice = "You replaced your sword with a spear. What will you do next? ";
            text.setText(choice);
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");

        } else if (decision == 2 && turn == 2 && option == 4) { //3.4
            choice = "You replaced your sword with a minotaur’s axe. What will you do next?";
            text.setText(choice);
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        }
        else if ( decision == 2 || turn == 2 && option == 4 ||  select!=5 &&select!=6 &&select!=7 &&select!=8) { //1.4
            choice = "habadabadoo.";
            text.setText(choice);
            buttonStateDisable();
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (decision == 3 && turn == 1) { //choice 1
            choice = "You followed the hallway on the right. You found a stronger sword. \n" +
                    "\n" +
                    "What will you do? ";
            text.setText(choice);
            btn1.setText("Equip sword and enter left cage");
            btn2.setText("Equip sword and follow right hallway");
            btn3.setText("Do not equip sword and enter left cage");
            btn4.setText("Do not equip sword and follow right hallway");
        } else if (decision == 3 && turn == 2 && option == 1) { //1.1
            choice = "You replaced your sword with the one that you found and decided to enter the left cage. The room is filled with treasures and chests. You... ";
            text.setText(choice);
            btn1.setText("Open wooden chest "); //3rd
            btn2.setText("Open steel box ");
            btn3.setText("Take gold coins from the floor ");
            btn4.setText("Look for weapons ");
        } else if (decision == 3 && turn == 2 && option == 2) { //1.2
            choice = "You replaced your sword with the one that you found and decided to follow the right hallway. You were greeted by a foul stench. As you scanned the room, you saw carcasses scattered everywhere. You... ";
            text.setText(choice);
            btn1.setText("Scream "); //3rd
            btn2.setText("Explore the room ");
            btn3.setText("Scavenge for food ");
            btn4.setText("Leave the room ");
        } else if (decision == 3 && turn == 2 && option == 3) { //1.3
            choice = "You wanted to wake him up to ask why you were trapped in the dungeon. \n " +
                    " \n-You notice the man's weird body proportion and huge scars. You... ";
            text.setText(choice);
            btn1.setText("Open wooden chest "); //3rd
            btn2.setText("Open steel box ");
            btn3.setText("Take gold coins from the floor ");
            btn4.setText("Look for weapons ");
        } else if (decision == 3 && turn == 2 && option == 4) { //1.4
            choice = "You decided to observe him for a while.\n" +
                    " He suddenly shouts in pain. You...\n ";
            text.setText(choice);
            btn1.setText("Scream "); //3rd
            btn2.setText("Explore the room ");
            btn3.setText("Scavenge for food ");
            btn4.setText("Leave the room ");
        }
        else if ( decision == 3 || turn == 2 && option == 4 ||  select!=5 &&select!=6 &&select!=7 &&select!=8) { //1.4
            choice = "Ackdog";
            text.setText(choice);
            buttonStateDisable();
        }
        if (decision == 4 && turn == 1) { //choice 2
            choice = "You entered the room on the far right and found a stronger shield. What will you do? \n" +
                    "\n" +
                    "What will you do? ";
            text.setText(choice);
            btn1.setText("Equip shield and follow left hallway");
            btn2.setText("Equip shield and enter right cage");
            btn3.setText("Do not equip shield and follow left hallway");
            btn4.setText("Do not equip shield and enter right cage");
        } else if (decision == 4 && turn == 2 && option == 1) { //2.1
            choice = "You replaced your shield with the one that you found and decided to follow the left hallway. The hallway was filled with valuable ore! You grabbed the pickaxe that was lying on the floor and... ";
            text.setText(choice);
            btn1.setText("Mine gold "); //3rd
            btn2.setText("Mine corundum ");
            btn3.setText("Mine serendibite ");
            btn4.setText("Mine painite ");
        } else if (decision == 4 && turn == 2 && option == 2) { //2.2
            choice = "You replaced your shield with the one that you found and decided to enter the right cage. As you went inside, the cage gets shut. You... ";
            text.setText(choice);
            btn1.setText("Bang the door and shout  ");
            btn2.setText("Kick the cage ");
            btn3.setText("Examine cage ");
            btn4.setText("Rummage cage ");
        } else if (decision == 4 && turn == 2 && option == 3) { //2.3
            choice = "You kept your old shield and decided to follow the left hallway. The hallway was filled with valuable ore! You grabbed the pickaxe that was lying on the floor and... ";
            text.setText(choice);
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");

        } else if (decision == 4 && turn == 2 && option == 4) { //2.4
            choice = "You kept your old shield and decided to enter the right cage. As you went inside, the cage gets shut. You...  ";
            text.setText(choice);
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        }
        else if ( decision == 4 || turn == 2 && option == 4 ||  select!=5 &&select!=6 &&select!=7 &&select!=8) { //1.4
            choice = "The man is actually a troll! Prepare to fight.";
            text.setText(choice);
            buttonStateDisable();
        }



//    public void Hehe(View view) {
//        btn1.setOnClickListener(v -> startActivity(new Intent(this,battle.class).putExtra("clicked",1)));
//    }
    //Layer3
    //Disable buttons, pop up screen with button to proceed to battle
    //add music
    //add animated text
    //link to battle activity
}

    private void buttonStateDisable() {
        btn1.setVisibility(View.GONE);
        btn2.setVisibility(View.GONE);
        btn3.setVisibility(View.GONE);
        btn4.setVisibility(View.GONE);
        startActivity(new Intent(MainActivity.this,window.class));
    }
    }

