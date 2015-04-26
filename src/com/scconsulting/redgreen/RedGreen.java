package com.scconsulting.redgreen;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RedGreen extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_green);
        
        // Get the root view in our layout.
        // The root view is a RelativeLayout, to which we assigned the ID "layout",
        //    so we can get this view with "findViewById(R.id.layout)".     
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
        
        // We will use the WindowManager to change the screen brightness.
        // We need to set a parameter in the WindowManager that determines screen brightness,
        //    so we will get the WindowManager's "LayoutParams".
        final WindowManager.LayoutParams layoutParams = this.getWindow().getAttributes();
                
        // Get a handle, or a way to reference, the first button in our layout.
        // The first button has the ID "button1",
        //    so we can get this button with "findViewById(R.id.button1)".
        Button buttonred = (Button) findViewById(R.id.button1);
        
        // Set up a "listener" for the button.
        // This listener is an "OnClickListener", which listens for someone to click this button. 
        buttonred.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				
				// We named our reference to the root (main) layout view "layout".
				// Now change the background color of "layout" to change the color of the entire screen.
				layout.setBackgroundColor(Color.RED);
				
				// Set the screen brightness to its highest brightness, using the value 1.0.
				layoutParams.screenBrightness = 1.0F;
				getWindow().setAttributes(layoutParams);
				
			}
		});
        
        Button buttongreen = (Button) findViewById(R.id.button2);
        buttongreen.setOnClickListener(new View.OnClickListener() {
            
        	@Override
        	public void onClick(View view) {
        		
            	layout.setBackgroundColor(Color.GREEN);
            	layoutParams.screenBrightness = 1.0F;
            	getWindow().setAttributes(layoutParams);
            	
            }
        });
        
        Button buttonwhite = (Button) findViewById(R.id.button3);
        buttonwhite.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View view) {
            	
        		layout.setBackgroundColor(Color.WHITE);
            	layoutParams.screenBrightness = 1.0F;
            	getWindow().setAttributes(layoutParams);
            	
            }
        });

        Button buttonnorm = (Button) findViewById(R.id.button4);
        buttonnorm.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View view) {
        		
            	layout.setBackgroundColor(Color.WHITE);
            	
            	// Set the screen brightness to its default brightness, using the value -1.
            	layoutParams.screenBrightness = -1F;
            	getWindow().setAttributes(layoutParams);
            
        	}
        });
 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.red_green, menu);
		return true;
	}

}