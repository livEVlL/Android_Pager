package com.org.iii.giftest;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.roger.gifloadinglibrary.GifLoadingView;

public class MainActivity extends AppCompatActivity {

    private GifLoadingView mGifLoadingView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gif 畫面設定
        mGifLoadingView = new GifLoadingView();
        findViewById(R.id.button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mGifLoadingView.setImageResource(R.drawable.load);
                        mGifLoadingView.show(getFragmentManager(),"");


                        //間隔時間5秒跳頁

                        new Handler().postDelayed(new Runnable() {
                           @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, QRcode.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 5000);
                    }

                });
    }
}






//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        GifImageView gifImageView = (GifImageView) findViewById(R.id.GifImageView);
//        gifImageView.setGifImageResource(R.drawable.art);
//    }

