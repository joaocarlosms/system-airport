/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.components.ManagerListPassenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Flight {
    private String numberFlight;
    private Integer maxCapacity;
    private String fate;
    private ManagerListPassenger listPassenger;
    private List<String> listScales;
    private String stateFlight;
    
    public Flight() {
        this.numberFlight = "";
        this.maxCapacity = 0;
        this.fate = "";
        this.listPassenger = new ManagerListPassenger();
        this.listScales = new ArrayList<>();
        this.stateFlight = "";
    }

    public Flight(String numberFlight, Integer maxCapacity, String fate, String stateFlight) {
        this.numberFlight = numberFlight;
        this.maxCapacity = maxCapacity;
        this.fate = fate;
        this.listScales = new ArrayList<>();
        this.listPassenger = new ManagerListPassenger();
        this.stateFlight = stateFlight;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    public void setNumberFlight(String numberFlight) {
        this.numberFlight = numberFlight;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getFate() {
        return fate;
    }

    public void setFate(String fate) {
        this.fate = fate;
    }

    public ManagerListPassenger getListPassenger() {
        return listPassenger;
    }

    public void setListPassenger(ManagerListPassenger listPassenger) {
        this.listPassenger = listPassenger;
    }

    public List<String> getListScales() {
        return listScales;
    }

    public void setListScales(List<String> listScales) {
        this.listScales = listScales;
    }

    public String getStateFlight() {
        return stateFlight;
    }

    public void setStateFlight(String stateFlight) {
        this.stateFlight = stateFlight;
    }
    
    public void addNewPassenger(Passenger newPassenger) {
        listPassenger.addPassenger(newPassenger);
    }
    
    public void removePassenger(String cpfWanted) {
        boolean removedPassenger = listPassenger.removePassenger(cpfWanted);
        
        if(!removedPassenger)
            System.out.println("Passageiro não encontrado");
        else
            System.out.println("Passageiro removido com sucesso");
    }   
    
    public void addScales(String newScale) {
        this.listScales.add(newScale);
    }
    
    public boolean removeScales(String scaleWanted) {
        for(String scale : listScales) {
            if(scale.equals(scaleWanted)) {
                this.listScales.remove(scale);
                return true;
            }
        }
        return false;
    }
    
    public void attStateFlight(String attStateFlight) {    
        System.out.println("Status anterior do voo: "+ this.stateFlight);
        this.setStateFlight(attStateFlight);
        System.out.println("Status atual do voo: "+ this.stateFlight);
    }
    
    public void checkFlightDownMinCapacity(Integer minCapacity) {
        if(listPassenger.getListPassenger().size() < minCapacity) {
            System.out.println("O voo está abaixo da capacidade mínima");
        }   
    }
}
