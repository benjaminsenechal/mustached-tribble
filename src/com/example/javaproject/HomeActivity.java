package com.example.javaproject;

import java.util.ArrayList;
import java.util.List;

import com.example.javaproject.models.Person;
import com.example.javaproject.models.Provider;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		this.setTitle("Recherche");
		Button button = (Button)findViewById(R.id.rechercheButton);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Button caller = (Button)v;
		EditText prenomEditText = (EditText)findViewById(R.id.prenomEditText);
		EditText nomEditText = (EditText)findViewById(R.id.nomEditText);
		String prenom = prenomEditText.getText().toString();
		String nom = nomEditText.getText().toString();
		
		if(caller.getId() == R.id.rechercheButton){
			List<Person> result = new ArrayList<Person>();
			result = Provider.searchPerson(nom, prenom);
			if(result.isEmpty()){
				Toast.makeText(getApplicationContext(), "Nom ou Prénom incorrect!", Toast.LENGTH_SHORT).show();
			}else{		
				Intent myIntent = new Intent(this, ResultsActivity.class);
				myIntent.putExtra("prenom",prenom );
				myIntent.putExtra("nom",nom);
				startActivity(myIntent);
			}
		}
	}
}
