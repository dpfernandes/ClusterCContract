package DTO;

public class RouteDTO {
    HarborDTO DestinationHarbor;
    HarborDTO DepartureHarbor;

    public RouteDTO(HarborDTO DestinationHarbor, HarborDTO DepartureHarbor) {
        this.DestinationHarbor = DestinationHarbor;
        this.DepartureHarbor = DepartureHarbor;
    }

    public HarborDTO getDestinationHarbor() {
        return DestinationHarbor;
    }

    public void setDestinationHarbor(HarborDTO DestinationHarbor) {
        this.DestinationHarbor = DestinationHarbor;
    }

    public HarborDTO getDepartureHarbor() {
        return DepartureHarbor;
    }

    public void setDepartureHarbor(HarborDTO DepartureHarbor) {
        this.DepartureHarbor = DepartureHarbor;
    }
    
    
    
}
