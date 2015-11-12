package at.fhj.secswdev.owasptop10mobilerisks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import at.fhj.secswdev.owasptop10mobilerisks.m2.ActivityM2;
import at.fhj.secswdev.owasptop10mobilerisks.m3.ActivityM3;
import at.fhj.secswdev.owasptop10mobilerisks.m4.ActivityM4;
import at.fhj.secswdev.owasptop10mobilerisks.m5.ActivityM5Start;
import at.fhj.secswdev.owasptop10mobilerisks.m6.ActivityM6;
import at.fhj.secswdev.owasptop10mobilerisks.m7.ActivityM7;

/**
 * Examples for M2- M10
 *
 * based on Owasp Mobile top 10m Risk
 *
 * Elmar Krainz
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startM2(View v) {
        startActivity(new Intent(this, ActivityM2.class));
    }

    public void startM3(View v) {
        startActivity(new Intent(this, ActivityM3.class));
    }

    public void startM4(View v) {
        startActivity(new Intent(this, ActivityM4.class));
    }

    public void startM5(View v) {
        startActivity(new Intent(this, ActivityM5Start.class));
    }

    public void startM6(View v) {
        startActivity(new Intent(this, ActivityM6.class));
    }

    public void startM7(View v) {
        startActivity(new Intent(this, ActivityM7.class));
    }




}
