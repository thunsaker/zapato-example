package com.thunsaker.zapato.common.dagger;

import dagger.ObjectGraph;

public interface Injector {
    void inject(Object object);
    ObjectGraph getObjectGraph();
}
