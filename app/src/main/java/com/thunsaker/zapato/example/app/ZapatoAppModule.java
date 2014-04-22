package com.thunsaker.zapato.example.app;

import com.thunsaker.zapato.common.dagger.AndroidApplicationModule;

import dagger.Module;

@Module(
        complete = true,
        library = true,
        addsTo = AndroidApplicationModule.class,
        injects = {
                ZapatoApp.class
        }
)
public class ZapatoAppModule {
    // Example
//    @Provides
//    Picasso providesPicasso(@ForApplication Context context) {
//        Picasso picasso = Picasso.with(context);
//
//        picasso.setDebugging(BuildConfig.DEBUG);
//        return picasso;
//    }
}