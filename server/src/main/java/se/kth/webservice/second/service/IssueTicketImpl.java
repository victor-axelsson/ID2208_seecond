package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class IssueTicketImpl implements IssueTicket {
    FlightDatabase db;

    public IssueTicketImpl() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Ticket issueTicket(int bookingId){
        Ticket ticket = new Ticket();
        ticket.setBookingId(bookingId);
        try {
            if (db.issueTicket(bookingId)) {
                return ticket;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}