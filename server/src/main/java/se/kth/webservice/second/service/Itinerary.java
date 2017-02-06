package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.models.Route;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Iterator;
import java.util.List;

/**
 * Created by victoraxelsson on 2017-02-06.
 */
@WebService
public class Itinerary {

    FlightDatabase db;

    public Itinerary(){
        db = new FlightDatabase();
    }


    @WebMethod
    public List<Route> getAvailableItineraries(String from, String to){
        return db.getRoute(from, to);
    }

}
