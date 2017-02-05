import se.kth.webservice.second.service.Authentication;

import javax.xml.ws.Endpoint;

/**
 * Created by victoraxelsson on 2017-02-03.
 */
public class Main {

    public static void main(String[] args){
        Endpoint.publish("http://localhost:9091/authentication", new Authentication());
        System.out.println("hello");
    }
}
