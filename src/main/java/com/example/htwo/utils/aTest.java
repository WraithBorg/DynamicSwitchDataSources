package com.example.htwo.utils;

import com.example.htwo.eum.DbNameEum;

public class aTest {
    public static void main(String[] args) {
        System.out.println(DbNameEum.H2.name());
        System.out.println(DbNameEum.H2.toString());

//        String name = "MYSQL1";
//        switch (DbNameEum.getByName(name)) {
//            case H2:
//                System.out.println("HH@@");
//                break;
//            case MYSQL:
//                System.out.println("MYSQL@@");
//                break;
//            default:
//                System.out.println("default@@");
//                break;
//        }
    }
}
