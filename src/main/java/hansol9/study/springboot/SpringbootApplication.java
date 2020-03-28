package hansol9.study.springboot;

import me.whiteship.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.run(args);
    }

    /*
    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setName("Hello Holoman!!!");
        holoman.setHowLong(60);
        return holoman;
    }
    */

}
