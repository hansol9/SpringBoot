package hansol9.study.springboot.sample;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class SampleControllerHATEOAS {

    @GetMapping("/hateoas")
    public EntityModel<Hello> hello() {
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("Hansol");

        EntityModel<Hello> helloResource = new EntityModel<>(hello);
//        Resource<Hello> helloResource = new Resource<>(hello);
        helloResource.add(linkTo(methodOn(SampleControllerHATEOAS.class).hello()).withSelfRel());

        return helloResource;
    }
}
