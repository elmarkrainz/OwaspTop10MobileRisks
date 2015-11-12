package at.fhj.secswdev.owasptop10mobilerisks.m2;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.EditText;


import at.fhj.secswdev.owasptop10mobilerisks.R;


public class ActivityM2 extends Activity {

    private static final String APP_PREFS = "app-prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);


        //M2 - Insecure Data Storage


        SharedPreferences sharedPreferences = getSharedPreferences(APP_PREFS, Context.MODE_WORLD_READABLE);
        Editor editor = sharedPreferences.edit();
        editor.putString("password", "p455w0rd");
        editor.commit();


        EditText et = (EditText) findViewById(R.id.editText2);
        et.setText(sharedPreferences.getString("password", ""));

    }


}
