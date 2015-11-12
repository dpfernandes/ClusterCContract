package Contracts;

import DTO.*;
import java.util.List;

public interface AdministratorContract {    
    
    
    public Boolean CreateFerry(FerryDTO ferry);
    public Boolean SaveFerry(FerryDTO ferry);
    public List<FerryDTO> GetListOfFerries();
    
    public Boolean CreateHarbor(HarborDTO harbor);
    public Boolean SaveHarbor(HarborDTO harbor);
    public List<HarborDTO> GetListOfHarbors();
    
    public Boolean CreateRoute(RouteDTO route);
    public Boolean SaveRoute(RouteDTO route);
    public Boolean RemoveRoute(RouteDTO route);
    public List<RouteDTO> GetListOfRoutes();
    
    public Boolean CreateDeparture(DepartureDTO departure);
    public Boolean SaveDeparture(DepartureDTO departure);
    public Boolean RemoveDeparture(DepartureDTO departure);
    public List<DepartureDTO> GetListOfDepartures();
    
    public Boolean CreateCustomer(CustomerDTO customer);
    public Boolean SaveCustomer(CustomerDTO customer);
    public CustomerDTO GetCustomerById(int id);
    public List<CustomerDTO> GetListOfCustomers();
    
    public Boolean CreateReservation(ReservationDTO reservation);
    public Boolean EditReservation(ReservationDTO reservatoion);
    public Boolean RemoveReservation(ReservationDTO reservation);
    public List<ReservationDTO> GetListOfReservations(ReservationDTO reservation);
    
}
