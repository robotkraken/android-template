package com.robotkraken.template.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.robotkraken.template.MESSAGE";

	@Override
	public void onCreate( final Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );

		final Intent intent = getIntent();
		final String message = intent.getStringExtra( EXTRA_MESSAGE );

		// Create the text view
		final TextView textView = new TextView( this );
		textView.setTextSize( 40 );
		textView.setText( message );

		// Set the text view as the activity layout
		setContentView( textView );

	}

}
