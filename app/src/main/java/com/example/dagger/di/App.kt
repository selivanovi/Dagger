package com.example.dagger.di

import android.app.Application

class App : Application() {

    val appComponent = DaggerApplicationComponent.create()

}