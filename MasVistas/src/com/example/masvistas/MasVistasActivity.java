package com.example.masvistas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author migue
 *
 */
public class MasVistasActivity extends Activity {
	private EditText entrada;
	private TextView salida;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		entrada = (EditText) findViewById(R.id.entrada);
		salida = (TextView)  findViewById(R.id.salida);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * @param view
	 */
	public void sePulsa(View view) {

		salida.setText(String.valueOf(
			       Float.parseFloat(entrada.getText().toString())*2.0));
	}
	
	public void sePulsa0(View view){
	      entrada.setText(entrada.getText()+(String)view.getTag());
	    }  

	/**
	 * @return the entrada
	 */
	public EditText getEntrada() {
		return entrada;
	}

	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(EditText entrada) {
		this.entrada = entrada;
	}

	/**
	 * @return the salida
	 */
	public TextView getSalida() {
		return salida;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(TextView salida) {
		this.salida = salida;
	}

}
