package co.cue.edu.jugueteria.impl;

import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Juguete_proveedor;
import co.cue.edu.jugueteria.model.Proveedor;
import co.cue.edu.jugueteria.services.Proveedor_services;

import javax.swing.*;

public class Proveedor_impl implements Proveedor_services {
    Proveedor arrayProveedor[]=new Proveedor[10];
    int arrayPostionProveedor=0;

    public Proveedor[] getArrayProveedor() {
        return arrayProveedor;
    }

    public int getArrayPostionProveedor() {
        return arrayPostionProveedor;
    }

    @Override
    public void crateProveedor(String nombreProveedor, String codigoProveedor, String fechaIngreso, int diaPromesa) {
        arrayProveedor[arrayPostionProveedor]=new Proveedor(nombreProveedor,codigoProveedor,fechaIngreso,diaPromesa);
        arrayPostionProveedor++;
    }

    @Override
    public Proveedor searchProveedor(String nombreProveedor) {
        for(int i = 0; i<arrayPostionProveedor;i++){
            if (arrayProveedor[i].getNombreProveedor().equalsIgnoreCase(nombreProveedor)){
                return  arrayProveedor[i];
            }
        }
        return null;
    }

    @Override
    public void addInterestToys(int cantidadJuguetes ,String toyCategory, Proveedor proveedor) {

        if (proveedor != null){
            Juguete_proveedor arrayJuguetesDeseados[] = new Juguete_proveedor[cantidadJuguetes];
            for (int i = 0; i<cantidadJuguetes; i++){
                String toyName = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
                double toyPrice = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del juguete"));
                arrayJuguetesDeseados[i]= new Juguete_proveedor(toyName,0,toyCategory,toyPrice,proveedor);
                JOptionPane.showMessageDialog(null,"Juguete agregado correctamente a la lista de deseos del proveedor "+ proveedor.getNombreProveedor());
            }
            proveedor.setArrayJuguetesProveedors(arrayJuguetesDeseados);

        }else JOptionPane.showMessageDialog(null,"Hubo un error (El proveedor no se encontró).");
    }

    @Override
    public Juguete_proveedor searchToyProveedor(Proveedor proveedor, String toyName) {
        if(proveedor!=null){

            if(proveedor.getArrayJuguetesProveedors()!=null){
                for(int i = 0; i<proveedor.getArrayJuguetesProveedors().length;i++){
                    if(proveedor.getArrayJuguetesProveedors()[i].getToyName().equalsIgnoreCase(toyName)){
                        return proveedor.getArrayJuguetesProveedors()[i];
                    }
                }

            }else JOptionPane.showMessageDialog(null,"El proveedor aún no se la añadido una lista de juguetes desados, por favor ingresela.");

        } else JOptionPane.showMessageDialog(null,"El proveedor no se ha encontrado.");

        return  null;
    }

    @Override
    public Proveedor searchProveedorForToys(String nombreProveedor, Proveedor arrayProveedor[], int arrayProveedorPosition) {
        for(int i = 0; i<arrayProveedorPosition;i++){
            if (arrayProveedor[i].getNombreProveedor().equalsIgnoreCase(nombreProveedor)){
                return  arrayProveedor[i];
            }
        }
        return null;
    }

    @Override
    public void listOfToysProveedor(Proveedor proveedor) {
        if(proveedor != null){
            if(proveedor.getArrayJuguetesProveedors()!=null){
                String finalString ="Proveedor: "  +proveedor.getNombreProveedor() + "\n";
                for (int i = 0; i<proveedor.getArrayJuguetesProveedors().length;i++){
                    finalString +=
                            "Nombre juguete: "+proveedor.getArrayJuguetesProveedors()[i].getToyName() +
                                    "  Precio: "+ proveedor.getArrayJuguetesProveedors()[i].getToyPrice()+ "  Material: "+proveedor.getArrayJuguetesProveedors()[i].toyCategory +
                    "\n";
                }
                JOptionPane.showMessageDialog(null,finalString);
            }else JOptionPane.showMessageDialog(null,"Al proveedor aún no se le ha añadido una lista de juguetes deseados, por favor ingresela.");


        }else JOptionPane.showMessageDialog(null,"El proveedor no se encontro!");

    }


}
