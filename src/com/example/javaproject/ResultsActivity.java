package com.example.javaproject;

import java.util.ArrayList;
import java.util.List;

import com.epsi.eiwd306.Provider;
import com.epsi.eiwd306.beans.Person;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class ResultsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		this.setTitle("Resultats");
		Intent myIntent = getIntent(); 
		List<Person> result = new ArrayList<Person>();
		result = Provider.searchPerson(myIntent.getStringExtra("nom"), myIntent.getStringExtra("prenom"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.results, menu);
		return true;
	}

}
