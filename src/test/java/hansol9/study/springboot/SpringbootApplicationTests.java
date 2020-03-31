package hansol9.study.springboot;

//import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties = "holoman.name=annotation properties")
@TestPropertySource(locations = "classpath:/application-tdd.properties")
@SpringBootTest
//@SpringBootTest(properties = "holoman.name=annotation properties")
class SpringbootApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("holoman.name"))
        .isEqualTo("TDD for properties");
    }

}
