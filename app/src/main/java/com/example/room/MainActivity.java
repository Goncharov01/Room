package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database").allowMainThreadQueries().fallbackToDestructiveMigration().build();

        fragmentManager.beginTransaction().add(R.id.fragment_content, new HomeFragment()).commit();

    }
}
