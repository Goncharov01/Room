package com.example.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EmployeeDao {

    @Query("SELECT * FROM Employee")
    List<Employee> getAll();

    @Insert
    public void addEmployee(Employee employee);
}
