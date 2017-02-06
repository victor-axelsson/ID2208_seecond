package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.models.Booking;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class BookTicket {
    FlightDatabase db;

    public BookTicket() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Booking bookTicket(int flightId, String creditCard){

        //TODO check available places on flight by id
        Booking booking = new Booking();
        booking.setCardNumber(creditCard);
        booking.setFlightId(flightId);
        //TODO save booking
        return booking;
    }
}
