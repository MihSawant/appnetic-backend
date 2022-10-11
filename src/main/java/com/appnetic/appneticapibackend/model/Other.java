package com.appnetic.appneticapibackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

//public record Other(long id, String app_name, String app_desc,
//                    String app_logo, String version,
//                    String github, String owner,
//                    long downloads, String screenshots,
//                    String created_at, String updated_at,
//                    String something, int something2, long someting3) {
//}
@Data
@NoArgsConstructor
public class Other{
    private long id;
    private String app_name;
    private String app_desc;
    private String app_logo;
    private String version;
    private String github;
    private String owner;
    private long downloads;
    private String screenshots;
    private String created_at;
    private String updated_at;
}
