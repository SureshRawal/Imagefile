package com.example.imagefile;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdoRajeshhamal, rdoBhuvanKc, rdoDayangRai;
    private ImageView imgImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoBhuvanKc = findViewById(R.id.rdoBhuvan);
        rdoDayangRai = findViewById(R.id.rdoDayang);
        rdoRajeshhamal = findViewById(R.id.rdoRajesh);
        imgImage = findViewById(R.id.imgImage);

        rdoDayangRai.setOnClickListener(this);
        rdoRajeshhamal.setOnClickListener(this);
        rdoBhuvanKc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.rdoBhuvan:
               imgImage.setImageResource(R.drawable.index);

                break;

            case R.id.rdoDayang:
                imgImage.setImageResource(R.drawable.index1);
                break;


            case R.id.rdoRajesh:
                imgImage.setImageResource(R.drawable.index2);

                break;

        }

    }
}
