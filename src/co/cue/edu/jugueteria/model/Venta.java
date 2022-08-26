package co.cue.edu.jugueteria.model;

public class Venta {
    private String saleDate;
    private Detalle_venta[] toysSold;
    private Empleado employee;
    private Cliente client;

    public Venta(String saleDate, Empleado employee, Cliente client, int totalSoldToys, Detalle_venta[] toysSold) {
        this.saleDate = saleDate;
        this.employee = employee;
        this.client = client;
        this.toysSold=new Detalle_venta[totalSoldToys];
        this.toysSold = toysSold;

    }
    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public Detalle_venta[] getToysSold() {
        return toysSold;
    }

    public void setToysSold(Detalle_venta[] toysSold) {
        this.toysSold = toysSold;
    }

    public Empleado getEmployee() {
        return employee;
    }

    public void setEmployee(Empleado employee) {
        this.employee = employee;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

}
