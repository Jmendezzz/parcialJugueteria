package co.cue.edu.jugueteria.model;

public class Empleado extends Usuario {
    private int salary;
    private int ventasRealizadas =0;

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    private String laborDate;
    public Empleado(String userName, String id, String phoneNumber, String adress, int salary, String laborDate) {
        super(userName, id, phoneNumber, adress);
        this.salary = salary;
        this.laborDate = laborDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLaborDate() {
        return laborDate;
    }

    public void setLaborDate(String laborDate) {
        this.laborDate = laborDate;
    }
}
