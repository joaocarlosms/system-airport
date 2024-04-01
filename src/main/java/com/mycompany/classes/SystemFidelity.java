/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.components.ManagerListPassenger;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SystemFidelity {
    private Integer pontsAccrued;
    
    public SystemFidelity() {
        this.pontsAccrued = 0;
    }

    public Integer getPontsAccrued() {
        return pontsAccrued;
    }

    public void setPontsAccrued(Integer pontsAccrued) {
        this.pontsAccrued = pontsAccrued;
    }   
    
    public void addPonts(Integer newPonts) {
        if(newPonts > 0)
            this.pontsAccrued += newPonts;
        else
            System.out.println("Ponto inválido!");
    }
    
    public Integer getBalancePonts() {
        return this.pontsAccrued;
    }
    
    public boolean rescuePonts(Integer pontsForRescue) {
        if(pontsForRescue <= 0 || pontsForRescue > this.pontsAccrued) {
            return false;
        }
        else {
            this.pontsAccrued -= pontsForRescue;
            return true;
        } 
    }
    
    public void currentlyTablePontsPassenger(ManagerListPassenger listPassengers, Integer value) {        
        System.out.printf("| %-10s | %-10s | %-10s |\n",
                "Passageiro", "Pontos anteriores", "Pontos atuais");
    
        for(int i = 0; i < listPassengers.getListPassenger().size(); i++) {
            Passenger passenger = listPassengers.getListPassenger().get(i);
            System.out.printf("| %-10s | %-16s | %-14s |\n",
                    passenger.getName(), "", passenger.getPontsAccrued().getPontsAccrued());
            System.out.printf("| %-10s | %-16s | %-14s |\n",
                    "", passenger.getPontsAccrued().getPontsAccrued()+value, "");
        }
    }
}
