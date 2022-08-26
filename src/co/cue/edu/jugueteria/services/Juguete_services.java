package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Juguete;

public interface Juguete_services {
    public void addToyInventory(String toyName, int toyAmount, int optionCategory, double toyPrice);
    public void toysType();
    public void totalToys ();
    public void totalToysValue ();
    public void minMaxToysType ();
    public void filterToys(int price);

    public void toyProperties(String toyName);
    public Juguete findAToy (String toyName);
    public void increaseStock(String toyName, int newAmount);


}
