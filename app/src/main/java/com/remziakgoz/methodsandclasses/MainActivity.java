package com.remziakgoz.methodsandclasses;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    
    String username;
/*    String musician1;
    String musician2;
    int age1;
    int age2;
    String instrument1;
    String instrument2; */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        System.out.println("on Create called");

        makeHeroes();

        makeSimpons();

        testMethod();

        System.out.println(math(5,3));

        System.out.println(myString("Busra ","Nur"));

        System.out.println(newMethod("remzi"));

        username = "";



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
    }


    public void makeSimpons() {

        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        //homer.age = 51;
        //System.out.println(homer.age);
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());



    }





    public void makeHeroes(){

        //instance

       /* Heroes Captain = new Heroes();
        Captain.weapon = "Shield";
        Captain.damage = 90;
        Captain.name = "Captain"; */

        Heroes Captain = new Heroes("Captain","Shield",100);

        System.out.println(Captain.weapon);




    }










    public void testMethod() {

        username = "Kirk";
        int x = 4 + 4;
        System.out.println("value of x: "+x);
    }


    public int math(int a,int b) {

        username = "Rob";
        return a + b;
    }

    public String myString(String a,String b) {
        username = "Samanci";
        return a + b;

    }


    public String newMethod(String string) {
        return string + " new Method";

    }



    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");
    }


    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");
    }


}