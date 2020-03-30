package hansol9.study.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {

    @Value("${holoman.name}")
    private String name;

    @Value("${holoman.age}")
    private int age;

    @Value("${holoman.fullName}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application Runner!!!");
        System.out.println("foo: " + args.containsOption("foo"));
        System.out.println("bar: " + args.containsOption("bar"));
        System.out.println("Properties: " + name);
        System.out.println("age: " + age);
    }
}
