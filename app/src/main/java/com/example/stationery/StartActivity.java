package com.example.stationery;

import androidx.appcompat.app.AppCompatActivity;import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;import android.view.View;
public class StartActivity extends AppCompatActivity {
    private ConstraintLayout start_btn;
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        start_btn = findViewById(R.id.start_btn);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                startActivity(new Intent(StartActivity.this, MainActivity.class));
        }
        });
    }
}