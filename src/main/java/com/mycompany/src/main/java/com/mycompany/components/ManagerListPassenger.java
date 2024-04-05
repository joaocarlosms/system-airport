/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.classes.Passenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManagerListPassenger {
    List<Passenger> listPassenger;
    
    public ManagerListPassenger() {
        this.listPassenger = new ArrayList<>();
    }

    public List<Passenger> getListPassenger() {
        return listPassenger;
    }

    public void setListPassenger(List<Passenger> listPassenger) {
        this.listPassenger = listPassenger;
    }
    
    public void addPassenger(Passenger newPassenger) {
        this.listPassenger.add(newPassenger);
    }
    
    public boolean removePassenger(String cpfWanted) {
        for(Passenger p : listPassenger) {
            if(p.getCpf().equals(cpfWanted)){
                System.out.println("Passageiro: "+ p.getName());
                return true;
            }
        }
        return false;
    }
}
