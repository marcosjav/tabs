package com.labii.grosos.fragments;


import com.labii.grosos.tabsapp.PlaceholderFragment;
import com.labii.grosos.tabsapp.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CalculatorFragment extends PlaceholderFragment {

	public CalculatorFragment() {

	}

	@Override   //reescribo
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.calculator, container, false);
		return rootView;
	}

}
