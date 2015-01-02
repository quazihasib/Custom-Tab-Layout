package com.example.tablayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_testlayout);

        MainActivity myActivity = (MainActivity) this.getParent();
        String currentTab = myActivity.getTabHost().getCurrentTabTag();
        ((Button)findViewById(R.id.button_Test)).setText(currentTab);

    }
}