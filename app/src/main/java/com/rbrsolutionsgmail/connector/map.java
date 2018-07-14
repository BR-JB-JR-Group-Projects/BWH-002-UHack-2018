package com.rbrsolutionsgmail.connector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
