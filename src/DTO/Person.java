package DTO;

public class Person {
    String firstName;
    String lastName;
    String CPR;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public Person(String firstName, String lastName, String CPR) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CPR = CPR;
    }
    
}
