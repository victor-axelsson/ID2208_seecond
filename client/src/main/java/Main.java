import client.LoggingHandler;
import se.kth.webservice.second.service.Authentication;
import se.kth.webservice.second.service.Authentication_Service;
import se.kth.webservice.second.service.TestingHeaders;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceContext;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import java.util.List;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
public class Main {

    @Resource
    private static WebServiceContext context;

    public static void main(String[] args){
        Authentication_Service service = new Authentication_Service();
        Authentication port = service.getAuthenticationPort();

        //Add client handlers
        Binding binding = ((BindingProvider)port).getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new LoggingHandler());
        binding.setHandlerChain(handlerList);


        //Call functions
        String res = port.login("victor@victor.com", "abc123");
        port.testingHeaders(new TestingHeaders(), "abc123123");




        System.out.println("I got the res: " + res);
    }
}
