package com.netspend

import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Slf4j
@SpringBootApplication
class App {

    static void main(String[] args){
        SpringApplication.run(App.class, args);
        log.info("************* STARTED Netspend Test Management WebAPP **************")
    }


}
