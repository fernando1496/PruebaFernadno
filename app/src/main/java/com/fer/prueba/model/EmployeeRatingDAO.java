package com.fer.prueba.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EmployeeRatingDAO {

    @Insert
    void insert(Rating rating);

    @Update
    void update(Rating rating);

    @Delete
    void delete(Rating rating);

    @Query("SELECT * FROM rating_employee_table WHERE employee_id ==:employeeId")
    LiveData<List<Rating>> getRating(int employeeId);

}
