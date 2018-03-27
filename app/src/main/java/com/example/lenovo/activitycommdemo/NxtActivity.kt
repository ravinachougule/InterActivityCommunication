package com.example.lenovo.activitycommdemo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_nxt.*

class NxtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nxt)
        val bndl=intent.extras
        txtView.textSize=bndl.getFloat("setSz",30f)
        skBar.setOnSeekBarChangeListener(onSkListener)

        btnBack.setOnClickListener{
            val bkInt=Intent()

            val bndl=Bundle()
            bndl.putInt("chSize",skBar.progress)
            bkInt.putExtras(bndl)

            setResult(Activity.RESULT_OK,bkInt)
            finish()
        }
    }

    private val onSkListener=object:SeekBar.OnSeekBarChangeListener{
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                txtView.textSize=progress.toFloat()
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {

        }

        override fun onStopTrackingTouch(p0: SeekBar?) {

        }

    }
}
