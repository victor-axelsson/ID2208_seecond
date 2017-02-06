
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
    private final static QName _GetAvailableItineraries_QNAME = new QName("http://service.second.webservice.kth.se/", "getAvailableItineraries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.webservice.second.service
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableItineraries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "getAvailableItineraries")
    public JAXBElement<GetAvailableItineraries> createGetAvailableItineraries(GetAvailableItineraries value) {
        return new JAXBElement<GetAvailableItineraries>(_GetAvailableItineraries_QNAME, GetAvailableItineraries.class, null, value);
    }

}
