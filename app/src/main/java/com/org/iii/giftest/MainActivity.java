package com.org.iii.giftest;

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

        mGifLoadingView = new GifLoadingView();
        findViewById(R.id.button).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mGifLoadingView.setImageResource(R.drawable.load);
                        mGifLoadingView.show(getFragmentManager(),"");

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

