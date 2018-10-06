package br.gov.sp.etec.sucessor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText editTextValor;
	private EditText editTextSucessor;
	private Button buttonSucessor;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editTextValor = (EditText) findViewById(R.id.editTextValor);
        editTextSucessor = (EditText) findViewById(R.id.editTextSucessor);
        buttonSucessor = (Button) findViewById(R.id.buttonSucessor);
        
        buttonSucessor.setOnClickListener(
        		new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						String valor = editTextValor.getText().toString();
						int valorConvertido = Integer.parseInt(valor);
						
						int sucessor = valorConvertido + 1;
						editTextSucessor.setText(String.valueOf(sucessor));
					}
				}
        		
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
