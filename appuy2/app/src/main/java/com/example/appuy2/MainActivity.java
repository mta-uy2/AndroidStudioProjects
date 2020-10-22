package com.example.appuy2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView c = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CardView) findViewById(R.id.access_site)).setOnClickListener(this);
        ((CardView) findViewById(R.id.fseg)).setOnClickListener(this);
        ((CardView) findViewById(R.id.fsjp)).setOnClickListener(this);
        ((CardView) findViewById(R.id.iford)).setOnClickListener(this);
        ((CardView) findViewById(R.id.iric)).setOnClickListener(this);
        ((CardView) findViewById(R.id.esstic)).setOnClickListener(this);
        ((CardView) findViewById(R.id.e_learning)).setOnClickListener(this);
        ((CardView) findViewById(R.id.insc_ligne)).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch(view.getId()){
            case R.id.access_site:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://univ-yaounde2.org"));
                startActivity(i);

                break;
            case R.id.fseg:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fseg.univ-yaounde2.org"));
                startActivity(i);

                break;
            case R.id.fsjp:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fsjp.univ-yaounde2.org"));
                startActivity(i);

                break;
            case R.id.esstic:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://esstic.univ-yaounde2.org"));
                startActivity(i);

                break;
            case R.id.iric:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iricuy2.com/"));
                startActivity(i);

                break;
            case R.id.iford:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iford-cm.org/\n"));
                startActivity(i);

                break;
            case R.id.insc_ligne:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://inscriptions.univ-yaounde2.org/"));
                startActivity(i);

                break;
            case R.id.e_learning:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://e-learning.univ-yaounde2.org/"));
                startActivity(i);

                break;
        }
    }
}