package at.fhj.secswdev.owasptop10mobilerisks.m3;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import at.fhj.secswdev.owasptop10mobilerisks.R;


public class ActivityM3 extends Activity {

    TextView textResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);

    textResponse = (TextView) findViewById(R.id.txtResponse);


        // M3 - Insufficient Transport Layer Protection
        String googleApiUrl = "http://maps.googleapis.com/maps/api/geocode/json?address=werk-vi-strasse,%2046,%208605%20kapfenberg,%20austria&sensor=false";


        HttpHelper helper = new HttpHelper();
        helper.execute(googleApiUrl);

    }

    public class HttpHelper extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {


            StringBuilder out = new StringBuilder();
            try {

                // get the string parameter from execute()
                URL url = new URL(params[0]);

                // create Urlconnection
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                // read inputstrem
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line;
                while ((line = reader.readLine()) != null) {
                    out.append(line);
                }
                Log.i("INTERNET", out.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }

            return out.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            // do something with results from do-in-background method
            textResponse.setText(s);

        }
    }

}
