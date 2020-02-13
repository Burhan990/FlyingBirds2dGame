package com.example.flyingbirds2dgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.example.flyingbirds2dgame.gameView.screenRatioX;
import static com.example.flyingbirds2dgame.gameView.screenRatioY;

public class Bullet {

    int x,y,width,height;
    Bitmap bullet;

    Bullet(Resources res){
        bullet= BitmapFactory.decodeResource(res,R.drawable.bullet);
        width=bullet.getWidth();
        height=bullet.getHeight();

        width /=4;
        height /=4;

        width=(int)(width * screenRatioX);
        height=(int) (height * screenRatioY);
        bullet=Bitmap.createScaledBitmap(bullet,width,height,false);
    }

    Rect getCollutionShape(){
        return new Rect(x,y,x+width,y+height);
    }
}
