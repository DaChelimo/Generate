package com.da_chelimo.generate.di

import com.da_chelimo.generate.App
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module


fun App.initKoin() = startKoin {
    androidContext(this@initKoin)
    androidLogger(Level.DEBUG)

    modules(appModule, localModule, repoModule, viewModelModule)
}

// For ViewModels and commonly used instances e.g Moshi for serialization
val appModule = module {


}

val viewModelModule = module {



}