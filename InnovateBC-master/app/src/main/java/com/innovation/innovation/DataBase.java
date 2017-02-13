package com.innovation.innovation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DataBase extends AppCompatActivity {

    private boolean isInDB;

    //Finds the views needed for database
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Checks whether database has been initialized
        if (!isInDB) {
            DBHandler dbHandler = new DBHandler(this, null, null, 1);

            Product alternativeEducation =
                    new Product("Alternative Education - Dispelling Myth",
                            "Through restructuring in the Cowichan Valley, we were fortunate to have the opportunity to repurpose a 100-year-old elementary site into an Open Learning Centre.",
                            "Partnership Projects",
                            "Experiential learning",
                            "Cowichan Valley",
                            "Cowichan Valley Open Learning Cooperative, Cowichan Valley Distributed Learning, Cowichan Adult Learning Centre",
                            "Larry Mattin\n" +
                                    "Principal\n" +
                                    "lmattin@sd79.bc.ca\n" +
                                    "\n" +
                                    "Rod Allen\n" +
                                    "Superintendent\n" +
                                    "Cowichan Valley School District\n" +
                                    "rallen@sd79.bc.ca");
            dbHandler.addProduct(alternativeEducation);

            Product frReportCard =
                    new Product("An Innovative Primary French Immersion Report Card",
                            "Our focus on creating a report card based on assessing oral and intercultural competencies will create momentum to reassess and adjust teaching practices in our local classrooms.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "Central Okanagan",
                            "École élementaire Belgo, École élementaire Casorso, École élementaire Dorothea Walker, École élementaire George Pringle, École élementaire Glenmore, École élementaire Peter Greer",
                            "Armelle Morgan\n" +
                                    "French Immersion Coordinator\n" +
                                    "Armelle.moran@sd23.bc.ca\n" +
                                    "\n" +
                                    "Rhonda Ovelson\n" +
                                    "Director of Instruction\n" +
                                    "Rhonda.ovelson@sd23.bc.ca\n" +
                                    "\n" +
                                    "Kevin Kaardal\n" +
                                    "Superintendent\n" +
                                    "Central Okanagan School District\n" +
                                    "Kevin.Kaardal@sd23.bc.ca");
            dbHandler.addProduct(frReportCard);

            Product comShift =
                    new Product("Assessment And How We Communicate Student Learning Alongside The Shifting Curriculum",
                            "We envision a door into our classrooms that will engage our learners and all those who support them in their journey, by creating a digital story of learning, and life.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "Sunshine Coast",
                            "Elphinstone Secondary, Langdale Elementary, West Sechelt Elementary, Roberts Creek Elementary, Kinnikinnick Elementary",
                            "Kate Keer\n" +
                                    "Principal\n" +
                                    "kkerr@sd46.bc.ca\n" +
                                    "\n" +
                                    "Lisa Allen\n" +
                                    "Teacher\n" +
                                    "lallen@sd46.bc.ca\n" +
                                    "\n" +
                                    "Patrick Bocking\n" +
                                    "Superintendent\n" +
                                    "Sunshine Coast School District\n" +
                                    "pbocking@sd46.bc.ca");
            dbHandler.addProduct(comShift);

            Product gradeReport =
                    new Product("Assessment, Grading And Reporting Field Test",
                            "To move away from traditional report cards and engage in continuous communication with parents and students through digital portfolios.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "Okanagan Skaha",
                            "Giant’s Head Elementary, Trout Creek Elementary, Wiltse Elementary, Uplands Elementary, Summerland Middle, Queen’s Park, Columbia, Naramata, Skaha Lake Middle, Connect ED",
                            "tsteves@summer.com\n" +
                                    "\n" +
                                    "jcorday@summer.com\n" +
                                    "\n" +
                                    "dmullin@summer.coma");
            dbHandler.addProduct(gradeReport);

            Product authSciPart =
                    new Product("Authentic Science Partnership: Inquire, Research, Experience (ASPIRE)",
                            "The primary goal of the ASPIRE program is to provide students in a remote school district with authentic science experiences to improve their science and technological skills and literacy.",
                            "Partnership Projects",
                            "Project-based learning",
                            "Fort Nelson",
                            "R.L. Angus Elementary School, G.W. Carlson Elementary School",
                            "Lori Gilbert\n" +
                                    "Teacher Librarian\n" +
                                    "lgilbert@sd81.bc.ca\n" +
                                    "\n" +
                                    "Diana Samchuk\n" +
                                    "Superintendent\n" +
                                    "Fort Nelson School District\n" +
                                    "dsamchuck@sd81.bc.ca");
            dbHandler.addProduct(authSciPart);

            Product comStudAss =
                    new Product("Communicating Student Assessment",
                            "To develop a competency tracking model and communicate to parents the assessment of student learning through their multi-grade, cross-curricular courses.",
                            "Partnership Projects",
                            "Rural",
                            "North Okanagan Shuswap",
                            "Eagle River Secondary",
                            "N/A");
            dbHandler.addProduct(comStudAss);

            Product comStudLearn =
                    new Product("Communicating Student Learning",
                            "To develop and implement best practices in communicating student learning and to work towards eliminating letter grades from the Transition Program.",
                            "Partnership Projects",
                            "Multi-grade Classrooms",
                            "Gulf Islands",
                            "Salt Spring Elementary, Fulford Elementary, Fernwood Elementary, Saltspring Island Middle, Galiano Community School, Phoenix Elementary and Learning Services, Gulf Islands Secondary",
                            "jhoag@sd64.bc.ca\n" +
                                    "\n" +
                                    "sjohnson@sd64.bc.ca\n" +
                                    "\n" +
                                    "srobinson@sd64.bc.ca\n" +
                                    "\n" +
                                    "lhalstead@sd64.bc.ca");
            dbHandler.addProduct(comStudLearn);

            Product comStudLearn2 =
                    new Product("Communicating Student Learning Part 2",
                            "Deconstructing the International Baccalaureate Approaches to Learning (IB ATL) skills, and communicating students’ development of these skills both informally and formally.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "North Vancouver",
                            "Carson Graham Secondary School, Rockridge Secondary School, Mulgrave Independent School",
                            "Kathleen Barter\n" +
                                    "District Administrator\n" +
                                    "North Vancouver School District\n" +
                                    "kbarter@sd44.ca\n" +
                                    "\n" +
                                    "Chris Kennedy\n" +
                                    "Superintendent\n" +
                                    "West Vancouver School District\n" +
                                    "ckennedy@wvschools.ca\n" +
                                    "\n" +
                                    "John Lewis\n" +
                                    "Superintendent\n" +
                                    "North Vancouver School District\n" +
                                    "jlewis@sd44.ca\n" +
                                    "\n" +
                                    "John Wray\n" +
                                    "Head of School\n" +
                                    "Mulgrave Independent School\n" +
                                    "jwray@mulgrave.com");
            dbHandler.addProduct(comStudLearn2);

            Product devComp =
                    new Product("Developing competencies",
                            "To provide learning opportunities that develops students’ thinking, social and personal competencies.",
                            "Partnership Projects",
                            "Project-based learning",
                            "Vernon",
                            "Vernon Community School",
                            "kondrik@sd22.bc.ca\n" +
                                    "\n" +
                                    "msasges@sd22.bc.ca\n" +
                                    "\n" +
                                    "RThompson@sd22.bc.ca");
            dbHandler.addProduct(devComp);

            Product dynScience =
                    new Product("Dynamic Science Learning Through Student Choice",
                            "By using a blended learning model for content delivery, students have flexibility over how and when they learn the course material.",
                            "Partnership Projects",
                            "Cross-curricular",
                            "Prince George",
                            "Centre for Learning Alternatives, Peden Hill Elementary, Secondary School (TBC)",
                            "Jennifer Waughtal\n" +
                                    "Teacher\n" +
                                    "jwaughtal@sd57.bc.ca\n" +
                                    "\n" +
                                    "Chris Molcak\n" +
                                    "Principal\n" +
                                    "Alternate Community Programs\n" +
                                    "cmolcak@sd57.bc.ca\n" +
                                    "\n" +
                                    "Sharon Cairns\n" +
                                    "Interim Superintendent\n" +
                                    "Prince George School District\n" +
                                    "scairns@sd57.bc.ca");
            dbHandler.addProduct(dynScience);

            Product elemMath =
                    new Product("Elementary Math Innovation Project",
                            "To provide students with real-life experiences in multi-age teams through a café at the school.",
                            "Partnership Projects",
                            "Aboriginal learning / Cultural development",
                            "Comox Valley",
                            "Huband Park Elementary",
                            "Debbie.Nelson@sd71.bc.ca\n" +
                                    "\n" +
                                    "gracie.macdonald@sd71.bc.ca");
            dbHandler.addProduct(elemMath);

            Product firstNatOutdoors =
                    new Product("First Nations Outdoor Education Program",
                            "To develop a program that will holistically weave First Nations culture and traditions into existing provincially recognized and Board/Authority Authorized courses to nurture a sense of belonging in identified at-risk youth.",
                            "Partnership Projects",
                            "Experiential learning",
                            "Cariboo-Chilcotin",
                            "Skyline Offsite Alternate",
                            "gordon.weber@sd27.bc.ca\n" +
                                    "\n" +
                                    "mike.franklin@sd27.bc.ca\n" +
                                    "\n" +
                                    "ann.pilszek@sd27.bc.ca");
            dbHandler.addProduct(firstNatOutdoors);

            Product firstPeop =
                    new Product("First Peoples",
                            "To create and facilitate a sustainable relationship between students and staff and members of B.C.’s First Peoples.",
                            "Partnership Projects",
                            "Aboriginal learning / Cultural development",
                            "Independent",
                            "Surrey Christian School",
                            "ddeboer@surreychristian.com\n" +
                                    "\n" +
                                    "ed.noot@scsbc.ca\n" +
                                    "\n" +
                                    "mbeimers@surreychristian.com");
            dbHandler.addProduct(firstPeop);

            Product gradeless =
                    new Product("Going Gradeless",
                            "To run a gradeless assessment and reporting program in select Grade 8 & 9 classes.",
                            "Partnership Projects",
                            "Cross-curricular",
                            "Independent",
                            "Holy Cross Regional High School (Surrey)",
                            "adesantis@holycross.bc.ca\n" +
                                    "\n" +
                                    "cblesch@holycross.bc.ca\n" +
                                    "\n" +
                                    "smarsall@cisva.bc.ca\n" +
                                    "\n" +
                                    "jkitching@holycross.bc.ca");
            dbHandler.addProduct(gradeless);

            Product earlyLearnClass =
                    new Product("Inquiry in the Early Learning Classroom",
                            "We come together to do collaborative inquiry around how to take the strengths and passions of our students and help them become more engaged and to take ownership of their learning.",
                            "Partnership Projects",
                            "N/A",
                            "Okanagan Similkameen",
                            "Oliver Elementary, Oliver StrongStart, Osoyoos Elementary, Osoyoos StrongStart, Okanagan Falls Elementary, Cawston Primary, Tuc-el-Nuit Elementary",
                            "Melia Dirk\n" +
                                    "Early Learning Network Leader\n" +
                                    "mdirk@sd53.bc.ca\n" +
                                    "\n" +
                                    "Bev Young\n" +
                                    "Superintendent\n" +
                                    "Okanagan Similkameen School District\n" +
                                    "byoung@sd53.bc.ca");
            dbHandler.addProduct(earlyLearnClass);

            Product translationToTrans =
                    new Product("Inquiry-based, Interdisciplinary, Competency-based Graduation Structure: Moving Beyond Translation to Transformation",
                            "The building and deployment of an interdisciplinary, competency-based digital portfolio system that ties learning artifacts to competencies and contexts.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "Independent",
                            "Pacific School of Innovation and Inquiry",
                            "Jeff Hopkins\n" +
                                    "Principal Educator\n" +
                                    "Jeff.Hopkins@learningstorm.org\n" +
                                    "\n" +
                                    "Jessica Asp\n" +
                                    "Educator\n" +
                                    "Jessica_Asp@yahoo.ca");
            dbHandler.addProduct(translationToTrans);

            Product inspirED =
                    new Product("InspirED",
                            "To implement the InspirED program for Grade 9 students centred on the concept of inquiry-based learning.",
                            "Partnership Projects",
                            "Social, emotional learning / self-regulation",
                            "North Okanagan Shuswap",
                            "Salmon Arm Secondary",
                            "acorbett@sd83.bc\n" +
                                    "\n" +
                                    "rfindlay@sd83.bc.ca\n" +
                                    "\n" +
                                    "grichard@sd83.bc.ca");
            dbHandler.addProduct(inspirED);

            Product johnSTEM =
                    new Product("John Oliver STEM Program",
                            "Due to a growing demand among our school’s student population we are expanding the STEM program to include more grades.",
                            "Partnership Projects",
                            "Project-based learning",
                            "Vancouver",
                            "John Oliver Secondary School",
                            "Benjamin King\n" +
                                    "Teacher\n" +
                                    "bcking@vsb.bc.ca\n" +
                                    "\n" +
                                    "Jeff Spence\n" +
                                    "Teacher\n" +
                                    "jspence@vsb.bc.ca\n" +
                                    "\n" +
                                    "John Silver\n" +
                                    "Teacher\n" +
                                    "jsilver@vsb.bc.ca\n" +
                                    "\n" +
                                    "Scott Robinson\n" +
                                    "Superintendent\n" +
                                    "Vancouver School Board\n" +
                                    "smrobinson@vsb.bc.ca");
            dbHandler.addProduct(johnSTEM);

            Product learnInDepth =
                    new Product("Learning In Depth",
                            "The aim of Learning in Depth (LID) is for each student, by the end of his/her schooling, to know as much about that topic as almost anyone on earth.",
                            "Partnership Projects",
                            "Project-based learning",
                            "Independant",
                            "St. Michael’s Elementary School",
                            "Caterina Kennedy\n" +
                                    "Principal\n" +
                                    "ckennedy@cisva.bc.ca\n" +
                                    "\n" +
                                    "Sandra Marshall\n" +
                                    "Superintendent\n" +
                                    "smarshall@cisva.bc.ca");
            dbHandler.addProduct(learnInDepth);

            Product innovationRoom =
                    new Product("Making Room for Innovation",
                            "Our proposal is to offer a transition model to motivate both students and teachers to be able to utilize the new Applied Skills curriculum at the grade 6, 7, 8 and 9 levels.",
                            "Partnership Projects",
                            "Project-based learning",
                            "Langley",
                            "D.W. Poppy Secondary School and feeder schools (Peterson Road Elementary, North Otter Elementary)",
                            "Dave Hetherington\n" +
                                    "dhetherington@sd35.bc.ca\n" +
                                    "\n" +
                                    "Chris Janzen\n" +
                                    "cjanzen@sd35.bc.ca\n" +
                                    "\n" +
                                    "Suzanne Hoffman\n" +
                                    "Superintendent\n" +
                                    "Langley School District\n" +
                                    "shoffman@sd35.bc.ca");
            dbHandler.addProduct(innovationRoom);

            Product makerSpace =
                    new Product("Mobile Makerspace",
                            "To provide all students with STEAM (science, technology, engineering, arts, and math) Learning opportunities through a Mobile Makerspace.",
                            "Partnership Projects",
                            "Cross-curricular",
                            "Vernon",
                            "N/A",
                            "Corinne McWhinney\n" +
                                    "Technology Innovation Coordinating Teacher\n" +
                                    "cmcwhinney@sd22.bc.ca\n" +
                                    "\n" +
                                    "Joshua Vance\n" +
                                    "Technology Innovation Coordinating Teacher\n" +
                                    "jvance@sd22.bc.ca\n" +
                                    "\n" +
                                    "Brendan Robertson Technology Innovation Coordinating Teacher\n" +
                                    "brobertson@sd22.bc.ca\n" +
                                    "\n" +
                                    "Joe Rogers\n" +
                                    "Superintendent\n" +
                                    "Vernon School District\n" +
                                    "jrogers@sd22.bc.ca");
            dbHandler.addProduct(makerSpace);

            Product persLearn =
                    new Product("Personalized Learning",
                            "To integrate elements of Self-Directed Learning and student inquiry through their Personalized Learning Program.",
                            "Partnership Projects",
                            "Vulnerable / at-risk students",
                            "Sunshine Coast",
                            "Pender Harbour Elementary-Secondary",
                            "jwalls@sd46.bc.ca\n" +
                                    "\n" +
                                    "amcknight@sd46.bc.ca\n" +
                                    "\n" +
                                    "pbishop@sd46.bc.ca");
            dbHandler.addProduct(persLearn);

            Product redesignAssess =
                    new Product("Re-Designing Assessment in a Middle School",
                            "For the past three years, Trafalgar Middle School has been working to incorporate authentic assessment practices into our work with students.",
                            "Partnership Projects",
                            "Reporting and Assessment",
                            "Kootenay Lake",
                            "Trafalgar Middle School",
                            "Carol-Ann Leidloff\n" +
                                    "Principal, Trafalgar Middle School\n" +
                                    "cleidloff@sd8.bc.ca\n" +
                                    "\n" +
                                    "Jeff Jones\n" +
                                    "Superintendent\n" +
                                    "Kootenay Lake School District\n" +
                                    "Jjones@sd8.bc.ca");
            dbHandler.addProduct(redesignAssess);

            Product canHistory =
                    new Product("Re-Storying Canadian History: The Interdependence of Creative and Critical Thinking",
                            "In April of 2017, 600 Kindergarten to Grade 6 students of Glenmore Elementary will be participating in the culminating event of a year-long study called “How Canada Came to Be”.",
                            "Partnership Projects",
                            "Aboriginal learning / Cultural development",
                            "Central Okanagan",
                            "Glenmore Elementary School",
                            "Rhonda Draper\n" +
                                    "Elementary Arts Educator\n" +
                                    "Rhonda.Draper@sd23.bc.ca\n" +
                                    "\n" +
                                    "Kevin Kaardal, Superintendent\n" +
                                    "Central Okanagan School District\n" +
                                    "Kevin.Kaardal@sd23.bc.ca");
            dbHandler.addProduct(canHistory);

            Product calibrateNormal =
                    new Product("Recalibrating to a New Normal",
                            "Classrooms are being transformed into digital nerve centres where a real world approach to education drives a personalized approach to learning.",
                            "Partnership Projects",
                            "Vulnerable / at-risk students",
                            "Abbotsford",
                            "Rick Hansen Secondary School of Science and Business",
                            "john_munro@sd34.bc.ca\n" +
                                    "\n" +
                                    "david_dewit@sd34.bc.ca\n" +
                                    "\n" +
                                    "Stephen_Fowler@sd34.bc.ca\n" +
                                    "\n" +
                                    "jennifer_bell@sd34.bc.ca");
            dbHandler.addProduct(calibrateNormal);

            Product saHali =
                    new Product("Sa-Hali Family of Schools",
                            "To focus on project-based learning that supports elementary, secondary and university teachers co-designing and implementing cross-curricular learning tasks and appropriate evaluation tools.",
                            "Partnership Projects",
                            "Trades / Skills / Career Development",
                            "Kamloops/Thompson",
                            "Dufferin Elementary, McGowan Park Elementary, Pacific Way Elementary, Summit Elementary, Sa-Hali Secondary",
                            "Jake Schmidt: jschmidt@sd73.bc.ca\n" +
                                    "\n" +
                                    "Sean Lamoureux: slamoureux@sd73.bc.ca");
            dbHandler.addProduct(saHali);

            Product teachLearnStrat =
                    new Product("Teaching and learning strategies",
                            "To include a suite of innovative teaching and learning strategies for all teachers and students, including inquiry-based learning, hands-on exploration and learning empowered by technology.",
                            "Partnership Projects",
                            "Experiential learning",
                            "Coquitlam",
                            "Eagle Mountain Middle",
                            "kemurray@sd43.bc.ca \n" +
                                    "\n" +
                                    "nlbennett@sd43.bc.ca\n" +
                                    "\n" +
                                    "bbuczewski@sd43.bc.ca\n" +
                                    "\n" +
                                    "jfong@sd43.bc.ca");
            dbHandler.addProduct(teachLearnStrat);

            Product templetonSTEM =
                    new Product("Templeton STEM Program",
                            "To provide students access to STEM programming and help them develop math and science skills through enriched educational experiences.",
                            "Partnership Projects",
                            "Experiential learning",
                            "Vancouver",
                            "Templeton Secondary School",
                            "pmacmillan@vsb.bc.ca\n" +
                                    "adavis@vsb.bc.ca");
            dbHandler.addProduct(templetonSTEM);

            Product inspireProj =
                    new Product("The ins-PI-re Project",
                            "To inspire students to engage with the Raspberry Pi, a small computer to help students learn programming.",
                            "Partnership Projects",
                            "Trades / Skills / Career Development",
                            "Langley",
                            "James Kennedy Elementary",
                            "apimentel@sd35.bc.ca\n" +
                                    "\n" +
                                    "mguillou@sd35.bc.ca\n" +
                                    "\n" +
                                    "mgore@sd35.bc.ca");
            dbHandler.addProduct(inspireProj);

            Product multiGrade =
                    new Product("The Multi-Grade Approach to Learning",
                            "To take an unbiased look at multi-grade classrooms where there is a blending of curriculum and students across multiple grade levels.",
                            "Partnership Projects",
                            "Multi-grade classrooms",
                            "Vancouver Island North",
                            "BC Rural and Multi-Grade Teachers’ Association",
                            "Shirley Giroux\n" +
                                    "President, BC Rural & Multigrade\n" +
                                    "Teachers’ Assn\n" +
                                    "Shirley.giroux@sd27.bc.ca\n" +
                                    "\n" +
                                    "Heather Johnson,\n" +
                                    "Principal/teacher,\n" +
                                    "Sea View School, Port Alice,\n" +
                                    "hjohnson@sd85.bc.ca\n" +
                                    "\n" +
                                    "Scott Benwell,\n" +
                                    "Superintendent SD85 \n" +
                                    "sbenwell@sd85.bc.ca");
            dbHandler.addProduct(multiGrade);

            Product moduleTeach =
                    new Product("Using a Module Approach for Teaching and Learning",
                            "Inspired by the Grades 10-12 English Language Arts curriculum proposal, SD 42 endeavours to pilot the module design as suggested in the draft.",
                            "Partnership Projects",
                            "Multi-grade classrooms",
                            "Maple Ridge-Pitt Meadows",
                            "Thomas Haney Secondary School, Pitt Meadows Secondary School, Garibaldi Secondary School, Westview Secondary School",
                            "Kirsten Urdahl-Serr\n" +
                                    "Teacher\n" +
                                    "Kirsten_Urdahl-Serr@sd42.bc.ca\n" +
                                    "\n" +
                                    "\n" +
                                    "Sylvia Russell\n" +
                                    "Superintendent\n" +
                                    "Maple Ridge – Pitt Meadows School District\n" +
                                    "sylvia_russell@sd42.ca");
            dbHandler.addProduct(moduleTeach);

            isInDB = true;
        }

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(DataBase.this, StartActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }

        }, SPLASH_TIME_OUT);
    }

    public void onClick(View view) {
        Intent intent = new Intent(DataBase.this, FlipContent.class);
        startActivity(intent);
    }


    //Code below for future reference if needed.

/*    //Adds new Product given from the views
    public void newProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        String description =
                descriptionBox.getText().toString();

        String type =
                productTypeBox.getText().toString();

        String purpose =
                productPurposeBox.getText().toString();

        String location =
                productLocationBox.getText().toString();

        String schools =
                productSchoolsBox.getText().toString();

        String contacts =
                productContactsBox.getText().toString();

        Product product =
                new Product(productBox.getText().toString(), description, type, purpose, location, schools, contacts);

        dbHandler.addProduct(product);
        productBox.setText("");
        descriptionBox.setText("");
        productTypeBox.setText("");
        productPurposeBox.setText("");
        productLocationBox.setText("");
        productSchoolsBox.setText("");
        productContactsBox.setText("");
    }

    //Find product in database onClick
    public void lookupProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null, null, 1);

        Product product =
                dbHandler.findProduct(idView.getText().toString());

        if (product != null) {
            idView.setText(String.valueOf(product.getID()));
            productBox.setText(String.valueOf(product.getProduct()));
            descriptionBox.setText(String.valueOf(product.getDescription()));
            productTypeBox.setText(String.valueOf(product.getProductType()));
            productPurposeBox.setText(String.valueOf(product.getProductPurpose()));
            productLocationBox.setText(String.valueOf(product.getProductLocation()));
            productSchoolsBox.setText(String.valueOf(product.getProductSchools()));
            productContactsBox.setText(String.valueOf(product.getProductContacts()));


            *//*Used for changing url to image and puts it to imageview
            Gets file path of image and sets it to the image view

            File imgFile = new  File(String.valueOf(product.getPicture()));
            if(imgFile.exists()){
                Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                ImageView myImage = (ImageView) findViewById(R.id.picture);
                myImage.setImageBitmap(myBitmap);
            }
            *//*

        } else {
            idView.setText("No Match Found");
        }
    }

    //Removes the product from database
    public void removeProduct (View view) {
        DBHandler dbHandler = new DBHandler(this, null,
                null, 1);

        //If deleted, will return true
        boolean result = dbHandler.deleteProduct(
                productBox.getText().toString());

        if (result)
        {
            idView.setText("Record Deleted");
            productBox.setText("");
            descriptionBox.setText("");
            productTypeBox.setText("");
            productPurposeBox.setText("");
            productLocationBox.setText("");
            productSchoolsBox.setText("");
            productContactsBox.setText("");
        }
        else
            idView.setText("No Match Found");
    }*/
}