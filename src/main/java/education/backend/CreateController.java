package education.backend;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import education.backend.Lesson;


@Controller
@RequestMapping("/create")
public class CreateController {

    public static final int NUM_QUIZ_QUESTIONS = 5;


    @GetMapping
    public String create(Model model) {
        model.addAttribute("lesson", new Lesson());
        model.addAttribute(NUM_QUIZ_QUESTIONS);
        return "create";
    }

    @PostMapping
    public String handleCreate(Lesson lesson) {

        ArrayList<String> lessonQuizQuestions = new ArrayList<String>();
        ArrayList<String> lessonQuizAnswers = new ArrayList<String>();

        lessonQuizQuestions.addAll(lesson.getQuizQuestions());
        lessonQuizAnswers.addAll(lesson.getQuizAnswers());

        return "lessonCreatedConfirmation";
    }
}
