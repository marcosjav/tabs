package com.labii.grosos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.labii.grosos.tabsapp.PlaceholderFragment;
import com.labii.grosos.tabsapp.R;

public class AcercaFragment extends PlaceholderFragment {

	public AcercaFragment() {
		// TODO Auto-generated constructor stub
	}
	
	@Override   //reescribo
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.acerca, container, false);
		return rootView;
	}

}
