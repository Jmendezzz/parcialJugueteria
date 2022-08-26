package co.cue.edu.jugueteria.services;

import co.cue.edu.jugueteria.model.Detalle_venta;
import co.cue.edu.jugueteria.model.Juguete;
import co.cue.edu.jugueteria.model.Venta;

public interface Detalle_venta_services {
    public Detalle_venta[] createDetalleVenta(int totalVendidos, Juguete toyInventory[],int toyInventoryPosition);
    public void printDetails(Venta venta);

}
