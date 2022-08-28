package co.cue.edu.jugueteria.impl;
import co.cue.edu.jugueteria.controllers.Juguete_controller;
import co.cue.edu.jugueteria.model.Detalle_venta;
import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Venta;
import co.cue.edu.jugueteria.services.Detalle_venta_services;

import javax.swing.*;

public class Detalle_venta_impl implements Detalle_venta_services {
    Juguete_controller juguete_controller = new Juguete_controller();
    @Override
    public Detalle_venta[] createDetalleVenta( int totalVendidos,Juguete toyInventory[], int toyInventoryPosition) {
        Juguete soldToy = null;
        Detalle_venta[] detalleVenta= new Detalle_venta[totalVendidos];
        boolean band = true;
        for (int i = 0; i<totalVendidos;i++){
            String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete que se va a comprar");
            for (int j = 0; j<toyInventoryPosition;j++){
                if (toyInventory[j] != null){
                    if(toyInventory[j].getToyName().equalsIgnoreCase(toyName)){
                        soldToy = toyInventory[i];
                    }
                }
            }
            int end = 0;
            while (soldToy==null){
                if (end ==0){
                    JOptionPane.showMessageDialog(null,"Juguete no encontrado, ingrese uno válido.");
                    toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete que se va a comprar");
                }else{
                    toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete que se va a comprar");

                }
                for (int j = 0; j<toyInventoryPosition;j++){
                    if (toyInventory[j] != null){
                        if(toyInventory[j].getToyName().equalsIgnoreCase(toyName)){
                            soldToy = toyInventory[i];
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"Juguete no encontrado.");
                 end = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 0 para salir al menu principal \n" +
                        "1 para intentar de nuevo"));
                if (end==0){
                    band = false;
                    break;
                }
            }
            if (!band){
                break;
            }
            int soldAmount= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad vendida"));
            if(soldToy.getToyAmount()-soldAmount<0){
                JOptionPane.showMessageDialog(null,"La cantidad ingresada no es permitida.");
                break;
            }
            soldToy.setToyAmount(soldToy.getToyAmount()-soldAmount);
            detalleVenta[i]=new Detalle_venta(soldToy,soldAmount);
        }
        return detalleVenta;
    }
    @Override
    public void printDetails(Venta venta) {
        JOptionPane.showMessageDialog(null, "Detalles de la venta: \n"+
                "Atendió: "+ venta.getEmployee().getUserName() + "\n"
        + "Cliente: "+ venta.getClient().getUserName() + "\n" +
            "Fecha: "+venta.getSaleDate());
    }
}
