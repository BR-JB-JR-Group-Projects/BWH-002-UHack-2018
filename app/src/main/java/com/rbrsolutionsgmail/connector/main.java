package com.rbrsolutionsgmail.connector;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.Intent;
import android.widget.Button;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scanCodeButton = (Button)findViewById(R.id.scanCode);
        if (scanCodeButton != null) {
            scanCodeButton.setOnClickListener(new View.OnClickListener(){
                //problem here
                public void onClick(View view){
                    Intent fi_intent = new Intent(main.this, code_scanner.class );
                    startActivity(fi_intent);
                }
            });
        }
    }
}
