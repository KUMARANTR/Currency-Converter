package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText rupeesAmountEditText =(EditText) findViewById(R.id.rupeesAmountEditText);
        Double rupeesAmountDouble =Double.parseDouble(rupeesAmountEditText.getText().toString());
        Double dollarAmount = rupeesAmountDouble*0.013;
        Toast.makeText(MainActivity.this,"$" + String.format("%2f",dollarAmount),Toast.LENGTH_LONG).show();
        Log.i("amount",rupeesAmountEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
