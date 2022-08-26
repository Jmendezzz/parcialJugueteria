package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Jugueteria_impl;
import co.cue.edu.jugueteria.model.Cliente;
import co.cue.edu.jugueteria.model.Empleado;
import co.cue.edu.jugueteria.model.Juguete;

import javax.swing.*;

public class Jugueteria_controller {
    Jugueteria_impl jugueteria_impl = new Jugueteria_impl();

    public void  createClient(Cliente[] clientArray, int position){

        String clientName = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String clientId = JOptionPane.showInputDialog("Ingrese la cedula del cliente");
        String clientPhoneNumber = JOptionPane.showInputDialog("Ingrese el numero telefonico del cliente "+ clientName);
        String clientAdress = JOptionPane.showInputDialog("Ingrese la direccion de la vivienda del cliente "+ clientName);
        String clientBirthdayDate = JOptionPane.showInputDialog("Ingrese la fecha de cumpleaños del cliente " + clientName);
        String clientEmail = JOptionPane.showInputDialog("Ingrese el correo electronico del cliente "+ clientName);
        clientArray [position]= jugueteria_impl.createClient(clientName,clientId,clientPhoneNumber,clientAdress,clientBirthdayDate,clientEmail);
    }



}
