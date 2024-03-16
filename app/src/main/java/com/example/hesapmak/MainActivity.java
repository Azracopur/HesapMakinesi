package com.example.hesapmak;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsil,btnekart,btnyuzde,btnbol;
    Button btn7,btn8,btn9,btncarp;
    Button btn4,btn5,btn6,btncikar;
    Button btn1,btn2,btn3,btntopla;
    Button btn0,btnvirgul,btnnokta,btnesit;
    boolean arti,eksi,bolme,carp;
    float deger1,deger2;

    TextView result,solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.sayigoster);
        solution=findViewById(R.id.solution);
        btnsil=(Button) findViewById(R.id.btnsil);
        btnekart=(Button) findViewById(R.id.btnekart);
        btnyuzde=(Button) findViewById(R.id.btnyuzde);
        btnbol=(Button) findViewById(R.id.btnbol);
        btncarp=(Button) findViewById(R.id.btncarp);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btncikar=(Button) findViewById(R.id.btncikar);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btntopla=(Button) findViewById(R.id.btntopla);
        btn0=(Button) findViewById(R.id.btn0);
        btnvirgul=(Button) findViewById(R.id.btnvirgul);
        btnnokta=(Button) findViewById(R.id.btnnokta);
        btnesit=(Button) findViewById(R.id.btnesit);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
                solution.setText(result.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
                solution.setText(result.getText());
            }
        });
        btnnokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
                solution.setText(result.getText());
            }
        });
        btnsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(" ");

            }
        });
        btntopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText(" ");
                }
                else{
                    deger1=Float.parseFloat(result.getText()+" ");
                    arti=true;
                    result.setText(null);
                }
            }
        });
        btncikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+" ");
                eksi=true;
                result.setText(null);

            }
        });
        btnbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+" ");
                bolme=true;
                result.setText(null);

            }
        });
        btncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+" ");
                carp=true;
                result.setText(null);
            }
        });
        btnesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2=Float.parseFloat(result.getText()+" ");
                if(arti==true){
                    result.setText(deger1+deger2+" ");
                    solution.setText(deger1+"+"+deger2);
                    arti=false;
                }
                if(eksi==true){
                    result.setText(deger1-deger2+"");
                    solution.setText(deger1+"-"+deger2);
                    eksi=false;
                }
                if(bolme==true){

                    result.setText(deger1/deger2+"");
                    solution.setText(deger1+"/"+deger2);
                    bolme=false;
                }
                if(carp==true){
                    float sonuc = deger1 * deger2;
                    result.setText(String.valueOf(sonuc));
                    solution.setText(deger1 + " * " + deger2);
                    carp=false;
                }
            }
        });
        btnyuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oncekiMetin = result.getText().toString();
                double sayi = Double.parseDouble(oncekiMetin);
                double yuzde = sayi / 100.0;
                result.setText(String.valueOf(yuzde));
                solution.setText(oncekiMetin + " % = " + yuzde);
            }
        });
    }
}