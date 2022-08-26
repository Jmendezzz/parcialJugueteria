package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Empleado;

public interface Empleado_services {
    public Empleado searchEmployee (String employeeName, Empleado employeeArray[], int employeeArrayPosition);
    public void createEmployee (String userName, String id, String phoneNumber, String adress, int salary, String laborDate);
}
