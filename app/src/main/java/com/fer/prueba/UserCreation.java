package com.fer.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.fer.prueba.model.Employee;
import com.fer.prueba.viewmodel.EmployeeViewModel;

public class UserCreation extends AppCompatActivity {

    private EmployeeViewModel mEmployeeViewModel;
    Button btnSave;
    EditText etName, etAge, etBoss, etDesc, etDepartment, etRole, etUsername, etPassword;
    String sName, sAge, sBoss,sDesc, sDepartment, sRole, sUsername, sPassword, sCountry;
    Spinner sSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_creation);

        btnSave = (Button) findViewById(R.id.btnSave);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etDesc = (EditText) findViewById(R.id.etDesc);
        etBoss = (EditText) findViewById(R.id.etBoss);
        etDepartment = (EditText) findViewById(R.id.etDepartment);
        etRole = (EditText) findViewById(R.id.etRole);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        sSpinner = (Spinner)  findViewById(R.id.spCountry);



        mEmployeeViewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())).get(EmployeeViewModel.class);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sName = etName.getText().toString();
                sAge = etAge.getText().toString();
                sBoss = etBoss.getText().toString();
                sDesc = etDesc.getText().toString();
                sDepartment = etDepartment.getText().toString();
                sRole = etRole.getText().toString();
                sUsername = etUsername.getText().toString();
                sPassword = etPassword.getText().toString();
                sCountry =  String.valueOf(sSpinner.getSelectedItem());




                Employee employee = new Employee(sName,sDesc,sRole,sAge,sDepartment,sBoss,sUsername,sPassword,sCountry);
                mEmployeeViewModel.insert(employee);

               finish();
            }
        });
    }




}