package com.harrisyip.csww.loungemobile;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity {

    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (TabHost) findViewById(R.id.tab_bar);
        mTabHost.setup();
    }
}
