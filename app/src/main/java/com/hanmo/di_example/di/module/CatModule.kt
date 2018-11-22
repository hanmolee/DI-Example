package com.hanmo.di_example.di.module

import com.hanmo.di_example.Cat
import dagger.Module
import dagger.Provides

@Module
object CatModule {

    @Provides
    fun provideCat() : Cat {
        return Cat()
    }

}