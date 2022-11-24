package com.cde.chatbot;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class Logo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);


        Handler handler = new Handler();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Logo.this, MainActivity.class);

                startActivity(intent); //인트로 실행 후 바로 MainActivity로 넘어감.
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out); //액티비티 전환 애니메이션
                finish();
            }
        }, 2000); //1초 후 인트로 실행
    }
}