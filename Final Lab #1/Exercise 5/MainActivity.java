package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    private Button previousbtn, nextbtn;
    private ImageSwitcher imgsw;
    private int[] images = {R.drawable.bangkok, R.drawable.bangkok2};
    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousbtn = findViewById(R.id.btnPrevious);
        nextbtn = findViewById(R.id.btnNext);
        imgsw = findViewById(R.id.imgSw);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw = new ImageView(MainActivity.this);
                imgVw.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imgVw;
            }
        });

        imgsw.setInAnimation(this, android.R.anim.slide_in_left);
        imgsw.setOutAnimation(this, android.R.anim.slide_out_right);

        // Set initial image
        imgsw.setImageResource(images[position]);

        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0) {
                    position--;
                } else {
                    position = images.length - 1;
                }
                imgsw.setImageResource(images[position]);
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < images.length - 1) {
                    position++;
                } else {
                    position = 0;
                }
                imgsw.setImageResource(images[position]);
            }
        });
    }
}
