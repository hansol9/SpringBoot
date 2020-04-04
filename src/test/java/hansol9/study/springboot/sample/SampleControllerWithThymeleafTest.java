package hansol9.study.springboot.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@RunWith(SpringRunner.class)
@WebMvcTest(SampleControllerWithThymeleaf.class)
public class SampleControllerWithThymeleafTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        // 요청 "/hello"
        // 응답 model name: hansol
        // 응답 view: hello
        mockMvc.perform(get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("name", is("hansol")))
                .andExpect(content().string(containsString("hansol")));

    }

}