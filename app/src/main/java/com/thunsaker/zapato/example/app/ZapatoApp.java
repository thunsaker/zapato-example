package com.thunsaker.zapato.example.app;

import com.thunsaker.zapato.common.dagger.DaggerApplication;

import java.util.Collections;
import java.util.List;

public class ZapatoApp extends DaggerApplication {

    @Override
    protected List<Object> getAppModules() {
        return Collections.<Object>singletonList(new ZapatoAppModule());
    }
}