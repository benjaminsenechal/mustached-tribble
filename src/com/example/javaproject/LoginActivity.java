package com.example.javaproject;

import com.example.javaproject.models.Provider;
import com.example.javaproject.models.User;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

public class LoginActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
        this.setTitle("Connexion");
     
		Button button = (Button)findViewById(R.id.buttonConnexion);
		button.setOnClickListener(this);

	}
	
	public void onClick(View v){
		Button caller = (Button)v;
		EditText login = (EditText)findViewById(R.id.loginText);
		EditText password = (EditText)findViewById(R.id.passwordText);
		User u;
		
		if(caller.getId() == R.id.buttonConnexion){	
			u = Provider.login(login.getText().toString(), password.getText().toString());
			if (u == null){
				Toast.makeText(getApplicationContext(), "Mauvais login ou mot de passe", Toast.LENGTH_SHORT).show();
			}else{
				Toast.makeText(getApplicationContext(), "Bonjour " + u.getPseudo(), Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(this, HomeActivity.class);
			    startActivity(intent);
			    finish();
			}
		}
	}
}
