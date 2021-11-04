package com.example.nghenahc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChonBaiActivity extends AppCompatActivity {
    Button bai1, bai2,bai3,bai4,bai5,bai6,btnselect;
    TextView Stt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_bai);
        idBtn();
        clickChonbai();
        selectbai();
    }
    public void idBtn(){
        bai1 = findViewById(R.id.bai1);
        bai2 = findViewById(R.id.bai2);
        bai3 = findViewById(R.id.bai3);
        bai4 = findViewById(R.id.bai4);
        bai5 = findViewById(R.id.bai5);
        bai6 = findViewById(R.id.bai6);
        btnselect= findViewById(R.id.btn_select);
        Stt=findViewById(R.id.stt);

    }
    public void clickChonbai(){
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("1");
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("2");
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("3");
            }
        });
        bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("4");
            }
        });
        bai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("5");
            }
        });
        bai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Stt.setText("6");
            }
        });
    }
    public void selectbai(){
        btnselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stt = Stt.getText().toString().trim();
                Intent i = new Intent(ChonBaiActivity.this,MainActivity.class);
                switch (stt){
                    case "1":
                        i.putExtra("ID_RS",R.raw.bai1);
                        i.putExtra("STT",stt);
                        i.putExtra("Name_Song","Cưới thôi");
                        break;
                    case "2":
                        i.putExtra("",R.raw.bai2);
                        i.putExtra("STT",stt);
                        i.putExtra("Name_Song","Ái Nộ");
                        break;
                    case "3":
                        i.putExtra("ID_RS",R.raw.bai3);
                        i.putExtra("STT",stt);
                        i.putExtra("Name_Song","Cưới thôi");
                        break;
                    case "4":
                        i.putExtra("ID_RS",R.raw.bai4);
                        i.putExtra("STT",stt);
                        i.putExtra("Name_Song","Tình thương phu thê");
                        break;
                    case "5":
                        i.putExtra("ID_RS",R.raw.bai5); i.putExtra("STT",stt);

                        i.putExtra("Name_Song","Dịu dàng êm đềm");
                        break;
                    case "6":
                        i.putExtra("ID_RS",R.raw.bai6);
                        i.putExtra("STT",stt);
                        i.putExtra("Name_Song","31073-WNDuonggNautitie");
                        break;
                    default:
                        break;
                }
                startActivity(i);
                finish();
            }
        });
    }

}