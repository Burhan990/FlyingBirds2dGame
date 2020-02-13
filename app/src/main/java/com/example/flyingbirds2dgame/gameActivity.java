package com.example.flyingbirds2dgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.WindowManager;

public class gameActivity extends AppCompatActivity {

    private gameView game_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Point point=new Point();

        getWindowManager().getDefaultDisplay().getSize(point);

        game_View=new gameView(this,point.x,point.y);

        setContentView(game_View);
    }

    @Override
    protected void onPause() {
        super.onPause();
        game_View.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        game_View.resume();
    }
}
