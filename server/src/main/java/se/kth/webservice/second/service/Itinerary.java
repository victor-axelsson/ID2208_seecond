package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.data.NeoDB;
import se.kth.webservice.second.models.Airline;
import se.kth.webservice.second.models.Airport;
import se.kth.webservice.second.models.Route;
import se.kth.webservice.second.models.TravelPath;

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
    NeoDB neoDB;

    public Itinerary(){
        db = new FlightDatabase();
        neoDB = new NeoDB();
    }

    @WebMethod
    public List<TravelPath> getAvailableItineraries(String from, String to){
        return neoDB.getRoutes();
    }

    @WebMethod
    public Airport getAirportById(int id){
        return db.getAirportById(id);
    }

    @WebMethod
    public Airline getAirlineById(int id){
        return db.getAirlineById(id);
    }
}
