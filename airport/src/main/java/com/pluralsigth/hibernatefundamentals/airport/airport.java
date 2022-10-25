package com.pluralsigth.hibernatefundamentals.airport;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "AIRPORTS")
@Acess(AcessType.FIELD)
public class airport {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "AIRPORT_ID")
    private Airport airport;


    @OneToMany(mappedBy = "airport")
    private List<Passenger> passengers = new ArrayList<>();


    public airport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Airport(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Passenger> getPassengers(){
        return Collections.unmodifiableList(passengers);

    }

    public void addPassengers(Passenger passengers) {
        passengers.add(passenger);
    }
}
