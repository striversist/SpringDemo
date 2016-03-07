package demo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.HelloWorld;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
