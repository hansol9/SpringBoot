package hansol9.study.springboot.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleServie;

    @GetMapping("/hello")
    public String hello() {
        return "hello " + sampleServie.getName();
    }
 }
