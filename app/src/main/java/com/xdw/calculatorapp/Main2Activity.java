package com.xdw.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends Activity {

    Button btnBack;
    int columnCount;
    int screenWidth;
    GridLayout gridLayoutChange,gridLayoutChange2;
    private boolean flag=false;  //清空标志
    private double z=0;
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
    Button btnMc,btnMPlus,btnMMinus,btnMr;
    double num1,num2,result=0;
    int type;  //记录运算类型
    RadioButton a,b;
    Button btnLog,btnSin,btnCos,btnTan;
    Button btnLn,btnFactorial,btnSqrt,btnE;
    Button btnReciprocal,btnSquare,btnCube,btnPower;
    Button btnIntegral,btnMod,btnLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnBack=findViewById(R.id.back);
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
        btnMc=findViewById(R.id.mc);
        btnMPlus=findViewById(R.id.mPlus);
        btnMMinus=findViewById(R.id.mMinus);
        btnMr=findViewById(R.id.mr);
        a=findViewById(R.id.angle);
        b=findViewById(R.id.radian);
        btnLog=findViewById(R.id.log);
        btnSin=findViewById(R.id.sin);
        btnCos=findViewById(R.id.cos);
        btnTan=findViewById(R.id.tan);
        btnReciprocal=findViewById(R.id.reciprocal);
        btnSquare=findViewById(R.id.square);
        btnCube=findViewById(R.id.cube);
        btnPower=findViewById(R.id.power);
        btnIntegral=findViewById(R.id.integral);
        btnMod=findViewById(R.id.mod);
        btnLeft=findViewById(R.id.left);
        btnLn=findViewById(R.id.ln);
        btnFactorial=findViewById(R.id.factorial);
        btnSqrt=findViewById(R.id.sqrt);
        btnE=findViewById(R.id.e);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        gridLayoutChange=findViewById(R.id.gridLayout);
        columnCount=gridLayoutChange.getColumnCount();
        screenWidth=this.getWindowManager().getDefaultDisplay().getWidth();
        for(int i=0;i<gridLayoutChange.getChildCount();i++){
            Button button=(Button)gridLayoutChange.getChildAt(i);
            button.setWidth(screenWidth/columnCount);
        }
        gridLayoutChange2=findViewById(R.id.gridLayout2);
        columnCount=gridLayoutChange2.getColumnCount();
        for(int i=0;i<gridLayoutChange2.getChildCount();i++){
            Button button=(Button)gridLayoutChange2.getChildAt(i);
            button.setWidth(screenWidth/columnCount);
        }

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
                    Toast.makeText(Main2Activity.this,"输入不合法！",Toast.LENGTH_SHORT).show();
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
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=9;
                }
            }
        });
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring);
                    if(a.isChecked()){
                        x=Math.sin(x*Math.PI/180);
                    }else{
                        x=Math.sin(x);
                    }
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring);
                    if(a.isChecked()){
                        x=Math.cos(x*Math.PI/180);
                    }else{
                        x=Math.cos(x);
                    }
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring);
                    if(a.isChecked()){
                        x=Math.tan(x*Math.PI/180);
                    }else{
                        x=Math.tan(x);
                    }
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnReciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=1/(Double.parseDouble(mystring));
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring)*Double.parseDouble(mystring);
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring)*Double.parseDouble(mystring)*Double.parseDouble(mystring);
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Math.log(Double.parseDouble(mystring));
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring);
                    if(x>0){
                        result=1;
                        for(int i=1;i<=x;i++){
                            result=result*i;
                        }
                    }else if(x==0){
                        result=1;
                    }else{
                        Toast.makeText(Main2Activity.this,"输入不合法！",Toast.LENGTH_SHORT).show();
                    }
                    mystring=String.valueOf(result);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Math.sqrt(Double.parseDouble(mystring));
                    mystring=String.valueOf(x);
                    input.setText(mystring);
                    flag=true;
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    double x=Double.parseDouble(mystring);
                    if(x>0){
                        result=1;
                        for(int i=0;i<x;i++){
                            result*=Math.E;
                        }
                    }else if(x==0){
                        result=1;
                    }else{
                        result=1;
                        for(int i=0;i<x;i++){
                            result*=Math.E;
                        }
                        result=1/result;

                    }
                    mystring=String.valueOf(result);
                    input.setText(mystring);
                    flag=true;
                }
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
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
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
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
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
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
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
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=4;
                }
            }
        });
        btnIntegral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=6;
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=7;
                }
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=8;
                }
            }
        });

        btnMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z=0;
            }
        });
        btnMPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    z=0;
                }else {
                    String mystring=input.getText().toString();
                    double r=Double.parseDouble(mystring);
                    z=z+r;
                }
            }
        });
        btnMMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    z=0;
                }else {
                    String mystring=input.getText().toString();
                    double r=Double.parseDouble(mystring);
                    z=z-r;
                }
            }
        });
        btnMr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().length() == 0) {  //不能以符号开头
                    z = 0;
                }
                String mystring = String.valueOf(z);
                input.setText(mystring);
                flag = true;
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
                    String mystring=input.getText().toString();
                    num1=Double.parseDouble(mystring);
                    input.setText(null);
                    type=5;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {  //不能以符号开头
                    Toast.makeText(Main2Activity.this, "输入不合法！", Toast.LENGTH_SHORT).show();
                }else{
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
                        case 5:  //幂运算
                            result=1;
                            if(num2>0) {
                                for(int i=0;i<num2;i++)
                                    result*=num1;
                            }else if (num2==0){
                                result=1;
                            }else{
                                num2*=-1;
                                for(int i=0;i<num2;i++)
                                    result*=num1;
                                result=1/result;
                            }
                            break;
                        case 6:
                            double x=num1/num2;
                            result=(int)x;
                            break;
                        case 7:
                            result=num1%num2;
                            break;
                        case 8:  //左移
                            result=1;
                            int p=1;
                            num2=(int)num2;
                            if(num2>=0){
                                for(int i=0;i<num2;i++)
                                    p*=2;
                                result=num1*p;
                            }else{
                                num2=num2*-1;
                                for(int i=0;i<num2;i++)
                                    p*=2;
                                result=num1*p;
                            }
                            break;
                        case 9:
                            result=Math.log(num1)/Math.log(num2);
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

        a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String mystring = input.getText().toString();
                    if(input.getText().toString().length()==0) {
                        input.setText(null);
                    }else{
                        Double i=Double.parseDouble(mystring);
                        i=(i/Math.PI)*180;
                        mystring=String.valueOf(i);
                        input.setText(mystring);
                        flag=true;
                    }
                }
            }
        });
        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String mystring = input.getText().toString();
                    if(mystring.length()==0) {
                        input.setText(null);
                    }else{
                        Double i=Double.parseDouble(mystring);
                        i=(i*Math.PI)/180;
                        mystring=String.valueOf(i);
                        input.setText(mystring);
                        flag=true;
                    }
                }
            }
        });


    }



}
