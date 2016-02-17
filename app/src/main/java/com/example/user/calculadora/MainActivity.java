package com.example.user.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    /*private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsum,bres,bmul,bdiv,raiz2,raiz3,cuadra,cubo,fac,lnatural;
    private EditText mostrar;
    String op="";*/

    Double n1,n2,r;
    String op;

    public void onClickIgual(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n2 = Double.parseDouble(et.getText().toString());

        if(op.equals("+"))
        {
            r= n1+n2;
        }
        else if(op.equals("-"))
        {
            r= n1-n2;
        }
        else if(op.equals("*"))
        {
            r= n1*n2;
        }
        else if(op.equals("/"))
        {
            r= n1/n2;
        }

        et.setText(r.toString());
    }

    public void onClickSuma(View miView)
    {
        op="+";
        onClickOperacionCapturaN1(miView);
    }
    public void onClickResta(View miView)
    {
        op="-";
        onClickOperacionCapturaN1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        op="*";
        onClickOperacionCapturaN1(miView);
    }
    public void onClickDivision(View miView)
    {
        op="/";
        onClickOperacionCapturaN1(miView);
    }

    public void onClickRaiz(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        //onClickOperacionCapturaN1(miView);

         if(op.equals("%"))
    {
        r= Math.sqrt(n1);
    }
        et.setText(r.toString());
    }

    public void onClickRaizcubo(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        //onClickOperacionCapturaN1(miView);

        if(op.equals("%"))
        {
            r= Math.cbrt(n1);
        }
        et.setText(r.toString());
    }

    public void onClickCuadradoNum(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        //onClickOperacionCapturaN1(miView);

        if(op.equals("%"))
        {
            r= (n1*n1);
        }
        et.setText(r.toString());
    }

    public void onClickCubooNum(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        //onClickOperacionCapturaN1(miView);

        if(op.equals("%"))
        {
            r= (n1*n1)*n1;
        }
        et.setText(r.toString());
    }

    public void onClickLog(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        //onClickOperacionCapturaN1(miView);

        if(op.equals("%"))
        {
            r= Math.log10(n1);
        }
        et.setText(r.toString());
    }

    public void onClickFact(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        op="%";
        double fact=1;
        //onClickOperacionCapturaN1(miView);

        if(op.equals("%"))
        {
            for (Double i=n1;i>1;i--){
                fact= fact*i;
            }
            r= fact;
        }
        et.setText(r.toString());
    }

    public void onClickOperacionCapturaN1(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        n1 = Double.parseDouble(et.getText().toString());
        et.setText("");
    }

    public void onClickLimpia(View miView)
    {
        n1=0.0;
        n2=0.0;
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText("");
    }

    public void onClickBtn1(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "1");
    }
    public void onClickBtn2(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "2");
    }
    public void onClickBtn3(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "3");
    }
    public void onClickBtn4(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "4");
    }
    public void onClickBtn5(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "5");
    }
    public void onClickBtn6(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "6");
    }
    public void onClickBtn7(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "7");
    }
    public void onClickBtn8(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "8");
    }
    public void onClickBtn9(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "9");
    }
    public void onClickBtn0(View miView)
    {
        EditText et = (EditText) findViewById(R.id.edtmostrar) ;
        et.setText(et.getText() + "0");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
