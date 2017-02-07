package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class IssueTicket implements IssueTicketInterface {
    FlightDatabase db;
    private static final int PRICE_MULTIPLIER = 1000;

    public IssueTicket() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Ticket issueTicket(int bookingId){
        db.issueTicket(bookingId);

        se.kth.webservice.second.models.Booking booking = db.getBookingById(bookingId);
        se.kth.webservice.second.models.Departure departure = db.getDepartureById(booking.getDepartureId());
        se.kth.webservice.second.models.Route route = db.getRouteById(departure.getRouteId());
        int bookingCount = db.getBookingCount(departure.getId());
        se.kth.webservice.second.models.Airline airline = db.getAirlineById(route.getAirlineId());

        se.kth.webservice.second.models.Ticket ticket = new se.kth.webservice.second.models.Ticket();
        ticket.setBooking(booking);
        ticket.setDeparture(departure);
        ticket.setRoute(route);
        ticket.setPrice(bookingCount * PRICE_MULTIPLIER);
        ticket.setAirline(airline);


        Ticket ticket1 = new Ticket();

        se.kth.webservice.second.service.Booking booking1 = new se.kth.webservice.second.service.Booking();
        booking1.setId(ticket.getBooking().getId());
        booking1.setCardNumber(ticket.getBooking().getCardNumber());
        booking1.setDepartureId(ticket.getBooking().getDepartureId());
        booking1.setIssued(true);

        se.kth.webservice.second.service.Departure departure1 = new  se.kth.webservice.second.service.Departure();
        departure1.setId(departure.getId());
        departure1.setRouteId(departure.getRouteId());
        departure1.setLands(departure.getLands());
        departure1.setLifts(departure.getLifts());

        se.kth.webservice.second.service.Route route1 = new se.kth.webservice.second.service.Route();
        route1.setId(route.getId());
        route1.setAirline(route.getAirline());
        route1.setAirlineId(route.getAirlineId());
        route1.setDestinationAirport(route.getDestinationAirport());
        route1.setDestinationAirportId(route.getDestinationAirportId());
        route1.setCodeshare(route.getCodeshare());
        route1.setSourceAirport(route.getSourceAirport());
        route1.setSourceAirportId(route.getSourceAirportId());
        route1.setEquipment(route.getEquipment());
        route1.setStops(route.getStops());

        Airline airline1 = new Airline();
        airline1.setId(airline.getId());
        airline1.setActive(airline.getActive());
        airline1.setAlias(airline.getAlias());
        airline1.setCallsign(airline.getCallsign());
        airline1.setCountry(airline.getCountry());
        airline1.setIata(airline.getIata());
        airline1.setIcao(airline.getIcao());
        airline1.setName(airline.getName());

        ticket1.setId(ticket.getId());
        ticket1.setPrice(ticket.getPrice());
        ticket1.setRoute(route1);
        ticket1.setDeparture(departure1);
        ticket1.setBooking(booking1);
        ticket1.setAirline(airline1);
        return ticket1;
    }
}