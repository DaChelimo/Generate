package com.da_chelimo.generate.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.dsl.module

val networkModule = module {

    single<Moshi> { Moshi.Builder().add(KotlinJsonAdapterFactory()).build() }

}