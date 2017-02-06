package se.kth.webservice.second.models;

/**
 * Created by Nick on 2/6/2017.
 */
public class Booking {
    private int id;
    private int flightId;
    private String cardNumber;

    public Booking() {
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", flightId=" + flightId +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (id != booking.id) return false;
        if (flightId != booking.flightId) return false;
        return (cardNumber != null ? !cardNumber.equals(booking.cardNumber) : booking.cardNumber != null);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + flightId;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        return result;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
