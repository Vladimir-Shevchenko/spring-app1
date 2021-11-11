package com.shevchenko.springcourse;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.shevchenko.springcourse")
@PropertySource("classpath:muicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
}
