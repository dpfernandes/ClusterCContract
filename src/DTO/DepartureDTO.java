package DTO;

public class DepartureDTO {

    FerryDTO ferry;
    RouteDTO route;

    public DepartureDTO(FerryDTO ferry, RouteDTO route) {
        this.ferry = ferry;
        this.route = route;
    }

    public FerryDTO getFerry() {
        return ferry;
    }

    public void setFerry(FerryDTO ferry) {
        this.ferry = ferry;
    }

    public RouteDTO getRoute() {
        return route;
    }

    public void setRoute(RouteDTO route) {
        this.route = route;
    }

}
