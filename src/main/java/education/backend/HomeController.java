// package education.backend;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// // @ prefix => Java annotation
// @Controller
// public class HomeController {

// // route
// @GetMapping("/")
// public String home(@RequestParam(name = "name", required = false,
// defaultValue = "World") String name,
// Model model) {
// model.addAttribute("name", name);
// return "home";
// }
// }
// package education.backend;

// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.beans.factory.annotation.Autowired;

// @Controller
// public class HomeController {
// @Autowired
// private LessonInformationRepository lessonRepository;

// @GetMapping("/home")
// public String listLessonInfo(Model model) {
// List<LessonInformation> listLessonInfo = lessonRepository.findAll();
// model.addAttribute("listLessonInfo", listLessonInfo);
// return "home";
// }
// }
