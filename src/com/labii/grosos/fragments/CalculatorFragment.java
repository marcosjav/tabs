package com.labii.grosos.fragments;


import com.labii.grosos.apps.Calculator;
import com.labii.grosos.apps.CalculatorItemsListener;
import com.labii.grosos.tabsapp.PlaceholderFragment;
import com.labii.grosos.tabsapp.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculatorFragment extends PlaceholderFragment {

	public CalculatorFragment() {

	}

	@Override   //reescribo
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.calculator, container, false);
		
        Spinner spinner = (Spinner)rootView.findViewById(R.id.spOperaciones);
		TextView resultados = (TextView)rootView.findViewById(R.id.tvHistorial);
		EditText primerTermino = (EditText)rootView.findViewById(R.id.etPrimerTermino);
		EditText segundoTermino = (EditText)rootView.findViewById(R.id.etSegundoTermino);
        
		CalculatorItemsListener listener = new CalculatorItemsListener(primerTermino, segundoTermino, resultados);
		
        spinner.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, Calculator.FUNCTIONS));

        spinner.setOnItemSelectedListener(listener);
		
		return rootView;
	}

}
