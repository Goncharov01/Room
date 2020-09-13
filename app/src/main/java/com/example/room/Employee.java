package com.example.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Employee {

    @PrimaryKey
    public int id;

    public String name;

    public int salary;

}
