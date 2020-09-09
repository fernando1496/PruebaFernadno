package com.fer.prueba.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;


@Entity(tableName = "rating_employee_table")
public class Rating {


    @ColumnInfo(name = "rating_employee_id")
    @PrimaryKey(autoGenerate = true)
    private int ratingEmployeeId;

    @ColumnInfo(name = "rating_id")
    private int ratingId;

    @ColumnInfo(name = "employee_id")
    private String employeeId;

    @ColumnInfo(name = "employee_rating")
    private String employeeRating;




    @Ignore
    public Rating() {
    }

    public Rating(int ratingEmployeeId, int ratingId, String employeeId, String employeeRating) {
        this.ratingEmployeeId = ratingEmployeeId;
        this.ratingId = ratingId;
        this.employeeId = employeeId;
        this.employeeRating = employeeRating;
    }

    public int getRatingEmployeeId() {
        return ratingEmployeeId;
    }

    public void setRatingEmployeeId(int ratingEmployeeId) {
        this.ratingEmployeeId = ratingEmployeeId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeRating() {
        return employeeRating;
    }

    public void setEmployeeRating(String employeeRating) {
        this.employeeRating = employeeRating;
    }
}
