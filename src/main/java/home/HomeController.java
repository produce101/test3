package home;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }


    @RequestMapping("/test2")
    public String test2() {
        return "test2";
    }
}
