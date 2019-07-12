package com.gmail.emef4z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring the two variables for the two buttons
    private Button about_button;
    private Button profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising the two variables by getting it's id using findViewById()
        about_button = (Button) findViewById(R.id.about_btn);
        profile_button = (Button) findViewById(R.id.my_profile_btn);

        //Setting an onClickListener to the button variable to enable it to be clickable
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Declaring and initialising our intents by passing in the context
                // and the destination for it to goto
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);

                //Passing in the declared intent to startActivity() to start the activity
                startActivity(intent);

            }
        });


        //Setting an onClickListener to the button variable to enable it to be clickable
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
