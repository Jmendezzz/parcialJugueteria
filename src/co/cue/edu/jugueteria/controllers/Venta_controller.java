package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Venta_impl;
import co.cue.edu.jugueteria.model.*;

import javax.swing.*;

public class Venta_controller {
    Venta_impl venta_impl = new Venta_impl();
    Empleado_controller empleado_controller = new Empleado_controller();
    Detalle_venta_controller detalle_venta_controller = new Detalle_venta_controller();
    Cliente_controller cliente_controller = new Cliente_controller();

    public  void createSale(Juguete toyInventory[],int toyInventoryPosition,Cliente clientArray[], int clientArrayPosition, Empleado employeeArray[], int employeeArrayPosition) {
            String saleDate = JOptionPane.showInputDialog("Ingrese la fecha de la venta");
            Empleado empleado = empleado_controller.searchEmployee(employeeArray,employeeArrayPosition);
            Cliente cliente = cliente_controller.searchClient(clientArray,clientArrayPosition);
            int totalSoldToys = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de articulos vendidos"));
            Detalle_venta[] arrayDetalleVenta;
            arrayDetalleVenta=detalle_venta_controller.createDetalleVenta(totalSoldToys,toyInventory,toyInventoryPosition);
            venta_impl.createSale(saleDate,empleado,cliente,totalSoldToys,arrayDetalleVenta);
    }

    public void bestClient(){
        venta_impl.bestClient();
    }
    public void bestEmployee(){
        venta_impl.bestEmployee();
    }
}
