/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.classes.Flight;
import com.mycompany.classes.Passenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ManagerListFlights {
    List<Flight> listFlights;
    
    public ManagerListFlights() {
        this.listFlights = new ArrayList<>();
    }

    public List<Flight> getListFlights() {
        return listFlights;
    }

    public void setListFlights(List<Flight> listFlights) {
        this.listFlights = listFlights;
    }
    
    public void addFlights(Flight newFlight) {
        this.listFlights.add(newFlight);
    }
    
    public boolean removeFlights(String numberFlightWanted) {
        for(Flight f : listFlights) {
            if(f.getNumberFlight().equals(numberFlightWanted)) {
                System.out.println("Número do voo: "+ f.getNumberFlight());
                return true;
            }
        }
        return false;
    }
    
    public void startFlight(String flight) {
        System.out.println(flight);
    }  
}
