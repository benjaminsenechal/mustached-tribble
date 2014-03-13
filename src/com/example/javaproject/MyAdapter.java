package com.example.javaproject;

import java.util.List;

import com.example.javaproject.models.Person;
import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<Person> {
  Activity activity;
  
  public MyAdapter(Activity context, int resource, List<Person> objects) {
    super(context, resource, objects);
    this.activity = context;
  }
  @Override
  public View getView(int position, View convertView, ViewGroup parent){
    View v = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.template_persons, null);
    
    final Person currentPeople = getItem(position);
    
    TextView FirstName = (TextView)v.findViewById(R.id.textViewFirstname);
    FirstName.setText(currentPeople.getFirstname().toString());
    
    TextView LastName = (TextView)v.findViewById(R.id.textViewLastname);
    LastName.setText(currentPeople.getLastname().toString());
    
    ImageView Avatar = (ImageView)v.findViewById(R.id.imageView1);
    Picasso.with(getContext()).load(currentPeople.getAvatar()).resize(50, 50).centerCrop().into(Avatar);

    return v;
  }
}

