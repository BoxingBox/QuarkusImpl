package org.acme;

public class Person {

    private int id;
    private String name;
    private int age;
    private int telephoneNumber;

    private String location;

    public Person(int id, String name, int age, int telephoneNumber, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.location = location;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
