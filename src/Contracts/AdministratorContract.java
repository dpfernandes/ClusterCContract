package Contracts;

import DTO.*;
import ETO.CustomerETO;
import ETO.DepartureETO;
import ETO.FerryETO;
import ETO.HarborETO;
import ETO.ReservationETO;
import ETO.RouteETO;
import java.util.List;

public interface AdministratorContract {    
    
    
    public Boolean CreateFerry(FerryDTO ferry) throws FerryETO;
    public Boolean SaveFerry(FerryDTO ferry) throws FerryETO;
    public List<FerryDTO> GetListOfFerries() throws FerryETO;
    
    public Boolean CreateHarbor(HarborDTO harbor) throws HarborETO;
    public Boolean SaveHarbor(HarborDTO harbor) throws HarborETO;
    public List<HarborDTO> GetListOfHarbors() throws HarborETO;
    
    public Boolean CreateRoute(RouteDTO route) throws RouteETO;
    public Boolean SaveRoute(RouteDTO route) throws RouteETO;
    public Boolean RemoveRoute(RouteDTO route) throws RouteETO;
    public List<RouteDTO> GetListOfRoutes() throws RouteETO;
    
    public Boolean CreateDeparture(DepartureDTO departure) throws DepartureETO;
    public Boolean SaveDeparture(DepartureDTO departure) throws DepartureETO;
    public Boolean RemoveDeparture(DepartureDTO departure)throws DepartureETO;
    public List<DepartureDTO> GetListOfDepartures() throws DepartureETO;
    
    public Boolean CreateCustomer(CustomerDTO customer) throws CustomerETO;
    public Boolean SaveCustomer(CustomerDTO customer) throws CustomerETO;
    public CustomerDTO GetCustomerById(int id) throws CustomerETO;
    public List<CustomerDTO> GetListOfCustomers() throws CustomerETO;
    
    public Boolean CreateReservation(ReservationDTO reservation) throws ReservationETO;
    public Boolean EditReservation(ReservationDTO reservatoion) throws ReservationETO;
    public Boolean RemoveReservation(ReservationDTO reservation) throws ReservationETO;
    public List<ReservationDTO> GetListOfReservations(ReservationDTO reservation) throws ReservationETO;
    
}
