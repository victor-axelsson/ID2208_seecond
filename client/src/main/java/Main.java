import se.kth.webservice.second.service.Authentication;
import se.kth.webservice.second.service.AuthenticationService;
import se.kth.webservice.second.service.Login;
import se.kth.webservice.second.service.ObjectFactory;

/**
 * Created by victoraxelsson on 2017-02-05.
 */
public class Main {

    public static void main(String[] args){

        AuthenticationService service = new AuthenticationService();
        String res = service.getAuthenticationPort().login("victor@victor.com", "abc123");

        System.out.println("I got the res: " + res);
    }
}
