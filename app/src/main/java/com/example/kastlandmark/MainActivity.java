    package com.example.kastlandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);

        //Data
        ArrayList<String> landmarkNames = new ArrayList<>();
        landmarkNames.add("Sarımsak");
        landmarkNames.add("Rıfat Ilgaz Müzesi");
        landmarkNames.add("Yolcu Bar");
        landmarkNames.add("Saat Kulesi");
        landmarkNames.add("Valla Kanyonu Seyir Terası");
        landmarkNames.add("Ilıca Şelalesi");


        ArrayList<String> LandExp = new ArrayList<>();
        LandExp.add("Taşköprü");
        LandExp.add("Cide");
        LandExp.add("Azdavay");
        LandExp.add("Merkez");
        LandExp.add("Azdavay");
        LandExp.add("Pınarbaşı");

        Bitmap sarimsak = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sarimsak);
        Bitmap rifat = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.rifatilgazmuzesi);
        Bitmap yolcu = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.azdavayyolcubar);
        Bitmap saat = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.saatkulesi);
        Bitmap valla = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.valla);
        Bitmap ilica = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ilica);

        ArrayList<Bitmap> landImages = new ArrayList<>();
        landImages.add(sarimsak);
        landImages.add(rifat);
        landImages.add(yolcu);
        landImages.add(saat);
        landImages.add(valla);
        landImages.add(ilica);






        //ListView
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,landmarkNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("name",landmarkNames.get(position));
                intent.putExtra("exp", LandExp.get(position));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImg(landImages.get(position));

                startActivity(intent);


            }
        });

    }
}