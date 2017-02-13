package com.innovation.innovation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.OverFlipMode;

/**
 * Created by liruk on 2016-10-29.
 */

public class ListContent extends AppCompatActivity implements FlipView.OnFlipListener, FlipView.OnOverFlipListener  {

    private FlipView mFlipView;
    private ListAdapter mAdapter;

    private int value = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flip);

        //Gets the position
        Bundle extras = getIntent().getExtras();
        value = extras.getInt("key");

        //Sets up the flipboard animation
        mFlipView = (FlipView) findViewById(R.id.flip_view);
        mAdapter = new ListAdapter(this, value);
        mFlipView.setAdapter(mAdapter);
        //mFlipView.setOnFlipListener(this);

        //Sets up toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        myToolbar.setBackgroundColor(Color.DKGRAY);
        myToolbar.setTitleTextColor(Color.WHITE);

    }

    //Toolbar setup
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.listcontentbar, menu);
        return true;
    }

    //Toolbar setup
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.flip:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onFlippedToPage(FlipView v, int position, long id) {
        Log.i("pageflip", "Page: "+position);

        //Adds the views
        if(position > mFlipView.getPageCount()-3 && mFlipView.getPageCount()<31){
            mAdapter.addItems(0);
        }
    }

    @Override
    public void onOverFlip(FlipView v, OverFlipMode mode,
                           boolean overFlippingPrevious, float overFlipDistance,
                           float flipDistancePerPage) {
        Log.i("overflip", "overFlipDistance = "+overFlipDistance);
    }
}

