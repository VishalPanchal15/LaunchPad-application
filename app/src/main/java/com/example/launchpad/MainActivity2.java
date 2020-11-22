package com.example.launchpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int tune1;
    private int tune2;
    private int tune3;
    private int tune4;
    private int tune5, tune6, tune7, tune8, tune9, tune10, tune11, tune12, tune13, tune14, tune15, tune16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.sound1,1);
        sound2 = sp.load(getApplicationContext(),R.raw.sound2,1);
        sound3 = sp.load(getApplicationContext(),R.raw.sound3,1);
        sound4 = sp.load(getApplicationContext(),R.raw.sound4,1);
        sound5 = sp.load(getApplicationContext(),R.raw.sound5,1);
        sound6 = sp.load(getApplicationContext(),R.raw.sound6,1);
        sound7 = sp.load(getApplicationContext(),R.raw.sound7,1);
        sound8 = sp.load(getApplicationContext(),R.raw.sound8,1);
        sound9 = sp.load(getApplicationContext(),R.raw.sound9,1);
        tune1 = sp.load(getApplicationContext(),R.raw.tune1, 1);
        tune2 = sp.load(getApplicationContext(),R.raw.tune2, 1);
        tune3 = sp.load(getApplicationContext(),R.raw.tune3, 1);
        tune4 = sp.load(getApplicationContext(),R.raw.tune4, 1);
        tune5 = sp.load(getApplicationContext(),R.raw.tune5, 1);
        tune6 = sp.load(getApplicationContext(),R.raw.tune6, 1);
        tune7 = sp.load(getApplicationContext(),R.raw.tune7, 1);
        tune8 = sp.load(getApplicationContext(),R.raw.tune8, 1);
        tune9 = sp.load(getApplicationContext(),R.raw.tune9, 1);
        tune10 = sp.load(getApplicationContext(),R.raw.tune10, 1);
        tune11 = sp.load(getApplicationContext(),R.raw.tune11, 1);
        tune12 = sp.load(getApplicationContext(),R.raw.tune12, 1);
        tune13 = sp.load(getApplicationContext(),R.raw.tune13, 1);
        tune14 = sp.load(getApplicationContext(),R.raw.tune14, 1);
        tune15 = sp.load(getApplicationContext(),R.raw.tune15, 1);
        tune16 = sp.load(getApplicationContext(),R.raw.tune16, 1);

    }

    public void playsound1 (View v) {
        sp.play(sound1,1.0f,1.0f,0,0,10f);
    }
    public void playsound2 (View v) {
        sp.play(sound2,1.0f,1.0f,0,0,10f);

    }
    public void playsound3 (View v) {
        sp.play(sound3,1.0f,1.0f,0,0,10f);

    }
    public void playsound4 (View v) {
        sp.play(sound4,1.0f,1.0f,0,0,10f);

    }
    public void playsound5 (View v) {
        sp.play(sound5,1.0f,1.0f,0,0,10f);

    }
    public void playsound6 (View v) {
        sp.play(sound6,1.0f,1.0f,0,0,10f);

    }
    public void playsound7 (View v) {
        sp.play(sound7,1.0f,1.0f,0,0,10f);

    }
    public void playsound8 (View v) {
        sp.play(sound8,1.0f,1.0f,0,0,10f);

    }
    public void playsound9 (View v) {
        sp.play(sound9,1.0f,1.0f,0,0,10f);

    }

    public void playtune1(View view) {
        sp.play(tune1,1.0f,1.0f,0,0,10f);
    }

    public void playtune2(View view) {
        sp.play(tune2,1.0f,1.0f,0,0,10f);
    }

    public void playtune3(View view) {
        sp.play(tune3,1.0f,1.0f,0,0,10f);
    }

    public void playtune4(View view) {
        sp.play(tune4,1.0f,1.0f,0,0,10f);
    }

    public void playtune5(View view) {
        sp.play(tune5,1.0f,1.0f,0,0,10f);
    }

    public void playtune6(View view) {
        sp.play(tune6,1.0f,1.0f,0,0,10f);
    }

    public void playtune7(View view) {
        sp.play(tune7,1.0f,1.0f,0,0,10f);
    }

    public void playtune8(View view) {
        sp.play(tune8,1.0f,1.0f,0,0,10f);
    }

    public void playtune9(View view) {
        sp.play(tune9,1.0f,1.0f,0,0,10f);
    }

    public void playtune10(View view) {
        sp.play(tune10,1.0f,1.0f,0,0,10f);
    }

    public void playtune11(View view) {
        sp.play(tune11,1.0f,1.0f,0,0,10f);
    }

    public void playtune12(View view) {
        sp.play(tune12,1.0f,1.0f,0,0,10f);
    }

    public void playtune13(View view) {
        sp.play(tune13,1.0f,1.0f,0,0,10f);
    }

    public void playtune14(View view) {
        sp.play(tune14,1.0f,1.0f,0,0,10f);
    }

    public void playtune15(View view) {
        sp.play(tune15,1.0f,1.0f,0,0,10f);
    }

    public void playtune16(View view) {
        sp.play(tune16,1.0f,1.0f,0,0,10f);
    }


}
