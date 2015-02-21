package com.usaa.ranks;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.*;

public class ViewGroupActivity extends Activity {
	String[] OSname = {};
	String number = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_group);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    OSname = extras.getStringArray("OS");
		}
		String[] names = {"Private","Colonel" };
		String[] group = {"Army","Marines" };
		String[] rank = {"E-1","O-6" };
		
		List<Map<String, String>> data = new ArrayList<Map<String, String>>(3);
		   for (int i=0;i<names.length;i++) {
	            Map<String, String> datum = new HashMap<String, String>();
	            System.out.println("Names and group" + names[i] + group[i]);
	            datum.put("names",names[i]);
	            datum.put("group", group[i]+ "  "+ rank[i]);
	            data.add(datum);
	        }
		
		
		ListView listView1 = (ListView) findViewById(R.id.listview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, OSname);
		
		
		SimpleAdapter adapter1 = new SimpleAdapter(this, data, android.R.layout.simple_list_item_2, new String[] {"names","group"}, new int[] {android.R.id.text1,
                android.R.id.text2});
		
		listView1.setAdapter(adapter1);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_group, menu);
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
