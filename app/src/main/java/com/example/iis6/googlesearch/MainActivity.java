package com.example.iis6.googlesearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //created main activity as oncreate
    }
      //while clicking the clickable button from xml it opens the link
     public void clickable(View View){        //using intent we are passing the uri browser
         Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.google.com.kh"));
         startActivity(intent);

     }
}