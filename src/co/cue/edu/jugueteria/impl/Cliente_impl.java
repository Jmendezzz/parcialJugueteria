package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.model.Cliente;
import co.cue.edu.jugueteria.services.Cliente_services;


public class Cliente_impl implements Cliente_services {
    Cliente[] clientArray = new Cliente[20];
    int clientArrayPosition = 0;

    public void setClientArray(Cliente[] clientArray) {
        this.clientArray = clientArray;
    }

    public void setClientArrayPosition(int clientArrayPosition) {
        this.clientArrayPosition = clientArrayPosition;
    }

    public Cliente[] getClientArray() {
        return clientArray;
    }

    public int getClientArrayPosition() {
        return clientArrayPosition;
    }

    public void createClient (String userName, String id, String phoneNumber, String adress, String birthdayDate, String emailAdress){
        clientArray[clientArrayPosition]= new Cliente(userName,id,phoneNumber,adress,birthdayDate,emailAdress);
        clientArrayPosition++;

    }

    @Override
    public Cliente searchClient(String clientName, Cliente clientArray[], int clientArrayPosition) {
        for (int i = 0 ; i<clientArrayPosition;i++){
            if (clientArray[i].getUserName().equalsIgnoreCase(clientName)){
                return  clientArray[i];
            }
        }
        return null;
    }

}
