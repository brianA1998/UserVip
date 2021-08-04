package com.example.uservip
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    /**
     * Captura listener del button
     */
    fun initUI(){
        buttonContinue.setOnClickListener { accessToDetail() }
    }

    fun accessToDetail(){
        if(editTextName.text.toString().isNotEmpty()){

        }else{

        }
    }


}