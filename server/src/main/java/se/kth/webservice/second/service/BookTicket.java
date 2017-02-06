package se.kth.webservice.second.service;

import se.kth.webservice.second.data.FlightDatabase;
import se.kth.webservice.second.models.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;

/**
 * Created by Nick on 2/6/2017.
 */
@WebService
public class BookTicket {
    FlightDatabase db;
    private static final int PRICE_MULTIPLIER = 1000;

    public BookTicket() {
        this.db = new FlightDatabase();
    }

    @WebMethod
    public Availability checkAvailability(int departureId){
        Departure departure = db.getDepartureById(departureId);
        int bookingCount = db.getBookingCount(departureId);

        Availability availability = new Availability();
        availability.setDeparture(departure);
        availability.setLabel("The departure is at: " + departure.getLifts() + " and lands at " + departure.getLands());

        if(bookingCount < 30){
            availability.setPrice(bookingCount * PRICE_MULTIPLIER);
            availability.setAvailable(true);
        }else{
            availability.setPrice(-1);
            availability.setAvailable(false);
        }

        return availability;
    }

    @WebMethod
    public Booking bookTicket(int flightId, String creditCard){

        Availability availability = checkAvailability(flightId);

        if(availability.isAvailable()){
            //TODO check available places on flight by id
            Booking booking = new Booking();
            booking.setCardNumber(creditCard);
            booking.setDepartureId(flightId);
            booking.setIssued(false);

            return db.saveBooking(booking);
        }

        //throw new SOAPException();
        return null;
    }

}
