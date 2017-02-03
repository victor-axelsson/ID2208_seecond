package se.kth.webservice.second;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by victoraxelsson on 2017-02-03.
 */
@WebService
public class Hello {

    @WebMethod
    public String sayHello(String name){
        return "Well, hello there " + name;
    }
}
