package com.appnetic.appneticapibackend.proxy;

import com.appnetic.appneticapibackend.model.AppData;
import com.appnetic.appneticapibackend.model.GitUrl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "getRepo", url = "${data.url}")
public interface GitUrlQueueProxy {

    @GetMapping("/get-queue")
    GitUrl consumeGitURl();
}
