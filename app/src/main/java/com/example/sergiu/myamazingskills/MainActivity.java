package com.example.sergiu.myamazingskills;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    private Button button;
    private Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.loginButton);
        buttonHome = (Button) findViewById(R.id.homeButton);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.loginButton){
            onClickLogin();
        }

        if(v.getId() == R.id.homeButton){
            onClickHome();
        }
    }

    private void onClickLogin(){
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void onClickHome(){
        startActivity(new Intent(this, MainActivity.class));
    }
}
