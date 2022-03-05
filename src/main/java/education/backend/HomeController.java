package education.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @ prefix => Java annotation
@Controller
public class HomeController {
    
    // route
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
