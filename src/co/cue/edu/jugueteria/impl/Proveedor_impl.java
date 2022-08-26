package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.model.Proveedor;
import co.cue.edu.jugueteria.services.Proveedor_services;

public class Proveedor_impl implements Proveedor_services {
    Proveedor arrayProveedor[]=new Proveedor[10];
    int arrayPostionProveedor=0;


    @Override
    public void crateProveedor(String nombreProveedor, String codigoProveedor, String fechaIngreso, int diaPromesa, String material) {
        arrayProveedor[arrayPostionProveedor]=new Proveedor(nombreProveedor,codigoProveedor,fechaIngreso,diaPromesa,material);
        arrayPostionProveedor++;
    }
}
