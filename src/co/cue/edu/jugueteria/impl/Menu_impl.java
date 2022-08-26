package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.services.Menu_services;

import javax.swing.*;

public class Menu_impl implements Menu_services {
    @Override
    public int mainMenu(int option) {
        while (option<1 || option>4) {
            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n"+
                    "1. Crear juguete o empleado \n"+
                    "2. Informe juguetes \n"+
                    "3. Registrar una venta \n"+
                    "4. Nuevas funcionalidades"));
        }
        return option;
    }

    @Override
    public int creationMenu(int option) {
       while (option<1 || option>2){
           JOptionPane.showMessageDialog(null,"Ingrese una opción valida");
           option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n"+
                   "1. Crear un juguete "+
                   "2. Crear un Empleado"));
       }
       return option;
    }
    public int reportMenu(int option){
        while (option<1 || option>7){
            JOptionPane.showMessageDialog(null,"Ingrese una opción valida");
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar \n"+
                    "1. Generar informe de juguetes por cada tipo \n"+
                    "2. Genear informe de cantidad total de juguetes \n"+
                    "3. Generar informe de lvalor total de todos los juguetes disponibles \n"+
                    "4. Generar informe de cual tipo hay mas y menos juguetes disponibles \n"+
                    "5. Filtrar juguetes por precio \n"+
                    "6. Agregar unidades a un juguete \n"+
                    "7. Conocer caracteristicas de un producto"));
        }

        return option;
    }
}
