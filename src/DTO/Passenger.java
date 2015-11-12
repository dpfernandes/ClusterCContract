package DTO;

public class Passenger extends Person {
    Boolean isNative;
    
    public Passenger(String firstName, String lastName, String CPR, Boolean isNative) {
        super(firstName, lastName, CPR);
        this.isNative = isNative;
    }
    
}
