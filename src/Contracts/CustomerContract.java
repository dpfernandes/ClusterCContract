package Contracts;

import DTO.*;

import java.util.List;

public interface CustomerContract {
    
    public List<FerryDTO> GetListOfFerries();
    
    public List<HarborDTO> GetListOfHarbors();
    
    public List<RouteDTO> GetListOfRoutes();
    
    public List<DepartureDTO> GetListOfDepartures();
    
    public Boolean CreateCustomer(CustomerDTO customer);
    public Boolean SaveCustomer(CustomerDTO customer);
    public CustomerDTO GetCustomerById(int id);
    
    public Boolean CreateReservation(ReservationDTO reservation);
    public Boolean SaveReservation(ReservationDTO reservatoion);
    public Boolean RemoveReservation(ReservationDTO reservation);
    public List<ReservationDTO> GetListOfReservations(ReservationDTO reservation);
    
}
