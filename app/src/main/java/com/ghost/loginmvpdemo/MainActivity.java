package com.ghost.loginmvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private Button login;
    private EditText userName;
    private EditText password;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private void initView() {
        login = findViewById(R.id.btn_login);
        userName = findViewById(R.id.et_user_name);
        password = findViewById(R.id.et_pass_word);
        progressBar = findViewById(R.id.progressBar);
    }
}
