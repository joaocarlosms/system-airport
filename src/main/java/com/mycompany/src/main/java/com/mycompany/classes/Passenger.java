/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Admin
 */
public class Passenger {
    private String name;
    private String cpf;
    private String id;
    private SystemFidelity pontsAccrued;
    
    public Passenger() {
        this.name = "";
        this.cpf = "";
        this.id = "";        
    }

    public Passenger(String name, String cpf, String id) {
        this.name = name;
        this.cpf = cpf;
        this.id = id;
        this.pontsAccrued = new SystemFidelity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SystemFidelity getPontsAccrued() {
        return pontsAccrued;
    }

    public void setPontsAccrued(SystemFidelity pontsAccrued) {
        this.pontsAccrued = pontsAccrued;
    }

    @Override
    public String toString() {
        return "Passenger{" + "name=" + name + 
                ", cpf=" + cpf + 
                ", id=" + id + 
                ", pontsAccrued=" + pontsAccrued + '}';
    }    
}
