package hl.t1.ejemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
        Button btn_coma = findViewById(R.id.btnComa);


    }
}