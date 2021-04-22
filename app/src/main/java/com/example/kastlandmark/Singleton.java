package com.example.kastlandmark;

import android.graphics.Bitmap;

public class Singleton {

    Bitmap chosenImg;
    private static Singleton singleton;

    private Singleton(){
    }

    public Bitmap getChosenImg() {
        return chosenImg;
    }

    public void setChosenImg(Bitmap chosenImg) {
        this.chosenImg = chosenImg;
    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
            return singleton;

    }

}




