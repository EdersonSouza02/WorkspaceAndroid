package br.gov.sp.etec.calculadora2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText editTextValor;
	private EditText editTextResultado;
	private Button buttonElevadoQuadrado;
	private Button buttonbuttonDivididoDois;
	private Button buttonVezesDois;
	private Button buttonPorcentagem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editTextValor = (EditText) findViewById(R.id.editTextValor);
		editTextResultado = (EditText) findViewById(R.id.editTextResultado);
		buttonElevadoQuadrado = (Button) findViewById(R.id.buttonElevadoQuadrado);
		buttonbuttonDivididoDois = (Button) findViewById(R.id.buttonDivididoDois);
		buttonVezesDois = (Button) findViewById(R.id.buttonVezesDois);
		buttonPorcentagem = (Button) findViewById(R.id.buttonPorcentagem);

		buttonElevadoQuadrado.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				int x = Integer.parseInt(editTextValor.getText().toString());

				int resultado = x * x;

				editTextResultado.setText(String.valueOf(resultado));

			}
		});
		buttonbuttonDivididoDois.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int x = Integer.parseInt(editTextValor.getText().toString());

				int resultado = x / 2;

				editTextResultado.setText(String.valueOf(resultado));

				
			}
		});
		buttonVezesDois.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int x = Integer.parseInt(editTextValor.getText().toString());

				int resultado = x * 2;

				editTextResultado.setText(String.valueOf(resultado));

				
			}
		});
		buttonPorcentagem.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int x = Integer.parseInt(editTextValor.getText().toString());

				double resultado = x * 0.1;

				editTextResultado.setText(String.valueOf(resultado));

				
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
