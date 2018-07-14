package com.rbrsolutionsgmail.connector;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.ImageView;
import android.widget.TextView;

public class startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        Toolbar toolbar = findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);

        Button scanCodeButton = findViewById(R.id.scanCode);
        if (scanCodeButton != null) {
            scanCodeButton.setOnClickListener(new View.OnClickListener() {
                //problem here
                public void onClick(View view) {
                    Intent fi_intent = new Intent(startup.this, code_scanner.class);
                    startActivity(fi_intent);
                }
            });
        }

        Button loginButton = findViewById(R.id.login);
        if (loginButton != null) {
            loginButton.setOnClickListener(new View.OnClickListener() {
                //problem here
                public void onClick(View view) {
                    Intent fi_intent = new Intent(startup.this, login.class);
                    startActivity(fi_intent);
                }
            });
        }
    }
}
