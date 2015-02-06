package br.com.ricardolonga.robolectricsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import br.com.ricardolonga.robolectricsample.custom.EditTextComValidacao;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void verify(View v) {
		EditTextComValidacao email = (EditTextComValidacao) findViewById(R.id.campoEmail);
		
		if (!email.isValid()) {
			Toast.makeText(this, "Email inválido", Toast.LENGTH_SHORT).show();
			return;
		}
		
		Toast.makeText(this, "Email válido", Toast.LENGTH_SHORT).show();
	}
	
}
