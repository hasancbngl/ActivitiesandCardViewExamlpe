package com.cobanogluhasan.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cobanogluhasan.multipleactivitydemo.Adapter.CardAdapter;
import com.cobanogluhasan.multipleactivitydemo.Model.Model;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

public class secondActivity extends AppCompatActivity {

    private SwipeCardsView swipeCardsView;
    private List<Model> modelList = new ArrayList<>();

    public void toFirstActivity(View view) {

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();

        Toast.makeText(this, intent.getStringExtra("namee"),Toast.LENGTH_LONG).show();

        swipeCardsView  = (SwipeCardsView) findViewById(R.id.swipeCardsView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);



        getData();

    }


    private void getData() {
        modelList.add((new Model("aa","sdd", "eng to tr")));
        modelList.add((new Model("2","sdd", "finally dude")));
        modelList.add((new Model("3","sdd", "I think it'll work")));
        modelList.add((new Model("4","sdd", "code as f")));
        modelList.add((new Model("5","sdd", "hehehehe")));

        CardAdapter cardAdapter  = new CardAdapter(modelList,this);
        swipeCardsView.setAdapter(cardAdapter);
    }
}
