package com.example.room;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddEmployeeFragment extends Fragment {

    private EditText employeeId, employeeName, employeeSalary;
    private Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_employee, container, false);

        btnSave = view.findViewById(R.id.buttonSave);
        employeeId = view.findViewById(R.id.editId);
        employeeName = view.findViewById(R.id.editName);
        employeeSalary = view.findViewById(R.id.editSalary);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int idEmployee = Integer.parseInt(employeeId.getText().toString());
                String nameEmployee = employeeName.getText().toString();
                int salaryEmployee = Integer.parseInt(employeeSalary.getText().toString());

                Employee employee2 = new Employee();
                employee2.setId(idEmployee);
                employee2.setName(nameEmployee);
                employee2.setSalary(salaryEmployee);

                MainActivity.appDatabase.employeeDao().addEmployee(employee2);
                Toast.makeText(getActivity(), "Employee Added OK", Toast.LENGTH_SHORT).show();

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + MainActivity.appDatabase.employeeDao().getAll());

                employeeId.setText("");
                employeeName.setText("");
                employeeSalary.setText("");

            }
        });
        return view;

    }
}
