package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] countryName;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName=getResources().getStringArray(R.array.countryname);
        spinner=findViewById(R.id.spinnerId);
        button=findViewById(R.id.buttonId);
        textView=findViewById(R.id.textViewId);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sample,R.id.sampleTextViewId,countryName);
       spinner.setAdapter(adapter);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String valu=spinner.getSelectedItem().toString();
               textView.setText(valu);
               Toast.makeText(MainActivity.this,valu, Toast.LENGTH_SHORT).show();
           }
       });
    }
}