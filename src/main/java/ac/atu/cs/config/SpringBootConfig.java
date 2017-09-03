package ac.atu.cs.config;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Endpoint;

@Controller
@EnableAutoConfiguration
public class SpringBootConfig {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
        Endpoint.publish("http://localhost:8081/ws/hello",
                new HelloWorldImp());
    }

    @RequestMapping("/")
    public String getHome() {
        System.out.println("ssssss");
        return "index";
    }
}