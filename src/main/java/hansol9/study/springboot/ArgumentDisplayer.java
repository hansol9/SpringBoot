package hansol9.study.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentDisplayer {

    public ArgumentDisplayer(ApplicationArguments arguments) {
        System.out.println("foo " + arguments.containsOption("foo"));
        System.out.println("bar " + arguments.containsOption("bar"));
    }
}
