package com.example.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import io.reactivex.rxjava3.core.Observable;

@Dao
public interface EmployeeDao {

    @Query("SELECT * FROM Employee")
    Observable<Employee> getAll();

    @Insert
    void insert(Employee employee);

}
