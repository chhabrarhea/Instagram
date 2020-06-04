package com.example.parse;
import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class start  extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("") //Enter Parse server id
                .clientKey("")     //Enter Master Key
                .server("")         //Enter server URL
                .build());

/*Using terminal/putty connect to Parse Server and retrieve the above details*/

         ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
