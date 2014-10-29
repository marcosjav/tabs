package com.labii.grosos.fragments;

import com.labii.grosos.tabsapp.PlaceholderFragment;
import com.labii.grosos.tabsapp.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageDownloaderFragment extends PlaceholderFragment{

	public ImageDownloaderFragment() {
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.image_downloader, container, false);
		return rootView;
	}

}
