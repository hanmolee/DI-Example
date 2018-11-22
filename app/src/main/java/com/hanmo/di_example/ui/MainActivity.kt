package com.hanmo.di_example.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hanmo.di_example.Cat
import com.hanmo.di_example.Dog
import com.hanmo.di_example.R
import com.hanmo.di_example.di.component.DaggerPetComponent
import com.hanmo.di_example.di.module.CatModule
import com.hanmo.di_example.di.module.DogModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var cat : Cat

    @Inject
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectComponent()

        setGetCatNameButton()
        setGetDogNameButton()
    }

    private fun injectComponent() {
        DaggerPetComponent.builder()
                .catModule(CatModule)
                .dogModule(DogModule)
                .build()
                .inject(this)
    }

    private fun setGetCatNameButton() {
        catNameButton.setOnClickListener {
            catNameText.text = cat.getCatName()
        }
    }
    private fun setGetDogNameButton() {
        dogNameButton.setOnClickListener {
            dogNameText.text = dog.getDogName()
        }
    }


}
