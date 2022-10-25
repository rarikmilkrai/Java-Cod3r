package com.pluralsigth.hibernatefundamentals;

import com.pluralsigth.hibernatefundamentals.airport.Passenger;
import com.pluralsigth.hibernatefundamentals.airport.Ticket;

import javax.swing.text.html.parser.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class main {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.creatEntityManagerFactory(persistenceUnitName:"hibernatefundamentals.m02.ex01")
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Airport airport = new Airport(id:1, name: "Rarikmilkrai Souza");

        Passenger john = new Passenger(id:1, name: "Jhon Smith");
        jhon.setAirport(airport);
        Passenger mike = new Passenger(id:1, name: "Michael Jonhson");
        michael.setAirport(airport);
        airport.addPassenger(jhon);
        airport.addPassenger(michael);

        Ticket ticket1 = new Ticket(1, "AA1234");
        ticket1.setPassenger(jhon);

        Ticket ticket2 = new Ticket(1, "AA4444");
        ticket2.setPassenger(Michael);

        john.addTicket(ticket1);
        mike.addTicket(ticket2);


        em.getTransaction().commit();
        em.Close();

    }
}
