package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.models.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class IssueTicket {
    FlightDatabase db;
    private static final int PRICE_MULTIPLIER = 1000;

    public IssueTicket() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Ticket issueTicket(int bookingId){
        db.issueTicket(bookingId);

        Booking booking = db.getBookingById(bookingId);
        Departure departure = db.getDepartureById(booking.getDepartureId());
        Route route = db.getRouteById(departure.getRouteId());
        int bookingCount = db.getBookingCount(departure.getId());
        Airline airline = db.getAirlineById(route.getAirlineId());

        Ticket ticket = new Ticket();
        ticket.setBooking(booking);
        ticket.setDeparture(departure);
        ticket.setRoute(route);
        ticket.setPrice(bookingCount * PRICE_MULTIPLIER);
        ticket.setAirline(airline);

        return ticket;
    }
}