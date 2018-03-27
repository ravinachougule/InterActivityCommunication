package com.example.lenovo.activitycommdemo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOk.setOnClickListener{
            val intent=Intent(this,NxtActivity::class.java)

            val bndl=Bundle();
            bndl.putFloat("setSz",etSize.text.toString().toFloat())
            intent.putExtras(bndl);
            //startActivity(intent);
            startActivityForResult(intent,1234)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode){
            1234 -> if(resultCode == Activity.RESULT_OK){
                val bndl=data?.extras
                etSize.setText(bndl?.getInt("chSize",10).toString())
            }
        }
    }
}