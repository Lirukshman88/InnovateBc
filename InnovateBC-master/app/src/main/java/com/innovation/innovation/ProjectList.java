package com.innovation.innovation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectList extends AppCompatActivity{

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
    //Images of the projects
    Integer[] imageId = {
            R.drawable.experiential_learning,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.rural,
            R.drawable.multi_grade_classrooms,
            //breakpoint
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.cross_curricular,
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.experiential_learning,
            R.drawable.aboriginal_learning_cultural_development,
            //breakpoint
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.rural,
            R.drawable.experiential_learning,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.rural,
            R.drawable.multi_grade_classrooms,
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.cross_curricular,
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.experiential_learning,
            R.drawable.aboriginal_learning_cultural_development,
            //breakpoint
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.rural,
            R.drawable.rural
    };
    ArrayAdapter<String> madapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

        CustomList adapter = new
                CustomList(ProjectList.this, web, imageId);

        ListView listView = (ListView) findViewById(R.id.list);
        ListView listView1 = (ListView) findViewById(R.id.bar);
        listView1.setVisibility(View.INVISIBLE);


        ArrayList<String> arrayProjects = new ArrayList<>();
        arrayProjects.addAll(Arrays.asList(getResources().getStringArray(R.array.Projects)));
        madapter = new ArrayAdapter<String>(ProjectList.this, android.R.layout.simple_list_item_1, arrayProjects);


        listView.setAdapter(adapter);
        listView1.setAdapter(madapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Goes to the project activity with the position number of the list
                Intent intent = new Intent(ProjectList.this, ListContent.class);
                intent.putExtra("key", (position));
                startActivity(intent);
            }
        });
        //Sets up toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(myToolbar);

        myToolbar.setBackgroundColor(Color.DKGRAY);
        myToolbar.setTitleTextColor(Color.WHITE);

    }
    //toolbar setup
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.listbar, menu);
        MenuItem item = menu.findItem(R.id.menusearch);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                ListView listview1 = (ListView)findViewById(R.id.bar);
                listview1.setVisibility(View.VISIBLE);
                return false;
            }

            @Override
            public boolean onQueryTextChange(final String newText) {
                ListView listview1 = (ListView)findViewById(R.id.bar);
                if(newText.length() > 0){
                    madapter.getFilter().filter(newText);
                    listview1.setVisibility(View.VISIBLE);
                    listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            ListView listview1 = (ListView)findViewById(R.id.bar);
                            String name = listview1.getItemAtPosition(position).toString();
                            for(int i = 0; i < web.length; i++){
                                if(name.equals(web[i])){
                                    position = i;
                                }
                            }
                            //Goes to the project activity with the position number of the list
                            Intent intent = new Intent(ProjectList.this, ListContent.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.flip:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
