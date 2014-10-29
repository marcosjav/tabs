package com.labii.grosos.tabsapp;

import com.labii.grosos.fragments.AcercaFragment;
import com.labii.grosos.fragments.CalculatorFragment;
import com.labii.grosos.fragments.ImageDownloaderFragment;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	//private static final String ARG_SECTION_NUMBER = "section_number";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static PlaceholderFragment newInstance(int sectionNumber,Activity activity) {
//////////////////////// esto crea una nueva instancia cada vez que cambio de tab infinitamente
		PlaceholderFragment fragment = new PlaceholderFragment();
//		Bundle args = new Bundle();
//		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//		fragment.setArguments(args);
//		return fragment;
		
		switch (sectionNumber){
		case 1:
			fragment = new ImageDownloaderFragment();
			break;
		case 2:
			fragment = new CalculatorFragment();
			break;
		case 3:
			fragment = new AcercaFragment();
		}
		
		return fragment;
	}

	public PlaceholderFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		return rootView;
	}
}
