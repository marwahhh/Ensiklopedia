package com.example.marwah.ensiklopedia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener, View.OnTouchListener{

    public String textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonCari = findViewById(R.id.button_cari);
        buttonCari.setOnClickListener(this);

        View textInputCari = findViewById(R.id.text_input_cari);
        textInputCari.setOnClickListener(this);
        EditText textInputCari2 = (EditText) textInputCari;
        String isiTextInputCari = String.valueOf(textInputCari2.getText());
        if (isiTextInputCari.equals("")){
            textInputCari2.setText("Mencari...");
        }

        View mainLayout = findViewById(R.id.main_layout);
        mainLayout.setOnClickListener(this);
        mainLayout.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_cari:
                EditText textInputCari = (EditText) findViewById(R.id.text_input_cari);
                String input = String.valueOf(textInputCari.getText());
                if (input.equals("Mencari...")){
                    input = "";
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Silahkan Masukkan Inputan", Toast.LENGTH_SHORT).show();
                } else if(input.equals("")){
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Silahkan Masukkan Inputan", Toast.LENGTH_SHORT).show();
                } else {
                    textInput = String.valueOf(textInputCari.getText());
                    Intent k = new Intent(this, PencarianActivity.class);
                    startActivity(k);
                }
                break;
            case R.id.text_input_cari:
                EditText temp = (EditText) v;
                String isiTemp = String.valueOf(temp.getText());
                if (isiTemp.equals("Mencari...")){
                    temp.setText("");
                }
                temp.setCursorVisible(true);
                break;
            case R.id.main_layout:
                EditText text = (EditText) findViewById(R.id.text_input_cari);
                String isiText = String.valueOf(text.getText());
                if (isiText.equals("")){
                    text.setText("Mencari...");
                    text.clearFocus();
                }
                text.setCursorVisible(false);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        return false;
    }
}
