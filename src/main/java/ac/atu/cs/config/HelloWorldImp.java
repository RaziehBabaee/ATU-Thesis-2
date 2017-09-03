package ac.atu.cs.config;

import javax.jws.WebService;

/**
 * Created by Z E E N E O on 8/29/2017.
 */
@WebService(endpointInterface = "ac.atu.cs.config.HelloWorld")
public class HelloWorldImp implements HelloWorld{
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
