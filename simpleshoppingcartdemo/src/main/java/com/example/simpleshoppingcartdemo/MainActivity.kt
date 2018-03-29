package com.example.simpleshoppingcartdemo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_jeans.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val lst=ArrayList<String>();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtJeans.setOnClickListener{
            val intent=Intent(this,JeansActivity::class.java)

            val bndl=Bundle()
            intent.putExtras(bndl)
           // startActivity(intent)
            startActivityForResult(intent,1234)
        }
        txtShirts.setOnClickListener{
            val intent=Intent(this,ShirtsActivity::class.java)
            val bndl=Bundle()

            intent.putExtras(bndl)
            //startActivity(intent)
            startActivityForResult(intent,4568)

        }
        btnCart.setOnClickListener{
            val intent=Intent(this,CartActivity::class.java)
            val bndl=Bundle()
            bndl.putStringArrayList("list",lst)
            intent.putExtras(bndl)
            startActivity(intent)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1234 -> if (resultCode == Activity.RESULT_OK) {
                val bndl = data?.extras
                lst.add(bndl?.getString("j1").toString())
                lst.add(bndl?.getString("j2").toString())
                lst.add(bndl?.getString("j3").toString())
            }
            4568 -> if (resultCode == Activity.RESULT_OK) {
                val bndl = data?.extras
                lst.add(bndl?.getString("j1").toString())
                lst.add(bndl?.getString("j2").toString())
                lst.add(bndl?.getString("j3").toString())
            }
        }
        val lstLen=lst.size
        btnCart.text="Cart($lstLen)"

        //listCart.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lst)
    }
}

