package com.aquarian.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk();
    }

    public void masuk(){
        final EditText username = (EditText) findViewById(R.id.usernameEt);
        final EditText password = (EditText) findViewById(R.id.passswordEt);
        Button login = (Button) findViewById(R.id.loginB);

        assert login != null;
        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        assert username != null;
                        assert password != null;
                        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                            Toast.makeText(MainActivity.this, "Selamat Datang", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }
}
