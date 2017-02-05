package se.kth.webservice.second.service;

import javax.xml.namespace.QName;
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
