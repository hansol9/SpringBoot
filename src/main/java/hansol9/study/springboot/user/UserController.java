package hansol9.study.springboot.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    //    public @ResponseBody String hello() {

    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }
}
