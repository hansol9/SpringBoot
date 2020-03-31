package hansol9.study.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {

//    @Value("${holoman.name}")
//    private String name;
//
//    @Value("${holoman.age}")
//    private int age;
//
//    @Value("${holoman.fullName}")
//    private String fullName;

    private Logger logger = LoggerFactory.getLogger(ApplicationRunnerExample.class);

    @Autowired
    ExternalProperties properties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("===================================");
        logger.debug("Application Runner!!!");
        logger.debug("foo: " + args.containsOption("foo"));
        logger.debug("bar: " + args.containsOption("bar"));
        logger.debug("Properties: " + properties.getName());
        logger.debug("age: " + properties.getAge());
        logger.debug("Session Timeout: " + properties.getSessionTimeout());


        System.out.println("Application Runner!!!");
        System.out.println("foo: " + args.containsOption("foo"));
        System.out.println("bar: " + args.containsOption("bar"));
        System.out.println("Properties: " + properties.getName());
        System.out.println("age: " + properties.getAge());
        System.out.println("Session Timeout: " + properties.getSessionTimeout());

        logger.debug("============================");
        logger.debug(hello);
        logger.debug(properties.getFullName());
        logger.debug("============================");

        System.out.println("============================");
        System.out.println(hello);
        System.out.println(properties.getFullName());
        System.out.println("============================");
    }
}
