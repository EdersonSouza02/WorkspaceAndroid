
package br.gov.sp.etec.primeiraaplicacao;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText editTextNome;
	private EditText editTextMostrarNome;
	private Button buttonMostrar;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextMostrarNome = (EditText) findViewById(R.id.editTextMostarNome);
        buttonMostrar = (Button) findViewById(R.id.buttonMostrar);
        
        buttonMostrar.setOnClickListener(
        	new View.OnClickListener() {
				
			@Override
			public void onClick(View arg0) {
				
				String mostra = editTextNome.getText().toString();
				
				editTextMostrarNome.setText(mostra);
				
			}
			});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
