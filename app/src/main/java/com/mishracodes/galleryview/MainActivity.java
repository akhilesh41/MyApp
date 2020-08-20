package com.mishracodes.galleryview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int [] pic = {R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7};
int pointer=0;

    public void prev(View view)
    {
        pointer-=1;
        if(pointer<0)
            pointer=6;
        ((ImageView)findViewById(R.id.imageView)).setImageResource(pic[pointer]);


    }
    public void next(View view)
    { pointer=(pointer+1)%7;
        ((ImageView)findViewById(R.id.imageView)).setImageResource(pic[pointer]);




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
