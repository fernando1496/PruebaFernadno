package com.fer.prueba.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.fer.prueba.model.Employee;
import com.fer.prueba.model.EmployeeRepository;

import java.util.List;


public class EmployeeViewModel extends AndroidViewModel {

    private EmployeeRepository  mRepository;
    private LiveData<List<Employee>> mAllEmployees;

    public EmployeeViewModel(Application application) {
        super(application);
        mRepository = new EmployeeRepository(application);
        mAllEmployees = mRepository.getmAllEmployees();
    }

   public LiveData<List<Employee>> getmAllEmployees() { return mAllEmployees; }

    public void insert(Employee employee) { mRepository.insert(employee); }


}
