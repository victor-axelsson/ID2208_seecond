
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

    private final static QName _GetAvailableItinerariesResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "getAvailableItinerariesResponse");
    private final static QName _GetAirlineById_QNAME = new QName("http://service.second.webservice.kth.se/", "getAirlineById");
    private final static QName _GetAvailableItineraries_QNAME = new QName("http://service.second.webservice.kth.se/", "getAvailableItineraries");
    private final static QName _GetAirportById_QNAME = new QName("http://service.second.webservice.kth.se/", "getAirportById");
    private final static QName _GetAirportByIdResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "getAirportByIdResponse");
    private final static QName _GetAirlineByIdResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "getAirlineByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.webservice.second.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAirlineById }
     * 
     */
    public GetAirlineById createGetAirlineById() {
        return new GetAirlineById();
    }

    /**
     * Create an instance of {@link GetAvailableItineraries }
     * 
     */
    public GetAvailableItineraries createGetAvailableItineraries() {
        return new GetAvailableItineraries();
    }

    /**
     * Create an instance of {@link GetAvailableItinerariesResponse }
     * 
     */
    public GetAvailableItinerariesResponse createGetAvailableItinerariesResponse() {
        return new GetAvailableItinerariesResponse();
    }

    /**
     * Create an instance of {@link GetAirlineByIdResponse }
     * 
     */
    public GetAirlineByIdResponse createGetAirlineByIdResponse() {
        return new GetAirlineByIdResponse();
    }

    /**
     * Create an instance of {@link GetAirportByIdResponse }
     * 
     */
    public GetAirportByIdResponse createGetAirportByIdResponse() {
        return new GetAirportByIdResponse();
    }

    /**
     * Create an instance of {@link GetAirportById }
     * 
     */
    public GetAirportById createGetAirportById() {
        return new GetAirportById();
    }

    /**
     * Create an instance of {@link TravelPath }
     * 
     */
    public TravelPath createTravelPath() {
        return new TravelPath();
    }

    /**
     * Create an instance of {@link Airline }
     * 
     */
    public Airline createAirline() {
        return new Airline();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableItinerariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAvailableItinerariesResponse")
    public JAXBElement<GetAvailableItinerariesResponse> createGetAvailableItinerariesResponse(GetAvailableItinerariesResponse value) {
        return new JAXBElement<GetAvailableItinerariesResponse>(_GetAvailableItinerariesResponse_QNAME, GetAvailableItinerariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirlineById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAirlineById")
    public JAXBElement<GetAirlineById> createGetAirlineById(GetAirlineById value) {
        return new JAXBElement<GetAirlineById>(_GetAirlineById_QNAME, GetAirlineById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableItineraries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAvailableItineraries")
    public JAXBElement<GetAvailableItineraries> createGetAvailableItineraries(GetAvailableItineraries value) {
        return new JAXBElement<GetAvailableItineraries>(_GetAvailableItineraries_QNAME, GetAvailableItineraries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAirportById")
    public JAXBElement<GetAirportById> createGetAirportById(GetAirportById value) {
        return new JAXBElement<GetAirportById>(_GetAirportById_QNAME, GetAirportById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAirportByIdResponse")
    public JAXBElement<GetAirportByIdResponse> createGetAirportByIdResponse(GetAirportByIdResponse value) {
        return new JAXBElement<GetAirportByIdResponse>(_GetAirportByIdResponse_QNAME, GetAirportByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirlineByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAirlineByIdResponse")
    public JAXBElement<GetAirlineByIdResponse> createGetAirlineByIdResponse(GetAirlineByIdResponse value) {
        return new JAXBElement<GetAirlineByIdResponse>(_GetAirlineByIdResponse_QNAME, GetAirlineByIdResponse.class, null, value);
    }

}
