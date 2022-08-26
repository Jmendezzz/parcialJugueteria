package co.cue.edu.jugueteria.model;

public class Usuario {
    private String userName;
    private String id;
    private String phoneNumber;
    private String adress;

    public Usuario(String userName, String id, String phoneNumber, String adress) {
        this.userName = userName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
