package com.hanmo.di_example.di.component

import com.hanmo.di_example.di.module.CatModule
import com.hanmo.di_example.di.module.DogModule
import com.hanmo.di_example.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DogModule::class, CatModule::class])
interface PetComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build() : PetComponent

        fun dogModule(dogModule : DogModule) : Builder
        fun catModule(catModule: CatModule) : Builder


    }
}