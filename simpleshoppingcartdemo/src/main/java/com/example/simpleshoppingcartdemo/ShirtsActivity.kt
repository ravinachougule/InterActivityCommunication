package com.example.simpleshoppingcartdemo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jeans.*
import kotlinx.android.synthetic.main.activity_shirts.*

class ShirtsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirts)

        val bndl=intent.extras
        val bkInt= Intent()
        txtShirt1.setOnClickListener {
            txtShirt1.setBackgroundColor(1)

            val j1=txtShirt1.text
            bndl.putString("j1", j1 as String?)
            bkInt.putExtras(bndl)
        }
        txtShirt2.setOnClickListener {
            txtShirt2.setBackgroundColor(1)

            val j2=txtShirt2.text
            bndl.putString("j2",j2 as String?)
            bkInt.putExtras(bndl)

        }
        txtShirt3.setOnClickListener {
            txtShirt3.setBackgroundColor(1)

            val j3=txtShirt3.text
            bndl.putString("j3",j3 as String?)
            bkInt.putExtras(bndl)

        }
        btnBackS.setOnClickListener{

            bkInt.putExtras(bndl)
            setResult(Activity.RESULT_OK,bkInt)
            finish()
        }
    }
}
