package com.rm2xfbv.tabelabrasileirosa.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.rm2xfbv.tabelabrasileirosa.R;

public class MoreInfoActivity extends AppCompatActivity {

    private ImageView buttonMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        buttonMap =  findViewById(R.id.web_id);

        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/dir/" +
                                "-8.0093184,-34.8954624/unifbv+wyden/@-8.0580584,-34.9321914,13z/" +
                                "data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x7ab1ef8ffea346f:0xe0a5692fda5e7080!2m2!1d-34.9152086!2d-8.1063494")));
            }
        });
    }

}
