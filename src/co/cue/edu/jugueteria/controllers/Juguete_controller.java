package co.cue.edu.jugueteria.controllers;

import co.cue.edu.jugueteria.impl.Juguete_impl;
import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Juguete_proveedor;
import co.cue.edu.jugueteria.model.Proveedor;

import javax.swing.*;

public class Juguete_controller {
    Juguete_impl juguete_impl = new Juguete_impl();
    Proveedor_controller proveedor_controller = new Proveedor_controller();

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
    public void proveedorToys(Proveedor arrayProveedor[], int arrayProveedorPosition){
        Juguete_proveedor juguete = proveedor_controller.searchToyProveedor(arrayProveedor,arrayProveedorPosition);
        int cantidadJuguetesComprados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades que desea añadir al inventario del juguete "));
        int precioVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de venta del nuevo juguete"));
        juguete_impl.proveedorToys(juguete,cantidadJuguetesComprados,precioVenta);
    }
    public void toyPropertiesProveedor(){
        juguete_impl.toyPropertiesProveedor();
    }
}
