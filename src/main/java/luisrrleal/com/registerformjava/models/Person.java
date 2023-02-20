package luisrrleal.com.registerformjava.models;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String mail;
    private  String address;
    private String phoneNumber;
    private String company;
    private Date birthDate;
    private String gender;

    public Person(){

    }

    public Person(int id, String name, String mail, String address, String phoneNumber, String company, Date birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
