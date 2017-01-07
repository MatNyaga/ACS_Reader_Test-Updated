package com.acs.readertest;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class uidactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uidactivity);
        Intent intent = getIntent();
        String value = intent.getStringExtra("UID");
        value = value.replaceAll("\\s","");
        int successindex = value.indexOf("9000000000");
        value = value.substring(0,successindex);
        TextView  uidtext = (TextView)findViewById(R.id.carduid);
        uidtext.setText(value);
    }

}
