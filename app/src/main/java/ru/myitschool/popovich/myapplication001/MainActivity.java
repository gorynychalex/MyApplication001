package ru.myitschool.popovich.myapplication001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    
    Button buttonTXT;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        textView = findViewById(R.id.textViewMy);

        buttonTXT = findViewById(R.id.buttonMy);

        buttonTXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("My text");
            }
        });
    }

    public void buttonClick(View view) {

    }
}
