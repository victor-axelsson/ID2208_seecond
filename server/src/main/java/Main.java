

import se.kth.webservice.second.service.*;
import se.kth.webservice.second.service.IssueTicketInterface;

import javax.xml.ws.Endpoint;

/**
 * Created by victoraxelsson on 2017-02-03.
 */
public class Main {

    public static void main(String[] args){
        AuthenticationImpl auth = new AuthenticationImpl();
        Itinerary itin = new Itinerary();
        BookTicket bookings = new BookTicket();
        IssueTicketInterface tickets = new IssueTicket();

        Endpoint.publish("http://localhost:9091/authentication", auth);
        Endpoint.publish("http://localhost:9091/itinerary", itin);
        Endpoint.publish("http://localhost:9091/bookings", bookings);
        Endpoint.publish("http://localhost:9091/tickets", tickets);

        //FlightDatabase db = new FlightDatabase();
        //db.mockSomeTickets();

        System.out.println("done");
    }
}
