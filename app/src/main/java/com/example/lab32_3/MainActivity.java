package com.example.lab32_3;
;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView result;
    private CheckBox chHtml, chJava, chWeb, chCss;
    ArrayList<String> lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        chCss=(CheckBox) findViewById(R.id.chCss);
        chJava=(CheckBox) findViewById(R.id.chJava);
        chWeb=(CheckBox) findViewById(R.id.chWeb);
        chHtml=(CheckBox) findViewById(R.id.chHtml);
        result=(TextView) findViewById(R.id.result);
        lesson = new ArrayList<String>();
        chHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chHtml.isChecked()) lesson.add("HTML");
                else lesson.remove("HTML");
            }
        });
        chWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chWeb.isChecked()) lesson.add("Web");
                else lesson.remove("Web");
            }
        });
        chJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chJava.isChecked()) lesson.add("Java");
                else lesson.remove("Java");
            }
        });
        chCss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chCss.isChecked()) lesson.add("CSS");
                else lesson.remove("CSS");
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb= new StringBuilder();
                for (String txt: lesson)
                    sb.append(txt).append(", ");
                result.setText("Your skills: "+sb.toString());
            }
        });


    }
}