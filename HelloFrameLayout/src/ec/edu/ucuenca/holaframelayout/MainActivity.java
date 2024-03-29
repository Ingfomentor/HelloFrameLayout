package ec.edu.ucuenca.holaframelayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button btn;
	ImageView imgv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.btnMostrar);
		imgv = (ImageView) findViewById(R.id.imgViewAndroid);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void showIcon(View v){
		btn.setVisibility(View.INVISIBLE);
		imgv.setVisibility(View.VISIBLE);
	}

}
