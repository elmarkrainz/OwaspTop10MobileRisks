package at.fhj.secswdev.owasptop10mobilerisks.m7;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import at.fhj.secswdev.owasptop10mobilerisks.R;
import at.fhj.secswdev.owasptop10mobilerisks.m5.SecureActivity;

public class ActivityM7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m7);
    }

    public boolean checkUser(View v) {

        EditText txtUser = (EditText) findViewById(R.id.editText1);
        EditText txtPass = (EditText) findViewById(R.id.editText2);

        SQLiteDatabase mydatabase = openOrCreateDatabase("sqlinj_db", MODE_PRIVATE, null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS users(Username VARCHAR,Password VARCHAR);");
        mydatabase.execSQL("Delete FROM users;");

        mydatabase.execSQL("INSERT INTO users VALUES('MyUser','MyPass');");
        mydatabase.execSQL("INSERT INTO users VALUES('user','pass');");

        String sql = "Select * from users where Username = '" + txtUser.getText().toString() + "' and Password ='" + txtPass.getText().toString() + "'";
        System.out.println(sql);

        Cursor resultSet = mydatabase.rawQuery(sql, null);


        TextView t = (TextView) findViewById(R.id.txtloginstatus);
        if (resultSet.getCount() > 0) {


            t.setText("LOGIN OK");
            Log.i("M7", "Login OK");

            // go on to secure part
            // Intent intent = new Intent( this, SecureActivity.class);
            // startActivity(intent);
        } else {

            t.setText("ACCESS DENIED");
        }


        // check DB entries
       /* String query = "SELECT  * FROM users ";

        Cursor cursor = mydatabase.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                Log.i("DB", cursor.getString(1));

            } while (cursor.moveToNext());
        }
          // User: MyUser, Pass: 'or '1' = '1' results in a SQL Injection
        */
        return false;
    }
}
