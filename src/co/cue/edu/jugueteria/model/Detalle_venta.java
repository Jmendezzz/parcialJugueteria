package co.cue.edu.jugueteria.model;

import javax.xml.transform.SourceLocator;

public class Detalle_venta {
    Juguete soldToy;
    int soldToyAmount;

    int totalAmount=0;

    public Detalle_venta(Juguete soldToy, int soldToyAmount) {
        this.soldToy = soldToy;
        this.soldToyAmount = soldToyAmount;
        totalAmount += soldToy.getToyPrice() *soldToyAmount;
    }

    public Juguete getSoldToy() {
        return soldToy;
    }

    public void setSoldToy(Juguete soldToy) {
        this.soldToy = soldToy;
    }

    public int getSoldToyAmount() {
        return soldToyAmount;
    }

    public void setSoldToyAmount(int soldToyAmount) {
        this.soldToyAmount = soldToyAmount;
    }
}
