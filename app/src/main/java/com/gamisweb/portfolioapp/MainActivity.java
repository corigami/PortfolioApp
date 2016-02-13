package com.gamisweb.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
        Shows a pop-up message based on which button was pressed.
     */
    public void toast(View view){
        Context context = getApplicationContext();
        String button_name = getResources().getResourceEntryName(view.getId());
        Log.v("MY APP", button_name);
        int duration = Toast.LENGTH_SHORT;
        String toastText=null;
        Boolean defaultCase=false;
        switch(button_name){
            case "button_streamer":
                toastText = "Spotify Reader";
                break;
            case "button_scores":
                toastText = "Scores";
                break;
            case "button_library":
                toastText = "Libary";
                break;
            case "button_bigger":
                toastText = "Build it Bigger";
                break;
            case "button_reader":
                toastText = "XYZ Reader";
                break;
            case "button_capstone":
                toastText = "Capstone";
                break;
            default:
                defaultCase = true;
                break;

        }
        if(!defaultCase){
            Toast toast = Toast.makeText(context, "This button will launch my " + toastText +" app!", duration);
            toast.show();
        }

    }
}
