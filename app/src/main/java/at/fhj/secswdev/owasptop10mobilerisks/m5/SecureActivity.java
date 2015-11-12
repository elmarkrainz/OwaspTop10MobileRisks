package at.fhj.secswdev.owasptop10mobilerisks.m5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import at.fhj.secswdev.owasptop10mobilerisks.R;

public class SecureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_m5_secure);
	}



	// to start and bypass authentification
	//adb shell
	// am start -n at.fhj.secswdev.owasptop10mobilerisks/.m5.SecureActivity

}
