package com.example.javaproject;

import java.util.ArrayList;
import java.util.List;
import com.example.javaproject.models.Person;
import com.example.javaproject.models.Provider;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ResultsActivity extends Activity {
	Intent myIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		this.setTitle("Resultats");
		myIntent = getIntent(); 
		
		ListView listView = (ListView)findViewById(R.id.listView);
		
		List<Person> result = new ArrayList<Person>();
		result = Provider.searchPerson(myIntent.getStringExtra("nom"), myIntent.getStringExtra("prenom"));
		
		MyAdapter Adapter = new MyAdapter(this,R.layout.template_persons,result);
		listView.setAdapter(Adapter);	
	
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Person p = (Person) arg0.getItemAtPosition(arg2);

				myIntent = new Intent(ResultsActivity.this, DetailsActivity.class).putExtra("person_id", p.getId());
				startActivity(myIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

}
