/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roteiro;

import com.mycompany.classes.Airport;
import com.mycompany.classes.Flight;
import com.mycompany.classes.Passenger;
import com.mycompany.classes.SystemFidelity;
import com.mycompany.components.ManagerListFlights;
import com.mycompany.components.ManagerListPassenger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Roteiro {

    public static void main(String[] args) {
        SystemFidelity sf = new SystemFidelity();
        Passenger p1 = new Passenger("Joao", "12345678", "1");
        Passenger p2 = new Passenger("Joao1", "1234567", "2");
        Passenger p3 = new Passenger("Joao2", "123456", "3");
        Passenger p4 = new Passenger("Joao3", "12345", "4");
        Passenger p5 = new Passenger("Joao4", "1234", "5");
        Passenger p6 = new Passenger("Joao5", "12", "6");
        Passenger p7 = new Passenger("Joao6", "1", "7");
        Passenger p8 = new Passenger("Joao7", "3", "8");
        Passenger p9 = new Passenger("Joao8", "23", "9");
        Passenger p10 = new Passenger("Joao9", "13", "10");
        
        Flight f = new Flight();
        f.addScales("Miami");
        f.addScales("Orlando");
        
        ManagerListPassenger listPassenger = new ManagerListPassenger();
        listPassenger.addPassenger(p1);
        listPassenger.addPassenger(p2);
        listPassenger.addPassenger(p3);
        listPassenger.addPassenger(p4);
        listPassenger.addPassenger(p5);
        listPassenger.addPassenger(p6);
        listPassenger.addPassenger(p7);
        listPassenger.addPassenger(p8);
        listPassenger.addPassenger(p9);
        listPassenger.addPassenger(p10);   
        
        //voo com maior capacidade máxima, tende a ter um prejuízo maior
        Flight f1 = new Flight("BR123", 100, "Canadá", "Decolando");
        f1.addNewPassenger(p1);
        f1.addNewPassenger(p2);
        f1.addNewPassenger(p3);
        f1.addNewPassenger(p4);
        f1.addNewPassenger(p5);
        f1.addNewPassenger(p6);
        f1.addNewPassenger(p7);
        f1.addNewPassenger(p8);
        f1.addNewPassenger(p9);
        f1.addNewPassenger(p10);
        
        //voo com menor capacidade máxima, tender a ter um prejuízo menor
        Flight f2 = new Flight("BR1234", 10, "Canadá", "Decolando");
        f2.addNewPassenger(p1);
        f2.addNewPassenger(p2);
        f2.addNewPassenger(p3);
        f2.addNewPassenger(p4);
        f2.addNewPassenger(p5);
        f2.addNewPassenger(p6);
        f2.addNewPassenger(p7);
        f2.addNewPassenger(p8);
        f2.addNewPassenger(p9);
        f2.addNewPassenger(p10);
       
        
        ManagerListFlights listFlights = new ManagerListFlights();
        listFlights.addFlights(f1);
        listFlights.addFlights(f2);
        
        Airport airport = new Airport("Aeroporto Internacional de Brasília", "Brasília", listFlights);
        
        p1.getPontsAccrued().addPonts(100);
        p2.getPontsAccrued().addPonts(150);
        p3.getPontsAccrued().addPonts(10);
        p4.getPontsAccrued().addPonts(50);
        p5.getPontsAccrued().addPonts(90);
        p6.getPontsAccrued().addPonts(200);
        p7.getPontsAccrued().addPonts(20);
        p8.getPontsAccrued().addPonts(60);
        p9.getPontsAccrued().addPonts(5);
        p10.getPontsAccrued().addPonts(15);
        
        airport.startFlights("BR123");
        
        f1.attStateFlight("Pousando");       
        f2.attStateFlight("Concluído");
        
       p1.getPontsAccrued().currentlyTablePontsPassenger(listPassenger, 20);
        
        System.out.println("Voos com prejuízo: ");
        List<Flight> flightsPrejuice = airport.checkFlightsWithPrejudice();
        
        if(flightsPrejuice == null || flightsPrejuice.isEmpty()) {
            System.out.println("Nenhum voo");
        }
        else {
            for(int i = 0; i < flightsPrejuice.size(); i++) {
                System.out.println(flightsPrejuice.get(i).getNumberFlight());
            } 
        }                      
    }       
}
