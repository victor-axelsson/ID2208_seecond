import client.LoggingHandler;
import se.kth.webservice.second.service.*;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceContext;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import java.util.List;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
public class Main {

    @Resource
    private static WebServiceContext context;

    private static void addLogger(BindingProvider bindingProvider){
        Binding binding = bindingProvider.getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new LoggingHandler());
        binding.setHandlerChain(handlerList);
    }

    public static void main(String[] args){

        //Create service ports
        Authentication_Service service = new Authentication_Service();
        Authentication authPort = service.getAuthenticationPort();

        ItineraryService itineraryService = new ItineraryService();
        Itinerary itineraryPort =  itineraryService.getItineraryPort();

        BookTicketService bookingService = new BookTicketService();
        BookTicket bookingPort = bookingService.getBookTicketPort();

        IssueTicketService ticketService = new IssueTicketService();
        IssueTicket ticketPort = ticketService.getIssueTicketPort();


        //Add all logging of messages
        addLogger((BindingProvider)authPort);
        addLogger((BindingProvider)itineraryPort);
        addLogger((BindingProvider)bookingPort);
        addLogger((BindingProvider)ticketPort);

        /*
        //Add client handlers
        Binding binding = ((BindingProvider)authPort).getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new LoggingHandler());
        binding.setHandlerChain(handlerList);
        */


        // Call functions //

        // Task 1
        String res = authPort.login("victor@victor.com", "abc123");
        authPort.testingHeaders(new TestingHeaders(), "abc123123");
        
        // Task 2
        List<TravelPath> paths = itineraryPort.getAvailableItineraries("12", "55");


        //Task 3 and 4
        String routeId =  paths.get(0).getRouteId();
        List<Departure> departures = itineraryPort.getDeparturesFromRoute(Integer.parseInt(routeId));
        Availability availability = bookingPort.checkAvailability(departures.get(0).getId());

        //Task 5
        Booking booking = bookingPort.bookTicket(departures.get(0).getId(), "123123123123123123");

        //Task 6
        Ticket ticket = ticketPort.issueTicket(booking.getId());


        System.out.println("All done, life is good");
    }
}
