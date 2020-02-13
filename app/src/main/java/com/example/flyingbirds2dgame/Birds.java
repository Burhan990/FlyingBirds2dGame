package com.example.flyingbirds2dgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import static com.example.flyingbirds2dgame.gameView.screenRatioX;
import static com.example.flyingbirds2dgame.gameView.screenRatioY;

public class Birds {

    public int speed = 20;
    public boolean wasShoot = true;
    int x = 0, y, width, height, counterBird = 1;
    Bitmap bird1, bird2, bird3, bird4;

    Birds(Resources res){

        bird1 = BitmapFactory.decodeResource(res, R.drawable.bird1);
        bird2 = BitmapFactory.decodeResource(res, R.drawable.bird2);
        bird3 = BitmapFactory.decodeResource(res, R.drawable.bird3);
        bird4 = BitmapFactory.decodeResource(res, R.drawable.bird4);

        width = bird1.getWidth();
        height = bird1.getHeight();

        width /= 6;
        height /= 6;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        bird1 = Bitmap.createScaledBitmap(bird1, width, height, false);
        bird2 = Bitmap.createScaledBitmap(bird2, width, height, false);
        bird3 = Bitmap.createScaledBitmap(bird3, width, height, false);
        bird4 = Bitmap.createScaledBitmap(bird4, width, height, false);

        y = -height;



    }

    Bitmap getBird(){

        if (counterBird==1){
            counterBird++;
            return bird1;
        }

        if (counterBird==2){
            counterBird++;
            return bird2;
        }
        if (counterBird==3){
            counterBird++;
            return bird3;
        }
        counterBird=1;

        return bird4;

    }

    Rect getCollutionShape(){
        return new Rect(x,y,x+width,y+height);
    }
}
