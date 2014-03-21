package com.example.javaproject;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.javaproject.models.Person;

public class AbilitiesAdapter extends ArrayAdapter<String>  {
	  Activity activity;

	 public AbilitiesAdapter(Activity context, int resource, List<String> objects) {
		    super(context, resource, objects);
		    this.activity = context;
	 }
	 
	  public View getView(int position, View convertView, ViewGroup parent){
		    View v = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.template_abilities, null);
		    
		    final String currentAbility = getItem(position);

		    TextView Ability = (TextView)v.findViewById(R.id.textViewAbility);
		    Ability.setText(currentAbility.toString());
		    
		    return v;
	  }
}