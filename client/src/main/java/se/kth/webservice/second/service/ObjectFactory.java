
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

    private final static QName _IssueTicket_QNAME = new QName("http://service.second.webservice.kth.se/", "issueTicket");
    private final static QName _IssueTicketResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "issueTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.webservice.second.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IssueTicket_Type }
     * 
     */
    public IssueTicket_Type createIssueTicket_Type() {
        return new IssueTicket_Type();
    }

    /**
     * Create an instance of {@link IssueTicketResponse }
     * 
     */
    public IssueTicketResponse createIssueTicketResponse() {
        return new IssueTicketResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueTicket_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "issueTicket")
    public JAXBElement<IssueTicket_Type> createIssueTicket(IssueTicket_Type value) {
        return new JAXBElement<IssueTicket_Type>(_IssueTicket_QNAME, IssueTicket_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "issueTicketResponse")
    public JAXBElement<IssueTicketResponse> createIssueTicketResponse(IssueTicketResponse value) {
        return new JAXBElement<IssueTicketResponse>(_IssueTicketResponse_QNAME, IssueTicketResponse.class, null, value);
    }

}
