package com.fer.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fer.prueba.viewmodel.EmployeeViewModel;




public class MainActivity extends AppCompatActivity {

    private EmployeeViewModel mEmployeeViewModel;
    TextView txtCreateAccount;
    EditText txtUsername,txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCreateAccount = (TextView) findViewById(R.id.txtCreateAccount);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        mEmployeeViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(EmployeeViewModel.class);

        txtCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), UserCreation.class);
                startActivity(myIntent);

            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //validacion del usuario ingresadod



            }
        });
    }
}