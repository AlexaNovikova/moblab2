package com.example.lab2;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class B extends AppCompatActivity {
    Button sendB;
    EditText etb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);

        sendB = findViewById(R.id.btSendB);
        etb = findViewById(R.id.ET_B);
        sendB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(); //Создается класс намерения
                intent.putExtra("MyString", etb.getText().toString()); //заполняем намерение одной строкой
                setResult(RESULT_OK, intent); //добавляем в намерение параметр, означающий успешность окончания работы вызванного класса
                finish(); // завершаем работу класса и возвращаемся в дочерний класс
            }
        });
    }
}

