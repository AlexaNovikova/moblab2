package com.example.lab2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class C extends AppCompatActivity {
    Button sendC;
    EditText etc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_activity);
        sendC = findViewById(R.id.BtSendC);
        etc = findViewById(R.id.ET_C);
        sendC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(); //Создается класс намерения
                intent.putExtra("MyString", etc.getText().toString()); //заполняем намерение одной строкой
                setResult(RESULT_OK, intent); //добавляем в намерение параметр, означающий успешность окончания работы вызванного класса
                finish(); // завершаем работу класса и возвращаемся в дочерний класс
            }
        });
    }
}
