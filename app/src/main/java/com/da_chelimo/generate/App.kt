package com.da_chelimo.generate

import android.app.Application
import com.da_chelimo.generate.di.initKoin
import timber.log.Timber

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        initKoin()
    }

}