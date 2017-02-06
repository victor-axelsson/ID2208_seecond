
package se.kth.webservice.second.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.kth.webservice.second.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookTicket_QNAME = new QName("http://service.second.webservice.kth.se/", "bookTicket");
    private final static QName _BookTicketResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "bookTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.webservice.second.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookTicket_Type }
     * 
     */
    public BookTicket_Type createBookTicket_Type() {
        return new BookTicket_Type();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "bookTicket")
    public JAXBElement<BookTicket_Type> createBookTicket(BookTicket_Type value) {
        return new JAXBElement<BookTicket_Type>(_BookTicket_QNAME, BookTicket_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

}
