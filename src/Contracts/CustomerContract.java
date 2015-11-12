package Contracts;

import DTO.*;
import ETO.CustomerETO;
import ETO.DepartureETO;
import ETO.FerryETO;
import ETO.HarborETO;
import ETO.ReservationETO;
import ETO.RouteETO;

import java.util.List;

public interface CustomerContract {
    
    public List<FerryDTO> GetListOfFerries() throws FerryETO;
    
    public List<HarborDTO> GetListOfHarbors() throws HarborETO;
    
    public List<RouteDTO> GetListOfRoutes() throws RouteETO;
    
    public List<DepartureDTO> GetListOfDepartures() throws DepartureETO;
    
    public Boolean CreateCustomer(CustomerDTO customer) throws CustomerETO;
    public Boolean SaveCustomer(CustomerDTO customer) throws CustomerETO;
    public CustomerDTO GetCustomerById(int id) throws CustomerETO;
    
    public Boolean CreateReservation(ReservationDTO reservation) throws ReservationETO;
    public Boolean SaveReservation(ReservationDTO reservatoion) throws ReservationETO;
    public Boolean RemoveReservation(ReservationDTO reservation) throws ReservationETO;
    public List<ReservationDTO> GetListOfReservations(ReservationDTO reservation) throws ReservationETO;
    
}
