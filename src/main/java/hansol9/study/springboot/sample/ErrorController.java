package hansol9.study.springboot.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {

    @GetMapping("/exception")
    public void sampleError() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppError sampleError(SampleException e) {

        AppError appError= new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("I don't know");

        return appError;
    }
}
