/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import com.mycompany.components.ManagerListFlights;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Airport {
    private String name;
    private String location;
    private ManagerListFlights listFlights;

    public Airport(String name, String location, ManagerListFlights listFlights) {
        this.name = name;
        this.location = location;
        this.listFlights = listFlights;
    }
    
    public Airport() {
        this.name = "";
        this.location = "";
        this.listFlights = new ManagerListFlights();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ManagerListFlights getListFlights() {
        return listFlights;
    }

    public void setListFlights(ManagerListFlights listFlights) {
        this.listFlights = listFlights;
    }
    
    public void addNewFlights(Flight newFlight) {
        this.listFlights.addFlights(newFlight);
    }
    
    public void removeFlight(String numberFlight) {
        boolean removedFlight = listFlights.removeFlights(numberFlight);
        
        if(!removedFlight)
            System.out.println("Voo não encontrado!");
        else
            System.out.println("Voo removido com sucesso");
    }
    
    public List<Flight> checkFlightsWithPrejudice() {
        List<Flight> listFlightsPrejudice = new ArrayList<>();

        for (Flight flight : listFlights.getListFlights()) {
            int totalSeats = flight.getMaxCapacity();
            int occupiedSeats = flight.getListPassenger().getListPassenger().size();
            double occupancyRate = (double) occupiedSeats/totalSeats;
            //System.out.println(occupancyRate);
            
            //50% será o mínimo para não ser considerado prejuízo
            double minimumOccupancy = 0.5; 

            if (occupancyRate < minimumOccupancy) {
                listFlightsPrejudice.add(flight);
            }
        }
    return listFlightsPrejudice;
    }
    
    public void startFlights(String flight) {
        System.out.println(flight);
    }
}
