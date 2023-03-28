package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Person {
    private String lastname;
    private String firstname;
    private String password;
    public static Vector<Person> users;
    public Person(String lastname , String firstname , String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        if(users == null){
            users = new Vector<Person>(1);
        }
        users.add(this);
    }
    public String getName(){
        return String.format("%s %s",firstname , lastname);
    }
    public static Vector<Person> getAllPersons(){
        return users;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
