package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.model.Empleado;
import co.cue.edu.jugueteria.services.Empleado_services;

import javax.swing.*;

public class Empleado_impl implements Empleado_services {
    private Empleado employeeArray [] = new Empleado[5];
    public int employeeArrayPosition = 0;
    @Override
    public Empleado searchEmployee(String employeeName, Empleado employeeArray[], int employeeArrayPosition) {
        for (int i = 0; i<employeeArrayPosition; i++){
            if(employeeArray[i].getUserName().equalsIgnoreCase(employeeName)) {
                return employeeArray[i];
            }
        }
        return null;
    }
    @Override
    public void createEmployee(String userName, String id, String phoneNumber, String adress, int salary, String laborDate) {
        if (employeeArrayPosition<5){
            employeeArray[employeeArrayPosition]= new Empleado(userName,id,phoneNumber,adress,salary,laborDate);
            employeeArrayPosition++;
        }else JOptionPane.showMessageDialog(null,"Ya se ha agregado el máximo de empleaodos (5)");

    }

    public Empleado[] getEmployeeArray() {
        return employeeArray;
    }

    public int getEmployeeArrayPosition() {
        return employeeArrayPosition;
    }
}
