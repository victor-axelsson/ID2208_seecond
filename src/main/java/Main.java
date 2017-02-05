import se.kth.webservice.second.service.AuthenticationService;

import javax.xml.ws.Endpoint;

/**
 * Created by victoraxelsson on 2017-02-03.
 */
public class Main {


    public static void main(String[] args){

        Endpoint.publish("http://192.168.0.3:9091/authentication", new AuthenticationService());
        System.out.println("hello");
    }
}
