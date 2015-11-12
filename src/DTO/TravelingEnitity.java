package DTO;

import java.util.List;

public class TravelingEnitity {
    List<Passenger> passengers;
    List<Vehicle> vehicles;
    int price;

    public TravelingEnitity(List<Passenger> passengers, List<Vehicle> vehicles, int price) {
        this.passengers = passengers;
        this.vehicles = vehicles;
        this.price = price;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
