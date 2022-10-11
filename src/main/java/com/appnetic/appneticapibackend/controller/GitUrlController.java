package com.appnetic.appneticapibackend.controller;

import com.appnetic.appneticapibackend.model.AppData;
import com.appnetic.appneticapibackend.proxy.GitUrlQueueProxy;
import com.appnetic.appneticapibackend.service.UrlCloneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitUrlController {

    private final GitUrlQueueProxy gitUrlQueueProxy;


    public GitUrlController(GitUrlQueueProxy gitUrlQueueProxy){
        this.gitUrlQueueProxy = gitUrlQueueProxy;
    }

    @GetMapping("/consume-api")
    public void consumeApi(){
        var gitUrlData =  gitUrlQueueProxy.consumeGitURl();
        System.out.println(gitUrlData.toString());
        UrlCloneService.cloneUrl(gitUrlData.getGit());
    }

}
