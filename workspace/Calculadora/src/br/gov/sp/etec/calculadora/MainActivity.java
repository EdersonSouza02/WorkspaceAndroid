package br.gov.sp.etec.calculadora;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText editTextValor1;
	private EditText editTextValor2;
	private EditText editTextResultado;
	private Button buttonAdicao;
	private Button buttonDiv;
	private Button buttonSub;
	private Button buttonMulti;
	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	editTextValor1 = (EditText) findViewById(R.id.editTextValor1);
    	editTextValor2 = (EditText) findViewById(R.id.editTextValor2);
    	editTextResultado = (EditText) findViewById(R.id.editTextResultado);
    	buttonAdicao = (Button)findViewById(R.id.buttonAdicao);
    	buttonDiv = (Button)findViewById(R.id.buttonDiv);
    	buttonSub = (Button)findViewById(R.id.buttonSub);
    	buttonMulti = (Button)findViewById(R.id.buttonMulti);
    	
    	buttonAdicao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int valor1 = Integer.parseInt(editTextValor1.getText().toString());
				int valor2 = Integer.parseInt(editTextValor2.getText().toString());
				
				int resultado = valor1+valor2;
				
				editTextResultado.setText(String.valueOf(resultado));
				
			}
		});
    	
    	buttonDiv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int valor1 = Integer.parseInt(editTextValor1.getText().toString());
				int valor2 = Integer.parseInt(editTextValor2.getText().toString());
				
				int resultado = valor1/valor2;
				
				editTextResultado.setText(String.valueOf(resultado));
				
			}
		});
        buttonMulti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int valor1 = Integer.parseInt(editTextValor1.getText().toString());
				int valor2 = Integer.parseInt(editTextValor2.getText().toString());
				
				int resultado = valor1*valor2;
				
				editTextResultado.setText(String.valueOf(resultado));
				
			}
		});
        buttonSub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				int valor1 = Integer.parseInt(editTextValor1.getText().toString());
				int valor2 = Integer.parseInt(editTextValor2.getText().toString());
				
				int resultado = valor1-valor2;
				
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
