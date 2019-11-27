package com.example.microporcessor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final int ret = 100;
    public static final int pic = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button retrieveBtn = (Button)findViewById(R.id.retrieveBtn); //페이지 전환 버튼

        retrieveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RetrieveActivity.class);
                startActivityForResult(intent, ret);
            }
        });

        Button pictureBtn = (Button)findViewById(R.id.pictureBtn); //페이지 전환 버튼

        pictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PictureActivity.class);

                startActivityForResult(intent, pic);
            }
        });
    }


}
