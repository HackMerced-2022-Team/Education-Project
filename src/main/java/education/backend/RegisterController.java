package education.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String addUser(User user) {
        // if (result.hasErrors()) {
        // return "errors/registerUser"; NEED TO FIGURE OUT WHAT TO DO HERE
        // }
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);

        return "registersuccess";
    }

    @GetMapping("/")
    public String listUsers(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);
        return "home";
    }

}

// this whole registration form function uses a combintation of code between
// these websites
// https://www.baeldung.com/spring-thymeleaf-error-messages
// https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial
// https://spring.io/guides/gs/securing-web/
// https://stackoverflow.com/questions/53743806/error-during-execution-of-processor-org-thymeleaf-spring5-processor-springinput
// https://www.baeldung.com/java-bean-validation-not-null-empty-blank
// https://mkyong.com/spring-mvc/spring-mvc-form-handling-example/
