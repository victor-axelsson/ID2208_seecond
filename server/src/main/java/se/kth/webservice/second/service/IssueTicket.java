package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.models.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class IssueTicket {
    FlightDatabase db;

    public IssueTicket() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Ticket issueTicket(int bookingId){
        //TODO check that the booking exists through db
        Ticket ticket = new Ticket();
        ticket.setBookingId(bookingId);
        //TODO delete booking
        return ticket;
    }
}