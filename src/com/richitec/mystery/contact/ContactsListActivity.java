package com.richitec.mystery.contact;

import android.app.Activity;
import android.os.Bundle;

import com.richitec.mystery.R;

public class ContactsListActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set content view
		setContentView(R.layout.contacts_list_activity_layout);
	}

}
