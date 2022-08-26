package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Detalle_venta_impl;
import co.cue.edu.jugueteria.model.Detalle_venta;
import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Venta;

import javax.swing.*;

public class Detalle_venta_controller {
    Detalle_venta_impl detalle_venta_impl = new Detalle_venta_impl();
    Juguete_controller  juguete_controller = new Juguete_controller();

    public Detalle_venta[] createDetalleVenta( int totalVendidos,Juguete toyInventory[],int toyInventoryPosition){
            return detalle_venta_impl.createDetalleVenta(totalVendidos,toyInventory,toyInventoryPosition);
    }
    public void printDetails(Venta venta){
        detalle_venta_impl.printDetails(venta);
    }

}
