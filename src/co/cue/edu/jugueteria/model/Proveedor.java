package co.cue.edu.jugueteria.model;

public class Proveedor {
    String nombreProveedor;
    String codigoProveedor;
    String fechaIngreso;
    int diaPromesa;
    String material;
    Juguete jugueteProveedor;


    public Proveedor(String nombreProveedor, String codigoProveedor, String fechaIngreso, int diaPromesa,String material) {
        this.nombreProveedor = nombreProveedor;
        this.codigoProveedor = codigoProveedor;
        this.fechaIngreso = fechaIngreso;
        this.diaPromesa = diaPromesa;
        this.material = material;
    }
}
