package com.hanmo.di_example.di.module

import com.hanmo.di_example.Dog
import dagger.Module
import dagger.Provides

@Module
object DogModule {

    @Provides
    fun provideDog() : Dog {
        return Dog()
    }

}