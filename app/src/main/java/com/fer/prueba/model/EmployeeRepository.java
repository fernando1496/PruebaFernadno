package com.fer.prueba.model;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;

public class EmployeeRepository {

    private EmployeeDAO employeeDAO;
    private LiveData<List<Employee>> mAllEmployees;


    public EmployeeRepository(Application application) {
        myDataBase db = myDataBase.getInstance(application);
        employeeDAO = (EmployeeDAO) db.employeeDAO();
       // mAllEmployees = employeeDAO.getEmployee()
    }


    public LiveData<List<Employee>> getmAllEmployees() {
        return mAllEmployees;
    }


    public void insert(Employee employee) {
        myDataBase.databaseWriteExecutor.execute(() -> {
            employeeDAO.insert(employee);
        });
    }
}
