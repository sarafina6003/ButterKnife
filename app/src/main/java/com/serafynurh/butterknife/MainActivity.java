package com.serafynurh.butterknife;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.img) ImageView img;
    @BindView(R.id.text) TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        text.setText("ButterKnife Library only works with internet connection");
        text.setTextColor(Color.parseColor("#FF6714E2"));

        String url="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQPE6iohWU8WL72G1N8Wm6vXbz7Hji3C2alHstMfyP3oiL8c03scg";
        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher).into(img);
    }
}
