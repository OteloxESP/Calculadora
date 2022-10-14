package hl.t1.ejemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int n1 = 0;
    int n2 = 0;
    int i = 0;
    int resultado;
    String  operador;
    EditText et_visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_num0 = findViewById(R.id.btn0);
        Button btn_num1 = findViewById(R.id.btn1);
        Button btn_num2 = findViewById(R.id.btn2);
        Button btn_num3 = findViewById(R.id.btn3);
        Button btn_num4 = findViewById(R.id.btn4);
        Button btn_num5 = findViewById(R.id.btn5);
        Button btn_num6 = findViewById(R.id.btn6);
        Button btn_num7 = findViewById(R.id.btn7);
        Button btn_num8 = findViewById(R.id.btn8);
        Button btn_num9 = findViewById(R.id.btn9);
        Button btn_division = findViewById(R.id.btnDivision);
        Button btn_multiplicacion = findViewById(R.id.btnMultiplicar);
        Button btn_resta = findViewById(R.id.btnResta);
        Button btn_suma = findViewById(R.id.btnSuma);
        Button btn_borrar = findViewById(R.id.btnBorrado);
        Button btn_Igual = findViewById(R.id.btnIgual);
        et_visor = findViewById(R.id.etVisor);
        int i = 0;

        btn_num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(0);
            }
        });

        btn_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(1);
            }
        });

        btn_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(2);
            }
        });

        btn_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(3);
            }
        });

        btn_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(4);
            }
        });

        btn_num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(5);
            }
        });

        btn_num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(6);
            }
        });

        btn_num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(7);
            }
        });

        btn_num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(8);
            }
        });

        btn_num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                añadirNumero(9);
            }
        });

        btn_Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                igual();
            }
        });

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operar("suma");
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operar("resta");
            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operar("multiplicar");
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operar("dividir");
            }
        });

        btn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
            }
        });
    }

    public void añadirNumero(int numero){
        String pantalla = et_visor.getText().toString();
        et_visor.setText(pantalla+numero);
    }

    public void operar(String op){
        int r = Integer.parseInt(et_visor.getText().toString());
        if (n1 == 0){
            n1 = r;
        }else{
            n2 = r;
        }
        operador = op;
        et_visor.setText("");
    }

    public void igual(){
        operar(operador);
        resultado();
    }
    public void borrar(){
        et_visor.setText("");
    }

    public void resultado(){
        switch(operador){
            case "suma":
                resultado = n1+n2;
                et_visor.setText(""+resultado);
                break;

            case "resta":
                resultado = n1-n2;
                et_visor.setText(""+resultado);
                break;
            case "multiplicar":
                resultado = n1*n2;
                et_visor.setText(""+resultado);
                break;
            case "dividir":
                if (n2 == 0){
                    et_visor.setText("null");
                }else{
                    resultado = n1/n2;
                    et_visor.setText(""+resultado);
                }
                break;
        }
        n1 = 0;
        n2 = 0;
    }
}