package kz.aitu.oop.practice.assignment4;

public class Personal {//this class will be used as core to others.It has all similar characteristics of 4 classes
    private  int Id;//vales
    private String Name;
    private String Surname;
    private int age;
    private String gender;
    private String PhoneNumber;
    private String email;

    public Personal(int id, String name, String surname, int age, String gender, String phoneNumber, String email) {//constructor
        Id = id;
        Name = name;
        Surname = surname;
        this.age = age;
        this.gender = gender;
        PhoneNumber = phoneNumber;
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    } //getr and setr

    public String getGender() {
        return gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
