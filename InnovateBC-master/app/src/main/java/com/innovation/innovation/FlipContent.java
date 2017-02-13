package com.innovation.innovation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import se.emilsjolander.flipview.FlipView;
import se.emilsjolander.flipview.OverFlipMode;

/**
 * Created by liruk on 2016-10-29.
 */


public class FlipContent extends AppCompatActivity implements FlipView.OnFlipListener, FlipView.OnOverFlipListener {

    //Names of the projects
    String[] web = {
            "Alternative Education - Dispelling Myth",
            "An Innovative Primary French Immersion Report Card",
            "Assessment And How We Communicate Student Learning Alongside The Shifting Curriculum",
            "Assessment, Grading And Reporting Field Test ",
            "Authentic Science Partnership: Inquire, Research, Experience (ASPIRE)",
            "Communicating Student Assessment",
            "Communicating Student Learning",
            "Communicating Student Learning 2",
            "Developing Competencies",
            "Dynamic Science Learning Through Student Choice",
            "Elementary Math Innovation Project",
            "First Nations Outdoor Education Program",
            "First Peoples",
            "Going Gradeless",
            "Inquiry in the Early Learning Classroom",
            "Inquiry-based, Interdisciplinary, Competency-based Graduation Structure: Moving Beyond Translation to Transformation",
            "InspirED",
            "John Oliver STEM Program",
            "Learning In Depth",
            "Making Room for Innovation",
            "Mobile Makerspace",
            "Personalized Learning",
            "Re-Designing Assessment in a Middle School",
            "Re-Storying Canadian History: The Interdependence of Creative and Critical Thinking",
            "Recalibrating to a New Normal",
            "Sa-Hali Family of Schools",
            "Teaching and Learning Strategies",
            "Templeton STEM Program",
            "The ins-PI-re Project",
            "The Multi-Grade Approach to Learning",
            "Using a Module Approach for Teaching and Learning"
    } ;

    private FlipView mFlipView;
    private FlipAdapter mAdapter;
    ArrayAdapter<String> madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flip);

        ListView listView1 = (ListView) findViewById(R.id.barflip);
        listView1.setVisibility(View.INVISIBLE);

        //Sets up the flipboard animation
        mFlipView = (FlipView) findViewById(R.id.flip_view);
        mAdapter = new FlipAdapter(this);
        mFlipView.setAdapter(mAdapter);
        mFlipView.setOnFlipListener(this);

        ArrayList<String> arrayProjects = new ArrayList<>();
        arrayProjects.addAll(Arrays.asList(getResources().getStringArray(R.array.Projects)));
        madapter = new ArrayAdapter<String>(FlipContent.this, android.R.layout.simple_list_item_1, arrayProjects);

        listView1.setAdapter(madapter);

        //Sets up toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        myToolbar.setBackgroundColor(Color.DKGRAY);
        myToolbar.setTitleTextColor(Color.WHITE);

    }

    //Toolbar setup
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.flipbar, menu);
        MenuItem item = menu.findItem(R.id.menusearch1);

        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                ListView listview1 = (ListView)findViewById(R.id.barflip);
                listview1.setVisibility(View.VISIBLE);
                return false;
            }

            @Override
            public boolean onQueryTextChange(final String newText) {
                ListView listview1 = (ListView)findViewById(R.id.barflip);
                if(newText.length() > 0){
                    madapter.getFilter().filter(newText);
                    listview1.setVisibility(View.VISIBLE);
                    listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            ListView listview1 = (ListView)findViewById(R.id.barflip);
                            String name = listview1.getItemAtPosition(position).toString();
                            for(int i = 0; i < web.length; i++){
                                if(name.equals(web[i])){
                                    position = i;
                                }
                            }
                            //Goes to the project activity with the position number of the list
                            Intent intent = new Intent(FlipContent.this, ListContent.class);
                            intent.putExtra("key", (position));
                            startActivity(intent);
                        }
                    });
                }

                else if(newText.length() == 0) {
                    listview1.setVisibility(View.INVISIBLE);
                }
                return false;
            }
        });
        return true;
    }

    //Toolbar setup
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.list:
                Intent intent = new Intent(this, ProjectList.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onFlippedToPage(FlipView v, int position, long id) {
        Log.i("pageflip", "Page: "+position);

        //Adds the views
        if(position > mFlipView.getPageCount()-3 && mFlipView.getPageCount()<31){
            mAdapter.addItems(1);
        }
    }

    @Override
    public void onOverFlip(FlipView v, OverFlipMode mode,
                           boolean overFlippingPrevious, float overFlipDistance,
                           float flipDistancePerPage) {
        Log.i("overflip", "overFlipDistance = "+overFlipDistance);
    }
}