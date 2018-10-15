package com.xdw.calculatorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    int columnCount;
    int screenWidth;
    GridLayout gridLayoutChange;
    private boolean flag;  //清空标志
    EditText input;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnClear;
    Button btnDelete;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    Button btnDot;
    Button btnNegative;
    Button btnEqual;
    Button btnGo;
    double num1,num2,result=0;
    int type;  //记录运算类型


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayoutChange=findViewById(R.id.gridLayout);
        columnCount=gridLayoutChange.getColumnCount();
        screenWidth=this.getWindowManager().getDefaultDisplay().getWidth();
        for(int i=0;i<gridLayoutChange.getChildCount();i++){
            Button button=(Button)gridLayoutChange.getChildAt(i);
            button.setWidth(screenWidth/columnCount);
        }

        input=findViewById(R.id.display);
        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.one);
        btn2=findViewById(R.id.two);
        btn3=findViewById(R.id.three);
        btn4=findViewById(R.id.four);
        btn5=findViewById(R.id.five);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.seven);
        btn8=findViewById(R.id.eight);
        btn9=findViewById(R.id.nine);
        btnClear=findViewById(R.id.clear);
        btnDelete=findViewById(R.id.delete);
        btnPlus=findViewById(R.id.plus);
        btnMinus=findViewById(R.id.minus);
        btnMultiply=findViewById(R.id.multiply);
        btnDivide=findViewById(R.id.divide);
        btnDot=findViewById(R.id.dot);
        btnNegative=findViewById(R.id.negative);
        btnEqual=findViewById(R.id.equal);
        btnGo=findViewById(R.id.go);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="0";
                input.setText(mystring);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="1";
                input.setText(mystring);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="2";
                input.setText(mystring);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="3";
                input.setText(mystring);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="4";
                input.setText(mystring);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="5";
                input.setText(mystring);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="6";
                input.setText(mystring);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="7";
                input.setText(mystring);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="8";
                input.setText(mystring);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                mystring+="9";
                input.setText(mystring);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                if(mystring.contains(".")){
                    Toast.makeText(MainActivity.this,"输入不合法！",Toast.LENGTH_SHORT).show();
                }else{
                    if(mystring.length()==0){
                        mystring="0.";
                    }else{
                        mystring+=".";
                    }
                }
                input.setText(mystring);
            }
        });
        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    input.setText(null);
                    flag = false;
                }
                String mystring=input.getText().toString();
                if(mystring.length()==0){
                    mystring="-";
                }else{
                    double num1=Double.parseDouble(mystring);
                    num1=num1*-1;
                    mystring=String.valueOf(num1);
                }
                input.setText(mystring);
            }
        });



        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mystring=input.getText().toString();
                mystring=mystring.substring(0,mystring.length()-1);  //截取字符串
                input.setText(mystring);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(MainActivity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=1;
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    Toast.makeText(MainActivity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=2;
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    Toast.makeText(MainActivity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=3;
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    Toast.makeText(MainActivity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=4;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    Toast.makeText(MainActivity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else {
                    num2=Double.parseDouble(input.getText().toString());
                    switch (type){
                        case 1:
                            result=num1+num2;
                            break;
                        case 2:
                            result=num1-num2;
                            break;
                        case 3:
                            result=num1*num2;
                            break;
                        case 4:
                            result=num1/num2;
                            break;
                        default:
                            break;
                    }
                    String mystring=String.valueOf(result);
                    input.setText(mystring);
                    flag=true;  //完成一次运算
                }
            }
        });

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("科学计算");
                startActivity(intent);
            }
        });

    }
}