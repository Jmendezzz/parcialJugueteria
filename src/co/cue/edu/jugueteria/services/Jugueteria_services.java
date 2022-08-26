package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Cliente;
import co.cue.edu.jugueteria.model.Empleado;
import co.cue.edu.jugueteria.model.Juguete;

public interface Jugueteria_services {

    public Cliente createClient (String userName, String id, String phoneNumber, String adress, String birthdayDate, String emailAdress);

    public Juguete createToy (String toyName, int toyAmount, int optionCategory, double toyPrice);
}
