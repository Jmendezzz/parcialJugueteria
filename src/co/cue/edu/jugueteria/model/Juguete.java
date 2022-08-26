package co.cue.edu.jugueteria.model;

public class Juguete {
    public String toyName;
    private int toyAmount;
    public String toyCategory;
    public double toyPrice;

    public Juguete(String toyName, int toyAmount, String toyCategory, double toyPrice) {
        this.toyName = toyName;
        this.toyAmount = toyAmount;
        this.toyCategory = toyCategory;
        this.toyPrice = toyPrice;
    }

    public int getToyAmount() {
        return toyAmount;
    }

    public void setToyAmount(int toyAmount) {
        this.toyAmount = toyAmount;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyCategory() {
        return toyCategory;
    }

    public void setToyCategory(String toyCategory) {
        this.toyCategory = toyCategory;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }
}
