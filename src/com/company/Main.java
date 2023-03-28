package com.company;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) throws Exception {
        Person user1 = new Person("Bright" , "EFO'O" , "123456789");
        Admin admin1 = new Admin("admin","admin","admin");
        var name = user1.getName();
        System.out.println(name);
        System.out.println(admin1.getUsers());
    }
}
