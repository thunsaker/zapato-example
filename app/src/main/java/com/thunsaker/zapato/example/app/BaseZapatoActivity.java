package com.thunsaker.zapato.example.app;

import com.thunsaker.zapato.common.BaseActivity;

public class BaseZapatoActivity extends BaseActivity {
    @Override
    protected Object[] getActivityModules() {
        return new Object[] {
                new ZapatoActivityModule(this)
        };
    }
}
