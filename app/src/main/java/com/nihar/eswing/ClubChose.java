package com.nihar.eswing;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ClubChose extends ActionBarActivity {
    String playersss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_chose);
        Intent intent = getIntent();
        playersss = intent.getStringExtra("parameter name1");
        TextView txtChosenPlayerss = (TextView)findViewById(R.id.playerss);
        txtChosenPlayerss.setText("Select Clubs from the list below for"+" "+playersss);

        Button doneButton = (Button) findViewById(R.id.button);
        doneButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), MainList.class);
//                startActivityForResult(intent, 0);
                Toast.makeText(getApplicationContext(), "Clubs chosen for"+" "+ playersss+"."+"Choose for all players", Toast.LENGTH_LONG).show();

            }
        });

        Button startplaying = (Button) findViewById(R.id.button6);
        startplaying.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Bluetooth1.class);
                startActivityForResult(intent, 0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_club_chose, menu);
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
}