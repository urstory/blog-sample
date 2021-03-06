package com.blog.properties;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class SamplePropertiesRunner implements ApplicationRunner {

    private final SampleProperties properties;

    @Override
    public void run(ApplicationArguments args)  {
        final String email = properties.getEmail();
        final String name = properties.getName();
        final int age = properties.getAge();
        final boolean auth = properties.isAuth();

        log.info("==================");
        log.info(email);
        log.info(name);
        log.info(String.valueOf(age));
        log.info(String.valueOf(auth));
        log.info("==================");
    }
}
