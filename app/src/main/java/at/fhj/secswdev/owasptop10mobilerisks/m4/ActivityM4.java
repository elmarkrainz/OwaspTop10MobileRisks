package at.fhj.secswdev.owasptop10mobilerisks.m4;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import at.fhj.secswdev.owasptop10mobilerisks.R;

public class ActivityM4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
    }

    public void getClip(View v) {
        TextView t = (TextView) findViewById(R.id.textClip);


        ClipboardManager myClipboard;
        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);


        ClipData abc = myClipboard.getPrimaryClip();

        if (abc !=null) {
            ClipData.Item item = abc.getItemAt(0);
            String text = item.getText().toString();

            Toast.makeText(getApplicationContext(), text,
                    Toast.LENGTH_LONG).show();

            t.setText(text);
        }
        else
        {
            t.setText("clipboard is empty");
        }

    }


}
