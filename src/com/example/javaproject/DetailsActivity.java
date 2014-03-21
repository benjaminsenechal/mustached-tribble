package com.example.javaproject;

import java.util.ArrayList;
import java.util.List;

import com.example.javaproject.models.Person;
import com.example.javaproject.models.Provider;
import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailsActivity extends Activity{
	Intent MyIntent;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		
		MyIntent = getIntent();
		int id = MyIntent.getIntExtra("person_id", 0);
		
		Person Person = Provider.getPersonById(id);
		this.setTitle(Person.getFirstname());
		
	    ImageView Avatar = (ImageView)findViewById(R.id.imageViewAvatar);
	    Picasso.with(getApplicationContext()).load(Person.getAvatar()).resize(150, 150).centerCrop().into(Avatar);
	    
	    TextView textViewFirstname = (TextView)findViewById(R.id.textViewFirstname);
	    TextView textViewLastname = (TextView)findViewById(R.id.textViewLastname); 
	    TextView textViewPhoneNumber = (TextView)findViewById(R.id.textViewPhoneNumber); 
	    TextView textViewDescription = (TextView)findViewById(R.id.textViewDescription); 
	    TextView textViewEmail = (TextView)findViewById(R.id.textViewEmail); 
	    ListView listViewAbilities = (ListView)findViewById(R.id.listViewAbilities);

	    textViewFirstname.setText(Person.getFirstname());
	    textViewLastname.setText(Person.getLastname());
	    textViewDescription.setText(Person.getDescription());
	    textViewPhoneNumber.setText(Person.getPhoneNumber());
	    textViewEmail.setText(Person.getEmail());
	    
		List<String> Abilities = new ArrayList<String>();
		Abilities = Person.getAbilities();
		
		AbilitiesAdapter Adapter = new AbilitiesAdapter(this,R.layout.template_persons, Abilities);
		listViewAbilities.setAdapter(Adapter);	
	}
}
