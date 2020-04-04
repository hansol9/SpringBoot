package hansol9.study.springboot.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService sampleServie;

    @GetMapping("/SampleHello")
    public String hello() {
        logger.info("holoman");
        System.out.println("skip");
        return "hello " + sampleServie.getName();
    }
 }
