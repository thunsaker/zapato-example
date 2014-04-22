package com.thunsaker.zapato.common.dagger;

import android.content.Context;

import com.squareup.otto.Bus;
import com.thunsaker.zapato.common.annotations.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true,
        injects = {
        }
)
public class AndroidApplicationModule {
    static Context xApplicationContext = null;

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return xApplicationContext;
    }

    @Provides
    @Singleton
    Bus provideBus() {
        return new Bus();
    }
}