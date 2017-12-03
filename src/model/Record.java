package model;

public class Record {

    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private String phoneNumber;
    private String adress;

    public  Record(){
        this.firstname = null;
        this.lastname = null;
        this.dateOfBirth = null;
        this.phoneNumber = null;
        this.adress = null;
    }

    public Record(String firstname, String lastname, String dateOfBirth, String phoneNumber, String adress){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.adress = adress;

    }

    public String getAdress() {
        return adress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
