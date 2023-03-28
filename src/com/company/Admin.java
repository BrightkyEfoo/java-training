package com.company;

import java.util.Vector;

public class Admin extends Person{
    public Admin(String lastname , String firstname , String password){
        super(lastname , firstname , password);
    }
    public Vector<Person> getUsers (){
        return Person.getAllPersons();
    }
}
