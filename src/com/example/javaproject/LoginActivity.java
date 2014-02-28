package com.example.javaproject;

import com.epsi.eiwd306.Provider;
import com.epsi.eiwd306.beans.User;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class LoginActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
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
				System.out.println("Fail");
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder
				.setTitle("Erreur")
				.setMessage("Mauvais login ou mot de passe")
				.setPositiveButton(
						"OK", 
						new DialogInterface.OnClickListener(){
							@Override
							public void onClick(DialogInterface dialog, int which) {
								dialog.cancel();
							}
				 })
				.show();
			}else{
				Intent intent = new Intent(this, HomeActivity.class);
			    startActivity(intent);
			    finish();
			}
		}

	}
}
