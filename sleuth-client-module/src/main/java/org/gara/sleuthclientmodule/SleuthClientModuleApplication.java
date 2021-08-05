package org.gara.sleuthclientmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SleuthClientModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthClientModuleApplication.class, args);
    }

}
