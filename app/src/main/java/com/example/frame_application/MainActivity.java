package com.example.frame_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int i;
int imag[]={R.drawable.im2,R.drawable.im3,R.drawable.im4};
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageView);
    }

    public void previous(View view) {
        if(i>0)
        {i--;
            iv.setImageResource(imag[i]);

        }
        else
            Toast.makeText(this,"No previous images",Toast.LENGTH_LONG).show();

    }

    public void next(View view) {
        if(i<3)
        {
         iv.setImageResource(imag[i]);
         i++;
        }
        else
            Toast.makeText(this,"No Next images",Toast.LENGTH_LONG).show();
    }
}