package com.praktikum.users;

public abstract class User {
    protected String nama;
    protected String password;

//constructor
    public User(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }
    //harus di override di kelas turunan
    public abstract boolean login();
    public abstract void displayAppMenu();

}