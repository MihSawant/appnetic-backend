package com.appnetic.appneticapibackend.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.appnetic.appneticapibackend.proxy")
public class FeignClientConfig {
}
