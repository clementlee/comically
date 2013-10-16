package com.plushiesinspace.comically;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ComicReader extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.comic_reader, menu);
        return true;
    }
    
}
