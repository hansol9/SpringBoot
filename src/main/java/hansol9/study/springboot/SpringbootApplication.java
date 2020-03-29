package hansol9.study.springboot;

//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
@RestController
public class SpringbootApplication {

    /*
    public static void main(String[] args) throws LifecycleException {

//        SpringApplication application = new SpringApplication(SpringbootApplication.class);
//        application.run(args);
//        SpringApplication application = new SpringApplication(SpringbootApplication.class);
//        application.run(args);
//        application.setWebApplicationType(WebApplicationType.NONE);

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8000);

        Context context = tomcat.addContext("/", "/");

        HttpServlet servlet = new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter writer = resp.getWriter();
                writer.println("<html><head><title>");
                writer.println("Hey, Tomcat");
                writer.println("</title></head>");
                writer.println("<body><h1>Hello Tomcat</h1></body>");
                writer.println("</html>");
            }
        };

        String servletName = "helloServlet";
        tomcat.addServlet("/", servletName, servlet);
        context.addServletMappingDecoded("/hello", servletName);

        tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();

    }
    */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootApplication.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }

    /*
    @Bean
    public ServletWebServerFactory serverFactory() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        return connector;
    }
    */

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
