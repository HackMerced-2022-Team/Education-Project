
package education.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LessonController {
    @GetMapping("/lesson")
    public String lesson() {
        return "lesson";
    }
}