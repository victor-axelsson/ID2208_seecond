package se.kth.webservice.second.data;

import se.kth.webservice.second.models.Airline;
import se.kth.webservice.second.models.Airport;
import se.kth.webservice.second.models.Route;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by victoraxelsson on 2017-02-06.
 */
public class FlightDatabase extends Database {

    /**
     * @param from The source_airport three digit code
     * @param to The destination_airport three digit code
     *
    * */
    public List<Route> getRoute(String from, String to) {
        List<Route> routes = new ArrayList<Route>();

        try {
            PreparedStatement prepared = getPreparedStatement("select * from routes where source_airport = ? and destination_airport = ?");
            prepared.setString(1, from);
            prepared.setString(2, to);

            ResultSet rs = prepared.executeQuery();
            while(rs.next()){
                Route r = new Route();
                r.setAirline(rs.getString(1));
                r.setAirlineId(rs.getInt(2));
                r.setSourceAirport(rs.getString(3));
                r.setSourceAirportId(rs.getInt(4));
                r.setDestinationAirport(rs.getString(5));
                r.setDestinationAirportId(rs.getInt(6));
                r.setCodeshare(rs.getString(7));
                r.setStops(rs.getInt(8));
                r.setEquipment(rs.getString(9));
                routes.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            safeCloseConnection();
        }

        return routes;
    }

    /**
     * @param id The primary key id of the airport
     *
     * */
    public Airport getAirportById(int id){
        Airport airport = null;

        try {
            PreparedStatement prepared = getPreparedStatement("select * from airports where id = ?");
            prepared.setInt(1, id);

            ResultSet rs = prepared.executeQuery();
            while(rs.next()){
               airport = new Airport();
               airport.setId(rs.getInt(1));
               airport.setName(rs.getString(2));
               airport.setCity(rs.getString(3));
               airport.setCountry(rs.getString(4));
               airport.setIata(rs.getString(5));
               airport.setIcao(rs.getString(6));
               airport.setLat(rs.getFloat(7));
               airport.setLng(rs.getFloat(8));
               airport.setAltitudeFeet(rs.getInt(9));
               airport.setTimezone(rs.getString(10));
               airport.setDst(rs.getString(11));
               airport.setTzDb(rs.getString(12));
               airport.setType(rs.getString(13));
               airport.setSource(rs.getString(14));

               break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            safeCloseConnection();
        }

        return airport;
    }

    public Airline getAirlineById(int id){
        Airline airline = null;

        try {
            PreparedStatement prepared = getPreparedStatement("select * from airlines where id = ?");
            prepared.setInt(1, id);

            ResultSet rs = prepared.executeQuery();
            while(rs.next()){
                airline = new Airline();
                airline.setId(rs.getInt(1));
                airline.setName(rs.getString(2));
                airline.setAlias(rs.getString(3));
                airline.setIata(rs.getString(4));
                airline.setIcao(rs.getString(5));
                airline.setCallsign(rs.getString(6));
                airline.setCountry(rs.getString(7));
                airline.setActive(rs.getString(8));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            safeCloseConnection();
        }

        return airline;
    }
}
