
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

    private final static QName _LoginResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "loginResponse");
    private final static QName _Token_QNAME = new QName("http://service.second.webservice.kth.se/", "token");
    private final static QName _Login_QNAME = new QName("http://service.second.webservice.kth.se/", "login");
    private final static QName _TestingHeadersResponse_QNAME = new QName("http://service.second.webservice.kth.se/", "testingHeadersResponse");
    private final static QName _TestingHeaders_QNAME = new QName("http://service.second.webservice.kth.se/", "testingHeaders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.kth.webservice.second.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link TestingHeaders }
     * 
     */
    public TestingHeaders createTestingHeaders() {
        return new TestingHeaders();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link TestingHeadersResponse }
     * 
     */
    public TestingHeadersResponse createTestingHeadersResponse() {
        return new TestingHeadersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestingHeadersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "testingHeadersResponse")
    public JAXBElement<TestingHeadersResponse> createTestingHeadersResponse(TestingHeadersResponse value) {
        return new JAXBElement<TestingHeadersResponse>(_TestingHeadersResponse_QNAME, TestingHeadersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestingHeaders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.second.webservice.kth.se/", name = "testingHeaders")
    public JAXBElement<TestingHeaders> createTestingHeaders(TestingHeaders value) {
        return new JAXBElement<TestingHeaders>(_TestingHeaders_QNAME, TestingHeaders.class, null, value);
    }

}
