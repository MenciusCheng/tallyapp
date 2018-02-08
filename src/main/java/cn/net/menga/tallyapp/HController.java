package cn.net.menga.tallyapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 2018/2/8.
 */
@RestController
public class HController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
