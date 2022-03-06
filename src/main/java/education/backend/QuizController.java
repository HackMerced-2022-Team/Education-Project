package education.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController {
    
    @GetMapping
    public String quiz() {
        return "quiz";
    }

    @PostMapping
    public String handleQuizSubmit() {
        // grade the quiz the user submitted

        return "redirect:/quizResults";
    }

}
