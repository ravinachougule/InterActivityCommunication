package com.example.simpleshoppingcartdemo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jeans.*
import kotlinx.android.synthetic.main.activity_main.*

class JeansActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeans)
        val bndl=intent.extras
        val bkInt=Intent()

       // val bndl=Bundle()
        txtJeans1.setOnClickListener {

            val j1=txtJeans1.text
// noneed of j1  as Strin?
            //            bndl.putString("j1",j1.toString())

            bndl.putString("j1", j1 as String?)
            bkInt.putExtras(bndl)
        }
        txtJeans2.setOnClickListener {
            //val bkInt=Intent()

           // val bndl=Bundle()
            val j2=txtJeans2.text
            bndl.putString("j2",j2 as String?)
            bkInt.putExtras(bndl)

        }
        txtJeans3.setOnClickListener {
            //val bkInt=Intent()

           // val bndl=Bundle()
            val j3=txtJeans2.text
            bndl.putString("j3",j3 as String?)
            bkInt.putExtras(bndl)
        }

        btnBack.setOnClickListener{
           // val bkInt=Intent()
            //val bndl=Bundle()

            bkInt.putExtras(bndl)
            setResult(Activity.RESULT_OK,bkInt)
            finish()
        }
    }
}
