package com.rbrsolutionsgmail.connector;

import android.app.Application;
import java.lang.String;

public class global_variables extends Application{
    private String username = "";

    //PROFILE STUFF

    //QR EVENT

    public String getUserData(){
        return username;
    }

    public void setUserData(String d){
        username = d;
    }
}

