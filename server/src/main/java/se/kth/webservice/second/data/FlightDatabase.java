package se.kth.webservice.second.data;

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
}
