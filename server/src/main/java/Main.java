

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.service.Authentication;
import se.kth.webservice.second.service.Itinerary;

import javax.xml.ws.Endpoint;

/**
 * Created by victoraxelsson on 2017-02-03.
 */
public class Main {

    public static void main(String[] args){
        Authentication auth = new Authentication();
        Itinerary itin = new Itinerary();

        Endpoint.publish("http://localhost:9091/authentication", auth);
        Endpoint.publish("http://localhost:9091/itinerary", itin);

        //FlightDatabase db = new FlightDatabase();
        //db.mockSomeTickets();

        System.out.println("done");
    }
}
