package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button red, button, orange, yellow, green, blue, purple, black, white, pink, gray;
    SoundPool sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10;
    int sonido_de_reproduccion1, sonido_de_reproduccion2, sonido_de_reproduccion3, sonido_de_reproduccion4, sonido_de_reproduccion5, sonido_de_reproduccion6, sonido_de_reproduccion7, sonido_de_reproduccion8, sonido_de_reproduccion9, sonido_de_reproduccion10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AudioSoundPool (View view) {
        sp1.play(sonido_de_reproduccion1, 1 , 1, 1, 0, 0);
    }

    public void AudioMediaPlayer1(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.rojoaudio);
        mp.start();
    }
    public void AudioMediaPlayer2(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.naranja);
        mp.start();
    }
    public void AudioMediaPlayer3(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.amarillo);
        mp.start();
    }
    public void AudioMediaPlayer4(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.verde);
        mp.start();
    }
    public void AudioMediaPlayer5(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.azul);
        mp.start();
    }
    public void AudioMediaPlayer6(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.morado);
        mp.start();
    }
    public void AudioMediaPlayer7(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.negro);
        mp.start();
    }
    public void AudioMediaPlayer8(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blanco);
        mp.start();
    }
    public void AudioMediaPlayer9(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.rosado);
        mp.start();
    }
    public void AudioMediaPlayer(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gray);
        mp.start();
    }
}