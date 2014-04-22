package com.thunsaker.zapato.example.app;

import android.app.Activity;
import android.content.Context;

import com.thunsaker.zapato.common.annotations.ForActivity;
import com.thunsaker.zapato.example.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = true,
        library =  true,
        addsTo = ZapatoAppModule.class,
        injects = {
                MainActivity.class
        }
)
public class ZapatoActivityModule {
    private final BaseZapatoActivity mActivity;

    public ZapatoActivityModule(BaseZapatoActivity activity) {
        mActivity = activity;
    }

    @Provides
    @Singleton
    @ForActivity
    Context providesActivityContext() {
        return mActivity;
    }

    @Provides
    @Singleton
    Activity providesActivity() {
        return mActivity;
    }
}
