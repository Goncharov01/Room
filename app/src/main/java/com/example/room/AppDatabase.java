package com.example.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
}