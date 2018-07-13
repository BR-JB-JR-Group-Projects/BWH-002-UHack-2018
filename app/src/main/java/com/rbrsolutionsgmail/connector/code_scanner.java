package com.rbrsolutionsgmail.connector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

public class code_scanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_scanner);
        Toolbar toolbar = findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        instantiateGUI();
    }

    public void instantiateGUI(){
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
    }

    public void onNothingSelected(AdapterView<?> parent) {
    }

}
