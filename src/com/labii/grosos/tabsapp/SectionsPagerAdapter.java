package com.labii.grosos.tabsapp;

import java.util.Locale;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 * 
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	Activity activity;
	private static Fragment[] fragments;  // agregamos el arreglo de fragmentos
	private static final int MAX_FRAGMENTS = 3;


	public SectionsPagerAdapter(FragmentManager fm, Activity activity) {
		super(fm);
		this.activity = activity;
		fragments = new Fragment[getCount()];
	}

	@Override								// SE VA A LLAMAR CADA VEZ QUE SELECCIONO UN TAB, DEVUELVE EL FRAGMENTO QUE QUIERO MOSTRAR
	public Fragment getItem(int position) {  
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class
		// below).
		//////////////////////////////////////// en vez de crear siempre una instancia, almaceno en un arreglo
		// return PlaceholderFragment.newInstance(position + 1);
		if (fragments[position] == null)
			fragments[position] = PlaceholderFragment.newInstance(position + 1, activity);
		
		return fragments[position];
	}

	@Override
	public int getCount() {  //INDICA CUANTAS PÁGINAS VA A TENER
		// Show 3 total pages.
		return MAX_FRAGMENTS;
	}

	@Override
	public CharSequence getPageTitle(int position) {  // DEVUELVE EL TÍTULO DEL TAB QUE ESTÁ SELECCIONADO
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return activity.getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return activity.getString(R.string.title_section2).toUpperCase(l);
		case 2:
			return activity.getString(R.string.title_section3).toUpperCase(l);
		}
		return null;
	}
}
