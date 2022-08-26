package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Menu_impl;

import javax.swing.*;

public class Menu_controller {
    Menu_impl menu_impl = new Menu_impl();
    public int creationMenu(){
         int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n"+
                 "1. Crear un juguete \n"+
                 "2. Crear un Empleado" ));
         return menu_impl.creationMenu(option);
    }
    public int mainMenu(){
        int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n"+
                "1. Crear juguete o empleado \n"+
                "2. Informe juguetes / Inventario \n"+
                "3. Registrar una venta" +
                "4. Nuevas funcionalidades"));
        return menu_impl.mainMenu(option);
    }
    public int reportMenu() {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n" +
                "1. Generar informe de juguetes por cada tipo \n" +
                "2. Genear informe de cantidad total de juguetes \n" +
                "3. Generar informe del valor total de todos los juguetes disponibles \n" +
                "4. Generar informe de cual tipo hay mas y menos juguetes disponibles \n" +
                "5. Filtrar juguetes por precio \n"+
                "6. Agregar unidades a un juguete \n"+
                "7. Conocer las caracteristicas de un producto"));
        return menu_impl.reportMenu(option);
    }
}
