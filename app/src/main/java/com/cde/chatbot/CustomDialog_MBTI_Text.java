package com.cde.chatbot;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class CustomDialog_MBTI_Text extends Dialog {

    private Context mContext;

    View frame_ESFP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog2);

        // 다이얼로그의 배경을 투명으로 만든다.
        Objects.requireNonNull(getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        frame_ESFP = findViewById(R.id.frame_ENFP);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ((Activity)mContext).overridePendingTransition(R.anim.fade_in, R.anim.fade_out); //액티비티 전환 애니메이션
                dismiss();
            }
        }, 1500); //1초 후 인트로 실행



    }


    public CustomDialog_MBTI_Text(Context mContext) {
        super(mContext);
        this.mContext = mContext;
    }




}




