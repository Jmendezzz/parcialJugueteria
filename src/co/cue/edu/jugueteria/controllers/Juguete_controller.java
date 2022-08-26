package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Juguete_impl;
import co.cue.edu.jugueteria.model.Juguete;

import javax.swing.*;

public class Juguete_controller {
    Juguete_impl juguete_impl = new Juguete_impl();

    public Juguete_impl service() {
        return juguete_impl;
    }

    public void addToyInventory(){
        String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
        int toyAmount =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del juguete " +toyName));
        double toyPrice = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del juguete "+ toyName));
        int categoryOption = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la categoria del juguete \n"+
                "1. Plastico \n"+
                "2. Tela \n"+
                "3. Electronico"));
        juguete_impl.addToyInventory(toyName,toyAmount,categoryOption,toyPrice);
    }
    public  void toysType (){
        juguete_impl.toysType();
    }
    public  void totalToys (){
        juguete_impl.totalToys();
    }
    public  void totalToysValue (){
        juguete_impl.totalToysValue();
    }
    public void minMaxToysType (){
        juguete_impl.minMaxToysType();
    }
    public void filterToys(){
        int priceRange =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio para filtar los juguetes")) ;
        juguete_impl.filterToys(priceRange);
    }
    public void toyProperties(){
        String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete que desea conocer las propiedades");
        juguete_impl.toyProperties(toyName);
    }
    public Juguete findAToy(){
        String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete que se vendió");
        return juguete_impl.findAToy(toyName);
    }
    public void increaseStock(){
        String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
        int newAmount = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea agregar"));
        juguete_impl.increaseStock(toyName,newAmount);
    }
}
