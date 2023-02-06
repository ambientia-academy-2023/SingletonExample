/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonexample;

/**
 *
 * @author pekka
 */
public class Singleton {

    private static Singleton single_instance = null;

    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}
