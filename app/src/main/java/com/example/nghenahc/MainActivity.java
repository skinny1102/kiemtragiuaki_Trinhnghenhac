package com.example.nghenahc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button chonbai,play,pause;
    int id ;
    String name_song,sttu;
    MediaPlayer player;
    int duration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        id = i.getIntExtra("ID_RS",0);
        name_song = i.getStringExtra("Name_Song");
        sttu = i.getStringExtra("STT");
        unitUi();
    }
    private  void unitUi(){
        TextView nameSong = findViewById(R.id.nameMusic);
        TextView stt = findViewById(R.id.stt);
        if(name_song==null){
            nameSong.setText("Ái Nội");
            stt.setText("Bài "+1);
        }else {
            nameSong.setText(name_song);
            stt.setText("Bài " + sttu);
        }
        chonbai = findViewById(R.id.chonbai);
        chonbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ChonBaiActivity.class);
                startActivity(i);
                finish();
            }
        });
        play = findViewById(R.id.play);
        if(id==0){
            player = MediaPlayer.create(MainActivity.this,R.raw.bai1);
            int duration = player.getDuration();
            getTime(duration);
        }else{
           player = MediaPlayer.create(MainActivity.this,id);
            int duration = player.getDuration();
            getTime(duration);
        }
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.start();
            }
        });
        pause = findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.pause();
            }
        });
    }
    public  void getTime(int duration ){
        TextView time = findViewById(R.id.time);
        int hours, minutes, seconds = duration / 1000;
        hours = (seconds / 3600);
        minutes = (seconds / 60) % 60;
        seconds = seconds % 60;
        time.setText(minutes +"phút ,"+seconds+"giây");
    };
}