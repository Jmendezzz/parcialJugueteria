package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Cliente_impl;
import co.cue.edu.jugueteria.model.Cliente;

import javax.swing.*;

public class Cliente_controller {
    Cliente_impl cliente_impl = new Cliente_impl();

    public Cliente_impl services() {
        return cliente_impl;
    }

    public Cliente createClient (){
        String userName = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String id = JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente");
        String phoneNumber  = JOptionPane.showInputDialog("Ingrese el numero telefonico del cliente");
        String adress  = JOptionPane.showInputDialog("Ingrese la direccion de residencia del cliente");
        String birthdayDate = JOptionPane.showInputDialog("Ingrese la fecha de cumpleaños del cliente");
        String emailAdress = JOptionPane.showInputDialog("Ingrese el correo electronico del cliente");
        return cliente_impl.createClient(userName,id,phoneNumber,adress,birthdayDate,emailAdress);
    }
    public Cliente wantedClient(Cliente clientArray[], int clientArrayPosition){
        String clientName = JOptionPane.showInputDialog("Ingrese el nombre del cliente existente");
        return  cliente_impl.wantedClient(clientName,clientArray,clientArrayPosition);
    }
}
