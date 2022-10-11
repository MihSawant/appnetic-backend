package com.appnetic.appneticapibackend.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

public class ConfigFileWriteService {
    private static final String FILE_PATH = "/home/mihir/Documents/appnetic-api-backend/webview/lib/config.dart";


    public static void writeFile(){
        try{
            var file = new File(FILE_PATH);
            System.out.println(file.exists());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
