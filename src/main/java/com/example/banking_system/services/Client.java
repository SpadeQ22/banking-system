package com.example.banking_system.services;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Client {
    @CsvBindByName
    private String id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String addr;
    @CsvBindByName
    private String mob;
    @CsvBindByName
    private String tele;
    @CsvBindByName
    private String occupation;
    @CsvBindByName
    private int salary;
    @CsvBindByName
    private String username;
    @CsvBindByName
    private String pass;
    @CsvBindByName
    private String email;
    @CsvRecurse
    private Account account;

    public Client(String name, String addr, String mob, String username, String pass, String email) throws FileNotFoundException {
        this.name = name;
        this.addr = addr;
        this.mob = mob;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.setId();
    }

    public Client(String name, String addr, String mob, String tele, String username, String pass, String email) throws FileNotFoundException {
        this.name = name;
        this.addr = addr;
        this.mob = mob;
        this.tele = tele;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.setId();
    }

    public Client(String name, String addr, String mob, String tele, String occupation, int salary, String username, String pass, String email) throws FileNotFoundException {
        this.name = name;
        this.addr = addr;
        this.mob = mob;
        this.tele = tele;
        this.occupation = occupation;
        this.salary = salary;
        this.username = username;
        this.pass = pass;
        this.setId();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setId() throws FileNotFoundException {
        try (Stream<String> stream = Files.lines(Path.of("/com/example/banking_system/database/clients.csv"), StandardCharsets.UTF_8)) {
            this.id = String.valueOf(stream.count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}