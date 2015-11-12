package DTO;

public class Passenger extends Person {
    Boolean isNative;
    
    public Passenger(String firstName, String lastName, String CPR, Boolean isNative) {
        super(firstName, lastName, CPR);
        this.isNative = isNative;
    }

    public Boolean getIsNative() {
        return isNative;
    }

    public void setIsNative(Boolean isNative) {
        this.isNative = isNative;
    }
    
    
}
