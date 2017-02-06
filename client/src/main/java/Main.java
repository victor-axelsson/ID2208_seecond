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

    public static void main(String[] args){

        //Create service ports
        Authentication_Service service = new Authentication_Service();
        Authentication authPort = service.getAuthenticationPort();

        ItineraryService itineraryService = new ItineraryService();
        Itinerary itineraryPort =  itineraryService.getItineraryPort();

        //Add client handlers
        Binding binding = ((BindingProvider)authPort).getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new LoggingHandler());
        binding.setHandlerChain(handlerList);


        //Call functions
        String res = authPort.login("victor@victor.com", "abc123");
        authPort.testingHeaders(new TestingHeaders(), "abc123123");


        List<Route> routes =  itineraryPort.getAvailableItineraries("ASF", "KZN");

        String res2 = routes.get(0).toString();


        System.out.println();


        System.out.println("I got the res: " + res);
    }
}
