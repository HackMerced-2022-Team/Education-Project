package education.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//jdbc

@Controller
public class QuizController {
    
    @GetMapping("/quiz")
    public String quiz() {
        return "quiz";
    }
}
