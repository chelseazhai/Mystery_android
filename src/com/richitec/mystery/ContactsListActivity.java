package com.richitec.mystery;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ContactsListActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_list_activity_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contacts_list_activity_layout, menu);
        return true;
    }
}
