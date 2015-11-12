package DTO;

public class FerryDTO {

    int id;
    String name;
    Boolean borrowed;
    Boolean underMaintenance;
    FerryConfig ferryConfig;

    public FerryDTO(int id, String name, Boolean borrowed, Boolean underMaintenance, FerryConfig ferryConfig) {
        this.id = id;
        this.name = name;
        this.borrowed = borrowed;
        this.underMaintenance = underMaintenance;
        this.ferryConfig = ferryConfig;
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

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Boolean getUnderMaintenance() {
        return underMaintenance;
    }

    public void setUnderMaintenance(Boolean underMaintenance) {
        this.underMaintenance = underMaintenance;
    }

    public FerryConfig getFerryConfig() {
        return ferryConfig;
    }

    public void setFerryConfig(FerryConfig ferryConfig) {
        this.ferryConfig = ferryConfig;
    }
    
    
    
    
}
