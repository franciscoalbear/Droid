package com.example.prueba1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
 
		switch(keyCode){
			case KeyEvent.KEYCODE_DPAD_RIGHT:
				Toast.makeText(this, "boton derecha presionado",
                                                        Toast.LENGTH_SHORT).show();
				return true;
			case KeyEvent.KEYCODE_VOLUME_UP:
				Toast.makeText(this, "Boton de volumen alto presionado",
                                                        Toast.LENGTH_SHORT).show();
				return true;
			case KeyEvent.KEYCODE_VOLUME_DOWN:
				Toast.makeText(this, "Boton de volumen bajo presionado",
                                                        Toast.LENGTH_SHORT).show();
				return true;
			case KeyEvent.KEYCODE_DPAD_LEFT:
				Toast.makeText(this, "boton izquierda presionado",
                                                        Toast.LENGTH_SHORT).show();
				return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		float posX = event.getX();
		float posY = event.getY();
		Toast.makeText(this, "Acabas de tocar la pantalla en: " + posX + ", " + posY,
                                         Toast.LENGTH_SHORT).show();
		return true;
	}

}
