package com.appnetic.appneticapibackend.service;

import java.io.*;
import java.nio.file.Paths;

public class UrlCloneService {

    private static final String GIT_CLONE = "git clone";

    public static void cloneUrl(String gitUrl){
        String homeDir = System.getProperty("user.home");
//        String job1 =  Paths.get(homeDir+"/Documents").toString();
        String job2 = GIT_CLONE.concat(" ").concat(gitUrl);

//        String[] jobs = {job1};

        try{
            var p = Runtime.getRuntime().exec(homeDir);
            p.waitFor();
            System.out.println(p);
        }catch(Exception ex){
            System.out.println("Something Went Wrong: "+ex.getMessage());
        }


//        try{
//            var process = Runtime.getRuntime().exec(jobs);
//
//            System.out.println(process);
//
//            int wait = process.waitFor();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while((line = reader.readLine()) != null){
//                System.out.println(line+"\n");
//            }
//            if(wait == 0){
//
//                System.out.println("JOB Done... "+gitUrl);
//            }
//        }catch(IOException | InterruptedException ex){
//            System.out.println("Error "+ex.getMessage());
//        }
    }
}
