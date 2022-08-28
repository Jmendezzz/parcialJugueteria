package co.cue.edu.jugueteria.model;

public class Proveedor {
    private String nombreProveedor;
    private String codigoProveedor;
    private String fechaIngreso;
    private int diaPromesa;
    private Juguete_proveedor arrayJuguetesProveedors[];


    public Proveedor(String nombreProveedor, String codigoProveedor, String fechaIngreso, int diaPromesa) {
        this.nombreProveedor = nombreProveedor;
        this.codigoProveedor = codigoProveedor;
        this.fechaIngreso = fechaIngreso;
        this.diaPromesa = diaPromesa;

    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDiaPromesa() {
        return diaPromesa;
    }

    public void setDiaPromesa(int diaPromesa) {
        this.diaPromesa = diaPromesa;
    }

    public Juguete_proveedor[] getArrayJuguetesProveedors() {
        return arrayJuguetesProveedors;
    }

    public void setArrayJuguetesProveedors(Juguete_proveedor[] arrayJuguetesProveedors) {
        this.arrayJuguetesProveedors = arrayJuguetesProveedors;
    }
}
