package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.data.NeoDB;
import se.kth.webservice.second.models.*;

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
    public List<TravelPath> getAvailableItineraries(String fromAirportId, String toAirportId){
        return neoDB.getRoutes(fromAirportId, toAirportId);
    }

    @WebMethod
    public Airport getAirportById(int id){
        return db.getAirportById(id);
    }

    @WebMethod
    public Airline getAirlineById(int id){
        return db.getAirlineById(id);
    }

    @WebMethod
    public List<Departure> getDeparturesFromRoute(int routeId){
        return db.getDeparturesFromRouteId(routeId);
    }



}
