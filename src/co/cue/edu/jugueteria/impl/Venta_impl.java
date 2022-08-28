package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.controllers.Cliente_controller;
import co.cue.edu.jugueteria.controllers.Detalle_venta_controller;
import co.cue.edu.jugueteria.model.Cliente;
import co.cue.edu.jugueteria.model.Detalle_venta;
import co.cue.edu.jugueteria.model.Empleado;
import co.cue.edu.jugueteria.model.Venta;
import co.cue.edu.jugueteria.services.Cliente_services;
import co.cue.edu.jugueteria.services.Venta_services;
import javax.swing.*;
public class Venta_impl implements Venta_services {
    Venta salesArray[]= new Venta[100];
    int salesArrayPosition=0;
    Detalle_venta_controller detalle_venta_controller = new Detalle_venta_controller();
    Cliente_controller cliente_controller = new Cliente_controller();

    @Override
    public void createSale(String saleDate, Empleado empleado, Cliente cliente, int totalSoldToys, Detalle_venta[] toysSold) {

        if (empleado != null && cliente != null){
            salesArray[salesArrayPosition]= new Venta(saleDate,empleado,cliente,totalSoldToys,toysSold);
            cliente.setBoughtToys(cliente.getBoughtToys()+1);
            empleado.setVentasRealizadas(empleado.getVentasRealizadas()+1);
            detalle_venta_controller.printDetails(salesArray[salesArrayPosition]);
            salesArrayPosition++;
        }else JOptionPane.showMessageDialog(null,"Se ha producico un error en la venta, compruebe las entradas.");

    }



    @Override
    public void bestClient() {
        if(salesArrayPosition>0){
            Cliente bestClient=salesArray[0].getClient();
            for (int i = 0; i<salesArrayPosition;i++){
                if(salesArray[i].getClient().getBoughtToys()>bestClient.getBoughtToys()){
                    bestClient=salesArray[i].getClient();
                }
        }JOptionPane.showMessageDialog(null,"El cliente que mas compras ha realizado es: "+bestClient.getUserName()+
            " con un total de "+bestClient.getBoughtToys() + " compras");

        }else JOptionPane.showMessageDialog(null,"Aun no se ha resgitrado ninguna  venta");
    }

    @Override
    public void bestEmployee() {
        if(salesArrayPosition>0){
            Empleado bestEmployee = salesArray[0].getEmployee();
            for(int i= 0; i <salesArrayPosition; i++){
                if(salesArray[i].getEmployee().getVentasRealizadas()>bestEmployee.getVentasRealizadas()){
                    bestEmployee= salesArray[i].getEmployee();
                }
            }
            JOptionPane.showMessageDialog(null,"El empleado con mas ventas es: "+bestEmployee.getUserName()+ " con un total de "+bestEmployee.getVentasRealizadas() + " ventas realizadas");
        }else JOptionPane.showMessageDialog(null,"Aun no se ha registrado ninguna venta");
    }

}
