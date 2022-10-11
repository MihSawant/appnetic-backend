package com.appnetic.appneticapibackend;

import com.appnetic.appneticapibackend.proxy.GitUrlQueueProxy;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AppneticApiBackendApplication{

    GitUrlQueueProxy proxy;

    public AppneticApiBackendApplication(GitUrlQueueProxy proxy){
        this.proxy = proxy;
    }

    public static void main(String[] args) {

        SpringApplication.run(AppneticApiBackendApplication.class, args);

    }
}
