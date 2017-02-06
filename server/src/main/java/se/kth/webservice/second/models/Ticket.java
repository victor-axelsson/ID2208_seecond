package se.kth.webservice.second.models;

/**
 * Created by Nick on 2/6/2017.
 */
public class Ticket {
    private int id;
    private int bookingId;

    public Ticket() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != ticket.id) return false;
        return bookingId == ticket.bookingId;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + bookingId;
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", bookingId=" + bookingId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
