package com.appnetic.appneticapibackend.model;

//public record AppData(String app_name, String app_logo,
//                      String app_color, String app_url) {
//}

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppData{

    private String app_name;
    private String app_logo;
    private String app_color;
    private String app_url;

}
