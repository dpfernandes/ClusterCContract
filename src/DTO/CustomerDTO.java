package DTO;

public class CustomerDTO extends Person {
    
    String email;
    String password;
    int id;
    
    public CustomerDTO(String email, String password, int id, String firstName, String lastName, String CPR) {
        super(firstName, lastName, CPR);
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
