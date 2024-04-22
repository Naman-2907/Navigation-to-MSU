package com.example.navigationtomsu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button navigateButton = findViewById(R.id.navigate_button);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the navigateToMSU method when the button is clicked
                navigateToMSU(v);
            }
        });
    }

    // Method to navigate to Montclair State University
    public void navigateToMSU(View view) {
        // uri to have the exact co-ordinates to MSU
        Uri gmmIntentUri = Uri.parse("google.navigation:q=40.8644624104021, -74.19858111477711");

        //setting the action to action view
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        // Making the intent
        mapIntent.setPackage("com.google.android.apps.maps");

        // Starting the activity
        startActivity(mapIntent);
    }
}
