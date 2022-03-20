package com.example.group1_desicionbasedgame.View;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.group1_desicionbasedgame.R;

public class window extends Activity implements View.OnClickListener {

    Button windowBtn;
    int width,height;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);
        DisplayMetrics dm =new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        windowBtn=findViewById(R.id.buttonInWindow);
        windowBtn.setOnClickListener(this);
        width =dm.widthPixels;
        height=dm.heightPixels;

        getWindow().setLayout((int) (width*10), (int) (height*.8));
    }

    @Override
    public void onClick(View view) {

    }
}
