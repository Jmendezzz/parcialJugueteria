package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Proveedor_impl;
import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Juguete_proveedor;
import co.cue.edu.jugueteria.model.Proveedor;

import javax.swing.*;

public class Proveedor_controller {
    Proveedor_impl proveedor_impl = new Proveedor_impl();

    public Proveedor_impl services() {
        return proveedor_impl;
    }

    public void createProveedor(){
        String proveedorName = JOptionPane.showInputDialog("Ingrse el nombre del proveedor");
        String proveedorCode = JOptionPane.showInputDialog("Ingrese el codigo del proveedor");
        String proveedorDate = JOptionPane.showInputDialog("Ingrese la fecha de contrato del proveedor");
        int proveedorDays =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias habiles para entrega de juguetes determinada por los proveedores"));
        proveedor_impl.crateProveedor(proveedorName,proveedorCode,proveedorDate,proveedorDays);

    }
    public void addInterestToys(){
        String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor que desea agregar una lista de juguetes deseada");
        int cantidadJuguetes = Integer.parseInt(JOptionPane.showInputDialog("Ingese la cantidad del tipo de juguetes que le interesa del proveedor"));
        String toysCategory =  JOptionPane.showInputDialog("Ingrese el material de los juguetes (recuerde que todos comparten el mismo material)");
        Proveedor proveedor = proveedor_impl.searchProveedor(nombreProveedor);
        proveedor_impl.addInterestToys(cantidadJuguetes,toysCategory,proveedor);
    }
    public Proveedor searchProveedor(){
        String proveedorName = JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        return proveedor_impl.searchProveedor(proveedorName);
    }
    public Juguete_proveedor searchToyProveedor(Proveedor arrayProveedor[], int arrayProveedorPosition){
        Proveedor proveedor = searchProveedorForToys(arrayProveedor,arrayProveedorPosition);
        String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
        return proveedor_impl.searchToyProveedor(proveedor,toyName);
    }
    public Proveedor searchProveedorForToys(Proveedor arrayProveedor[], int arrayProveedorPosition){
        String proveedorName = JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        return  proveedor_impl.searchProveedorForToys(proveedorName,arrayProveedor,arrayProveedorPosition);

    }
    public void listOfToysProveedor(){
        Proveedor proveedor = searchProveedor();
        proveedor_impl.listOfToysProveedor(proveedor);
    }
}
