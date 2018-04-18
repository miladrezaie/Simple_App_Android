package com.example.milad.simple_app_android;

import android.app.Application;

import com.backtory.java.internal.BacktoryClient;
import com.backtory.java.internal.KeyConfiguration;

/**
 * Created by milad on 4/18/2018.
 */

public class backtoryClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BacktoryClient.init(KeyConfiguration.newBuilder()
                .setAuthKeys("5a9314fbe4b04e579ee1edbe",
                        "5a9314fbe4b05bb64131ee38").
                        setObjectStorageKey("5a9314fce4b092a32b632af9").
                        build(), this);

    }
}
