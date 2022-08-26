package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Proveedor_impl;

import javax.swing.*;

public class Proveedor_controller {
    Proveedor_impl proveedor_impl = new Proveedor_impl();
    public void createProveedor(){
        String proveedorName = JOptionPane.showInputDialog("Ingrse el nombre del proveedor");
        String proveedorCode = JOptionPane.showInputDialog("Ingrese el codigo del proveedor");
        String proveedorDate = JOptionPane.showInputDialog("Ingrese la fecha de contrado del proveedor");
        int proveedorDays =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias habiles para entrega de juguetes determinada por los proveedores"));
        String proveedorMaterial = JOptionPane.showInputDialog("Ingrese el material de los juguetes");
        proveedor_impl.crateProveedor(proveedorName,proveedorCode,proveedorDate,proveedorDays,proveedorMaterial);

    }
}
