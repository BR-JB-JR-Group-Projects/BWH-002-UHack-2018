package com.rbrsolutionsgmail.connector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Calendar;

public class code_scanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_scanner);
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
