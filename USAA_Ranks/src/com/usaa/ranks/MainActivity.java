package com.usaa.ranks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	final String arrayintent = "";
    final String arraynintent = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        /*
         * button declaration
         */
        final Button exit = (Button) findViewById(R.id.button5);
        final Button viewGroups = (Button) findViewById(R.id.button1);
        
        /*
         * System Exit
         */
        exit.setOnClickListener(new View.OnClickListener() {

	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	            finish();
	            System.exit(0);
	        }
	    });
        
        /*
         * On clicking View by Groups button, invoke on click listener.
         */
        viewGroups.setOnClickListener(new View.OnClickListener() {

	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	        	//System.out.println("arrayintent" + arrayintent);
	        	Intent intent = new Intent(getBaseContext(), ViewGroupActivity.class);
	        	String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
	        	        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
	        	        "Linux", "OS/2" };
	        	/*intent.putExtra("LIST_ARRAY", arrayintent.substring(0, arrayintent.length()-1));
	        	intent.putExtra("NUMBER_ARRAY", arraynintent.substring(0, arraynintent.length()-1));
	        	*
	        	*///intent.putStringArrayListExtra("LIST_ARRAY", data);
	        	intent.putExtra("OS", values);
	        	
	        	startActivity(intent);
	        	
	        }
	    });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
