package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Juguete_proveedor;
import co.cue.edu.jugueteria.model.Proveedor;

public interface Proveedor_services {
    public void crateProveedor(String nombreProveedor, String codigoProveedor, String fechaIngreso, int diaPromesa);
    public Proveedor searchProveedor(String nombreProveedor);
    public void addInterestToys(int cantidadJuguetes, String toyCategory, Proveedor proveedor);
    public Juguete_proveedor searchToyProveedor (Proveedor proveedor, String toyName);
    public Proveedor searchProveedorForToys(String nombreProveedor, Proveedor arrayProveedor[], int arrayProveedorPosition);
    public void listOfToysProveedor(Proveedor proveedor);
}
