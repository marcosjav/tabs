package com.labii.grosos.apps;

import com.labii.grosos.tabsapp.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class CalculatorItemsListener implements OnItemSelectedListener {
	EditText primerTermino, segundoTermino;
	TextView resultados;
	
	public CalculatorItemsListener(EditText primerTermino, EditText segundoTermino, TextView resultados) {
		// TODO Auto-generated constructor stub
		this.primerTermino = primerTermino;
		this.segundoTermino = segundoTermino;
		this.resultados = resultados;
	}

	/**
	 *	Acción que se van a realizar según la selección del spinner 
	 */
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		if(position==0) 									// A PARTIR DE LA API 14 NO HAY MÁS PROMPT, USO LA PRIMER
			return;											// OPCIÓN COMO TAL
		
		Spinner spinner = (Spinner)parent.findViewById(R.id.spOperaciones);
		spinner.setSelection(0);
		
		Calculator calculo = new Calculator();
		String texto = new String(); 
				
		try {
			texto = calculo.operar(primerTermino.getText().toString(), segundoTermino.getText().toString(), position);
		} catch (Exception e) {
			Toast.makeText(parent.getContext(), e.toString(), Toast.LENGTH_SHORT).show();
			spinner.setSelection(0);
			return;
		}
		Toast.makeText(parent.getContext(), texto, Toast.LENGTH_SHORT).show();
		resultados.setText(texto + "\n" + resultados.getText().toString());
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}

}
