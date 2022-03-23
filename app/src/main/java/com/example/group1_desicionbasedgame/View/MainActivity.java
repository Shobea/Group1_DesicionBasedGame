package com.example.group1_desicionbasedgame.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.group1_desicionbasedgame.Controller.typewriterEffect;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;

import com.example.group1_desicionbasedgame.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    MediaPlayer mediaPlayer;
    Button btn1, btn2, btn3, btn4, battleBtn;
    ImageView border;
    int decision, turn, option,select;
    private TextView story,end;
    public typewriterEffect writer;
    String choice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //music
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dungeon);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        //textview
        story = findViewById(R.id.storylines);
        writer=new typewriterEffect(story);
        end=findViewById(R.id.ending);

        //buttons
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        battleBtn=findViewById(R.id.btnbattle);

        //image
        border=findViewById(R.id.imageView);

         story.setText("You wake up in inside a dark room. \n" + " “Where am I?” \n"
                 + "As your eyesight adjusts to the darkness of the room, you see that you are inside a dungeon. You see four openings in front of you. \n" +
                 " “I won’t be able to survive if I stay here” \n" + "Due to your curiosity, you decided to explore the dungeon. \n" +
                 "Where will you go?\n");

        btn1.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);
        btn4.setOnClickListener(this::onClick);

    }

    public void onClick(View view) {
        turn++;
        switch (view.getId()) {
            case R.id.button:
                option = 1; // option is equivalent to the 3rd layer
                if (turn == 1) { // turn is equivalent to the layers
                    decision = 1; // decision is equivalent to the 1st layer
                    select=5;// select is equivalent to the button that is pressed in the 3rd layer
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
            text();
            btn1.setText("Steal his items");
            btn2.setText("Ignore him and explore the room");
            btn3.setText("Wake him up");
            btn4.setText("Observe him");
        } else if (decision == 1 && turn == 2 && option == 1) { //1.1
            choice = "You approached the man and decided to steal his things that were scattered on the floor. Because of the noise you were making, he woke up.  \n" +
                    "What will you do?";
            text();
            btn1.setText("Continue to steal his items"); //3rd
            btn2.setText("Ask why you are inside the dungeon.");
            btn3.setText("Help him get up");
            btn4.setText("Attack man");
        } else if (decision == 1 && turn == 2 && option == 2) { //1.2
            choice = "You decided to ignore him and search for useful items in the room.\n " +
                    "You accidentally tripped over a rock which led you to fall.\n " +
                    "Because of the noise that you made, the man wakes up. You... \n";
            text();
            btn1.setText(" Ask help from him");
            btn2.setText("Stand up ");
            btn3.setText(" Ask why you are inside the dungeon ");
            btn4.setText(" Attack man ");
        } else if (decision == 1 && turn == 2 && option == 3) { //1.3
            choice = "You wanted to wake him up to ask why you were trapped in the dungeon. \n " +
                    " \n-You notice the man's weird body proportion and huge scars. You... ";
            text();
            btn1.setText("Ask what happened ");
            btn2.setText("Ask why he is here ");
            btn3.setText(" Ask if he is okay ");
            btn4.setText(" Attack man ");
        } else if (decision == 1 && turn == 2 && option == 4) { //1.4
            choice = "You decided to observe him for a while.\n" +
                    " He suddenly shouts in pain. You...\n ";
            text();
            btn1.setText("Leave the room ");
            btn2.setText("Approach the man ");
            btn3.setText("Help the man ");
            btn4.setText("Attack man ");
        }else if (decision==1 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            buttonStateDisable();
        }

        /////////////////////////////////////////////////////////////////////////

        if (decision == 2 && turn == 1) { //choice 2
            choice = "You decided to follow the hallway on the left. The room is full of various weapons.  \n" +
                    "\n" +
                    "What will you do? ";
            text();
            btn1.setText("Take stronger shield");
            btn2.setText("Take heavy mace");
            btn3.setText("Take spear");
            btn4.setText("Take minotaur’s axe");
        } else if (decision == 2 && turn == 2 && option == 1) { //2.1
            choice = "You replaced your shield with a new one. What will you do next? ";
            text();
            btn1.setText("Continue searching for items "); //3rd
            btn2.setText("Check for damages on the shield ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a short break ");
        } else if (decision == 2 && turn == 2 && option == 2) { //2.2
            choice = "You replaced your sword with a heavy mace. What will you do next?  ";
            text();
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        } else if (decision == 2 && turn == 2 && option == 3) { //2.3
            choice = "You replaced your sword with a spear. What will you do next? ";
            text();
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        } else if (decision == 2 && turn == 2 && option == 4) { //2.4
            choice = "You replaced your sword with a minotaur’s axe. What will you do next?";
            text();
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        }else if (decision==2 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            buttonStateDisable();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (decision == 3 && turn == 1) { //choice 3
            choice = "You followed the hallway on the right. You found a stronger sword. \n" +
                    "\n" +
                    "What will you do? ";
            text();
            btn1.setText("Equip sword and enter left cage");
            btn2.setText("Equip sword and follow right hallway");
            btn3.setText("Do not equip sword and enter left cage");
            btn4.setText("Do not equip sword and follow right hallway");
        } else if (decision == 3 && turn == 2 && option == 1) { //3.1
            choice = "You replaced your sword with the one that you found and decided to enter the left cage. The room is filled with treasures and chests. You... ";
            text();
            btn1.setText("Open wooden chest ");
            btn2.setText("Open steel box ");
            btn3.setText("Take gold coins from the floor ");
            btn4.setText("Look for weapons ");
        } else if (decision == 3 && turn == 2 && option == 2) { //3.2
            choice = "You replaced your sword with the one that you found and decided to follow the right hallway. You were greeted by a foul stench. As you scanned the room, you saw carcasses scattered everywhere. You... ";
            text();
            btn1.setText("Scream "); //3rd
            btn2.setText("Explore the room ");
            btn3.setText("Scavenge for food ");
            btn4.setText("Leave the room ");
        } else if (decision == 3 && turn == 2 && option == 3) { //3.3
            choice = "You kept your old sword and decided to enter the left cage. The room is filled with treasures and chests. You... ";
            text();
            btn1.setText("Open wooden chest "); //3rd
            btn2.setText("Open steel box ");
            btn3.setText("Take gold coins from the floor ");
            btn4.setText("Look for weapons ");
        } else if (decision == 3 && turn == 2 && option == 4) { //3.4
            choice = "You kept your old sword and decided to follow the right hallway. You were greeted by a foul stench. As you scanned the room, you saw carcasses scattered everywhere. You... ";
            text();
            btn1.setText("Scream "); //3rd
            btn2.setText("Explore the room ");
            btn3.setText("Scavenge for food ");
            btn4.setText("Leave the room ");
        } else if (decision==3 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            buttonStateDisable();
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (decision == 4 && turn == 1) { //choice 4
            choice = "You entered the room on the far right and found a stronger shield. What will you do? \n" +
                    "\n" +
                    "What will you do? ";
            text();
            btn1.setText("Equip shield and follow left hallway");
            btn2.setText("Equip shield and enter right cage");
            btn3.setText("Do not equip shield and follow left hallway");
            btn4.setText("Do not equip shield and enter right cage");
        } else if (decision == 4 && turn == 2 && option == 1) { //4.1
            choice = "You replaced your shield with the one that you found and decided to follow the left hallway. The hallway was filled with valuable ore! You grabbed the pickaxe that was lying on the floor and... ";
            text();
            btn1.setText("Mine gold "); //3rd
            btn2.setText("Mine corundum ");
            btn3.setText("Mine serendibite ");
            btn4.setText("Mine painite ");
        } else if (decision == 4 && turn == 2 && option == 2) { //4.2
            choice = "You replaced your shield with the one that you found and decided to enter the right cage. As you went inside, the cage gets shut. You... ";
            text();
            btn1.setText("Bang the door and shout  ");
            btn2.setText("Kick the cage ");
            btn3.setText("Examine cage ");
            btn4.setText("Rummage cage ");
        } else if (decision == 4 && turn == 2 && option == 3) { //4.3
            choice = "You kept your old shield and decided to follow the left hallway. The hallway was filled with valuable ore! You grabbed the pickaxe that was lying on the floor and... ";
            text();
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");

        } else if (decision == 4 && turn == 2 && option == 4) { //4.4
            choice = "You kept your old shield and decided to enter the right cage. As you went inside, the cage gets shut. You...  ";
            text();
            btn1.setText("Continue searching for items ");
            btn2.setText("Test item, swing it around ");
            btn3.setText("Leave the room ");
            btn4.setText("Take a break ");
        } else if (decision==4 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            buttonStateDisable();
        }

}private void buttonStateDisable() {
        btn1.setVisibility(View.GONE);
        btn2.setVisibility(View.GONE);
        btn3.setVisibility(View.GONE);
        btn4.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        battleBtn.setVisibility(View.VISIBLE);
        end.setVisibility(View.VISIBLE);
        border.setVisibility(View.VISIBLE);
        if (decision==1 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)) {
            end.setText("As your eyes met, you realized that the man is a troll!");
            battleBtn.setOnClickListener(v -> startActivity(new Intent(this, battle.class).putExtra("clicked", 1)));
        }else if (decision==2 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            end.setText("An ogre suddenly enters the room!");
            battleBtn.setOnClickListener(v -> startActivity(new Intent(this,battle.class).putExtra("clicked",2)));
        } else if (decision==3 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            end.setText("A dire wolf suddenly appears!");
            battleBtn.setOnClickListener(v -> startActivity(new Intent(this,battle.class).putExtra("clicked",3)));
        } else if (decision==4 && turn==3 && (option==1||option==2||option==3||option==4) && (select==5||select==6||select==7||select==8)){
            end.setText("Because of the noise, a goblin appears!");
            battleBtn.setOnClickListener(v -> startActivity(new Intent(this,battle.class).putExtra("clicked",4)));
        }
    }
    public void text (){
        writer.animateText(choice);
        story.setText(choice);
        Animation fade =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.animation);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn1.startAnimation(fade);
        btn2.startAnimation(fade);
        btn3.startAnimation(fade);
        btn4.startAnimation(fade);
        }
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
