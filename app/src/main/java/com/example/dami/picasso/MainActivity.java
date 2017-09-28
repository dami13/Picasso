package com.example.dami.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URL;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_image_view) ImageView mainImageView;
    @BindView(R.id.url_edit_text) EditText urlEditText;
    private static String imgURL="http://i.imgur.com/DvpvklR.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.load_button)
    public void loadImgFromURL(){
        imgURL=urlEditText.getText().toString();
        Picasso.with(this).load(imgURL).fit().into(mainImageView);
    }
}
