package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Cliente;

public interface Cliente_services {
    public Cliente createClient ( String userName, String id, String phoneNumber, String adress, String birthdayDate, String emailAdress);
    public Cliente wantedClient(String clientName, Cliente clientArray[], int clientArrayPosition);

}
