package com.mirea.kt.practica2_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText time, percent, sum;
    private Button start;
    private TextView monthlyIncome, finalIncome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.editTextText);
        percent = findViewById(R.id.editTextText2);
        sum = findViewById(R.id.editTextText3);
        start = findViewById(R.id.button);
        monthlyIncome = findViewById(R.id.textView3);
        finalIncome = findViewById(R.id.textView5);
        monthlyIncome.setMovementMethod(new ScrollingMovementMethod());

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(time.getText().toString());
                float num2 = Float.parseFloat(percent.getText().toString());
                float num3 = Float.parseFloat(sum.getText().toString());
                int i = 1;
                double t=0;
                finalIncome.setText("");
                monthlyIncome.setText("");
                while (i<=num1){
                    double e= num3*num2/100;
                    num3 = (float) (num3+e);
                    monthlyIncome.append("Доход в "+i+" месяце: "+String.valueOf(e)+"\n");
                    t = t+e;
                    i++;
                }
                finalIncome.setText(String.valueOf(t));
            }
        });

    }
}