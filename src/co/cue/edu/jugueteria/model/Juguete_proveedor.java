package co.cue.edu.jugueteria.model;

public class Juguete_proveedor extends Juguete{
    Proveedor proveedor;
    public Juguete_proveedor(String toyName, int toyAmount, String toyCategory, double toyPrice, Proveedor proveedor) {
        super(toyName, toyAmount, toyCategory, toyPrice);
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
