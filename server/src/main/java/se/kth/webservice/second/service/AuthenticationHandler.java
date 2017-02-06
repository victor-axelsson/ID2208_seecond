package se.kth.webservice.second.service;

import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
public class AuthenticationHandler implements SOAPHandler<SOAPMessageContext> {
    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext context) {
        try {
            SOAPBody body = context.getMessage().getSOAPBody();
            NodeList elementsByTagName = body.getElementsByTagName("return");
            if (elementsByTagName.getLength() > 0) {
                String token = elementsByTagName.item(0).getTextContent();
                SOAPHeader header = context.getMessage().getSOAPHeader();
                QName headerName = new QName("http://service.second.webservice.kth.se/","token");
                SOAPHeaderElement headerElement = header.addHeaderElement(headerName);
                QName name = new QName("http://service.second.webservice.kth.se/","token");
                SOAPElement symbol= headerElement.addChildElement(name);
                symbol.addTextNode(token);
            }

        } catch (SOAPException e) {
            e.printStackTrace();
        }


        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        if(true)
            throw new RuntimeException("Something somthing 2...");

        return false;
    }

    public void close(MessageContext context) {

    }
}
