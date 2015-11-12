package at.fhj.secswdev.owasptop10mobilerisks.m5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import at.fhj.secswdev.owasptop10mobilerisks.R;

public class ActivityM5Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5_start);

    }

    // M5 - Poor Authorization and Authentication
    public boolean checkUser(View v) {

        EditText txtUser = (EditText) findViewById(R.id.editText1);
        EditText txtPass = (EditText) findViewById(R.id.editText2);


        if (txtUser.getText().toString().equals("user") && txtPass.getText().toString().equals("pass")) {
            Intent intent = new Intent(this, SecureActivity.class);
            startActivity(intent);
        }
        return false;

    }
}
