package com.fer.prueba.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;


@Entity(tableName = "employee_table")
public class Employee {



    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "employee_id")
    private int employeeId;

    @ColumnInfo(name = "employee_name")
    private String employeeName;

    @ColumnInfo(name = "employee_user")
    private String employeeuser;

    @ColumnInfo(name = "employee_pass")
    private String employeePass;

    @ColumnInfo(name = "employee_description")
    private String employeeDescription;

    @ColumnInfo(name = "employee_role")
    private String employee_Role;

    @ColumnInfo(name = "employee_age")
    private String employee_age;

    @ColumnInfo(name = "employee_department")
    private String employee_department;

    @ColumnInfo(name = "employee_boss")
    private String employeeBoss;

    @ColumnInfo(name = "employee_country")
    private String employeeCountry;

    public Employee() {
    }

    public Employee(String employeeName, String employeeDescription, String employee_Role, String employee_age, String employee_department, String employeeBoss, String employeeuser, String employeePass, String employeeCountry) {

        this.employeeuser = employeeuser;
        this.employeePass = employeePass;
        this.employeeName = employeeName;
        this.employeeDescription = employeeDescription;
        this.employee_Role = employee_Role;
        this.employee_age = employee_age;
        this.employee_department = employee_department;
        this.employeeBoss = employeeBoss;
        this.employeeCountry = employeeCountry;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDescription() {
        return employeeDescription;
    }

    public void setEmployeeDescription(String employeeDescription) {
        this.employeeDescription = employeeDescription;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    public String getEmployee_Role() {
        return employee_Role;
    }

    public void setEmployee_Role(String employee_Role) {
        this.employee_Role = employee_Role;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }

    public String getEmployee_department() {
        return employee_department;
    }

    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }

    public String getEmployeeBoss() {
        return employeeBoss;
    }

    public void setEmployeeBoss(String employeeBoss) {
        this.employeeBoss = employeeBoss;
    }

    public String getEmployeeuser() {
        return employeeuser;
    }

    public void setEmployeeuser(String employeeuser) {
        this.employeeuser = employeeuser;
    }

    public String getEmployeePass() {
        return employeePass;
    }

    public void setEmployeePass(String employeePass) {
        this.employeePass = employeePass;
    }
}
