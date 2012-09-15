package com.robotkraken.template.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.robotkraken.template.R;

public class MainMenu extends Activity {

	@Override
	public void onCreate( final Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );

		setContentView( R.layout.activity_main );

	}

	/**
	 * Action für den Button "Create New".
	 */
	public void createNew( final View v ) {
		final Intent changeToDisplayMessage = new Intent( this, DisplayMessageActivity.class );
		final String message = "message";
		changeToDisplayMessage.putExtra( DisplayMessageActivity.EXTRA_MESSAGE, message );
		startActivity( changeToDisplayMessage );
	}

	/**
	 * Action für den Button "Manage".
	 */
	public void manage( final View v ) {

	}

	/**
	 * Action für den Button "Help".
	 */
	public void help( final View v ) {

	}

}
