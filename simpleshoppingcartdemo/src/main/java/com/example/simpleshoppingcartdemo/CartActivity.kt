package com.example.simpleshoppingcartdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        val bndl = intent.extras
        val lst = bndl.getStringArrayList("list")
        val adapt=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lst)

        listCart.adapter=adapt
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
