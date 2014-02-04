package com.example.howsmydriving;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SubmitRatings extends Activity {

	//Components of the StoreData Service.
	private final String NAMESPACE = "http://DefaultNamespace";
	private final String URL = "http://www.w3schools.com/webservices/tempconvert.asmx";
	private final String SOAPACTION = "http://tempuri.org/FahrenheitToCelsius";;
	private final String METHOD = "FahrenheitToCelsius";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_ratings);
        
        
        final Button button = (Button) findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.submit_ratings, menu);
        return true;
    }
    
}
