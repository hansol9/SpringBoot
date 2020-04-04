package hansol9.study.springboot.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleControllerWithThymeleaf {

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name", "hansol");
        return "hello";
    }
}
