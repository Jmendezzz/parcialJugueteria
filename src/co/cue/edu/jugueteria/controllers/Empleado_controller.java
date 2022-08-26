package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Empleado_impl;
import co.cue.edu.jugueteria.model.Empleado;

import javax.swing.*;

public class Empleado_controller {
    Empleado_impl empleado_impl = new Empleado_impl();

    public Empleado_impl services() {
        return empleado_impl;
    }

    public Empleado searchEmployee(Empleado employeeArray[], int employeeArrayPosition) {
        String employeeName = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        return empleado_impl.searchEmployee(employeeName,  employeeArray, employeeArrayPosition);

    }
    public void createEmployee (){

        String employeeName = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        String employeeId = JOptionPane.showInputDialog("Ingrese la cedula del empleado");
        String employeePhoneNumber = JOptionPane.showInputDialog("Ingrese el numero telefonico del empleado "+ employeeName);
        String employeeAdress = JOptionPane.showInputDialog("Ingrese la direccion de la vivienda del empleado "+ employeeName);
        int employeeSalary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado "+employeeName));
        String employeeLaborDate = JOptionPane.showInputDialog("Ingrese la fecha de ingreso laboral del empleado "+ employeeName);
        empleado_impl.createEmployee (employeeName,employeeId,employeePhoneNumber,employeeAdress,employeeSalary,employeeLaborDate);
    }
}
