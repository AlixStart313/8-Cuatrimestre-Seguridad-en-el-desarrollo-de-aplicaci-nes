package mx.edu.utez.sda.springmvc8a.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/people").setViewName("people");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/accion").setViewName("accion");
        registry.addViewController("/animadas").setViewName("animadas");
        registry.addViewController("/anime").setViewName("anime");
        registry.addViewController("/romance").setViewName("romance");
        registry.addViewController("/suspenso").setViewName("suspenso");

    }
}
