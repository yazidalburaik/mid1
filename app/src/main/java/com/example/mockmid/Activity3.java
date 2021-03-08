package com.example.mockmid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        String [] animals = {"Cat", "Dog","Lion","Tiger","Bird"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_3,R.id.Items,animals));



    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        switch (position){
            case 0:
                Intent Bigpic = new Intent(Activity3.this,Activity4.class);
                startActivity(Bigpic);
break;
            case 1:
                Intent dog = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Dog"));
                startActivity(dog);
                break;

            case 2:
                Intent lion = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Lion"));
                startActivity(lion);
                break;

            case 3:
                Intent tiger = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Tiger"));
                startActivity(tiger);

            case 4:
                Intent bird = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Bird"));
                startActivity(bird);
        }
    }
}