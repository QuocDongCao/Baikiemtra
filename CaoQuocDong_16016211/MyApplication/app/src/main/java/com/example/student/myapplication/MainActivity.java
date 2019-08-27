package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tx1,tx2;
    TextView Kq;
    Button btntong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1=(EditText)findViewById(R.id.soa);
        tx2=(EditText)findViewById(R.id.sob);
        Kq=(TextView)findViewById(R.id.tvdp);
        btntong=(Button)findViewById(R.id.tong);
        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c1=tx1.getText().toString();
                int s1=Integer.parseInt(c1);

                String c2=tx1.getText().toString();
                int s2=Integer.parseInt(c2);

                int tongso=s1+s2;
                Kq.setText(String.valueOf(tongso));
            }
        });
    }
}
