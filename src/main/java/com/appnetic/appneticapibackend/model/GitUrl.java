package com.appnetic.appneticapibackend.model;
//
//public record GitUrl(String git, AppData app_data, long uid, Other others) {
//}

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GitUrl{
    private String git;
    private AppData app_data;
    private long uid;
    private Other others;
}