package se.kth.webservice.second.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
@WebService(serviceName = "Authentication", portName = "AuthenticationPort")
@HandlerChain(file= "handler-chain.xml")
public class AuthenticationImpl implements se.kth.webservice.second.service.Authentication {

    private Map<String, String> users;
    private SecureRandom random;

    public AuthenticationImpl(){
        users = new HashMap<String, String>();
        users.put("victor@victor.com", "abc123");
        users.put("nick@nick.com", "abc123");
        random = new SecureRandom();
    }

    private String createToken() {
        return new BigInteger(130, random).toString(32);
    }

    public String login(String username, String password){

        System.out.println("asdjknasdkjnasdkjnasdkj");

        if(users.containsKey(username) && users.containsValue(password)){
            return createToken();
        }else{
            return "No game dude";
        }
    }

    public TestingHeadersResponse testingHeaders(TestingHeaders parameters, String token) {
        System.out.println("I got the token: " + token);
        return null;
    }

}
