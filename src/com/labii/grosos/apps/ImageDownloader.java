package com.labii.grosos.apps;

import java.io.InputStream; 
import java.net.URL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;
 
public class ImageDownloader extends AsyncTask<String, Long, Bitmap>{
		final ScrollView scrollView;  // lo hacemos final para poder pasarlo al Runnable
		final static int MAX_URLS = 10;
		static int contador = 0;
		private int index;
		private Context context;
		private LinearLayout linearLayout;
		private ProgressBar progress;

		public ImageDownloader(Context context, ScrollView scrollView, LinearLayout linearLayout) {
			this.context = context;  				// obtenemos el context 
			progress = new ProgressBar(context);	// también la progressBar
		    this.linearLayout = linearLayout;		// linkeamos el linearLayout
		    this.scrollView = scrollView;			// y el scrollview para poder hacerle el scroll después
		    index = contador;
		    if (contador++ >= MAX_URLS)
		    	this.cancel(true);
		    	
		}
		  
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			if (!this.isCancelled())
				linearLayout.addView(progress);  // antes de comenzar la descarga agregamos la progressBar
		}
		  
		protected Bitmap doInBackground(String... urls) {
				String urldisplay = urls[index];
			    Bitmap mIcon11 = null;
			    try {
			    	InputStream in = new URL(urldisplay).openStream();		// Bajamos la imagen
			    	mIcon11 = BitmapFactory.decodeStream(in);
			        
			    } catch (Exception e) {
			    	message("Ocurrió un error: \n" + e.toString());
			    }
			    return mIcon11;
		}

		protected void onPostExecute(Bitmap result) {

		    ImageView imageView = new ImageView(context); 
		    imageView.setImageBitmap(result);		// colocamos la imagen descargada en el view
		    
		    linearLayout.removeView(progress);		// sacamos la progressBar
		    linearLayout.addView(imageView);		// agregamos la imageView al linearLayout
		    
		    scrollView.post(new Runnable() {		// acá hacemos que el scrollView haga scroll hasta el fondo
		    	@Override
		    	public void run() {
		    		  scrollView.fullScroll(ScrollView.FOCUS_DOWN);
		    	}
		      	});
			Toast.makeText(context, "terminó la descarga", Toast.LENGTH_SHORT).show();

		}
		
		@Override
		protected void onCancelled() {
			super.onCancelled();
			message("Se terminaron las URL's");
		}
		
		private void message(String msg){
			Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
		}

}