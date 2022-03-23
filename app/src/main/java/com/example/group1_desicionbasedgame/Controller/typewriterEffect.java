package com.example.group1_desicionbasedgame.Controller;

import android.os.Handler;
import android.widget.TextView;

public class typewriterEffect {
    private String sText = "";
    private int index;
    private final long mDelay = 50;

    TextView textView;

    public typewriterEffect(TextView tView) {
        textView = tView;
    }

    public void animateText(String string) {
        sText = string;
        index = 0;

        textView.setText("");


        new Handler().removeCallbacks(characterAdder);
        new Handler().postDelayed(characterAdder, mDelay);

        }

    private final Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            textView.setText(sText.subSequence(0, index++));

            if (index <= sText.length()) {
                new Handler().postDelayed(characterAdder, mDelay);
            }
        }
    };
}
