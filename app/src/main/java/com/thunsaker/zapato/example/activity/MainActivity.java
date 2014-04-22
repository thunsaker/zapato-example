package com.thunsaker.zapato.example.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.TextView;

import com.thunsaker.zapato.R;
import com.thunsaker.zapato.example.app.BaseZapatoActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseZapatoActivity {
    @InjectView(R.id.main_title)TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayUseLogoEnabled(true);

        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        title.setText(R.string.test_title_text);
    }
}