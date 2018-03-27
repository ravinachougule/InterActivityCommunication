package com.example.activitycommdemojava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button  ok;
    EditText size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btnOk.setOnClickListener{
            val intent=Intent(this,NxtActivity::class.java)

            val bndl=Bundle();
            bndl.putFloat("setSz",etSize.text.toString().toFloat())
            intent.putExtras(bndl);
            //startActivity(intent);
            startActivityForResult(intent,1234)
        }*/
        size=(EditText)findViewById(R.id.etSize) ;
        ok=(Button)findViewById(R.id.btnOk);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,nextActivity.class);
               // String bndl=Bundle();

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
