package se.kth.webservice.second.service;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
@WebService
@HandlerChain(file= "handler-chain.xml")
public class AuthenticationService {


    private Map<String, String> users;
    private SecureRandom random;

    public AuthenticationService(){
        users = new HashMap<String, String>();
        users.put("victor@victor.com", "abc123");
        users.put("nick@nick.com", "abc123");
        random = new SecureRandom();
    }

    private String createToken() {
        return new BigInteger(130, random).toString(32);
    }

    @WebMethod
    public String login(String username, String password){

        System.out.println("asdjknasdkjnasdkjnasdkj");

        if(users.containsKey(username) && users.containsValue(password)){
            return createToken();
        }else{
            return "No game dude";
        }
    }

}
