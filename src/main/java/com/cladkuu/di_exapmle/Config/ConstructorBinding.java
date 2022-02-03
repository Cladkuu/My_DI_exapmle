package com.cladkuu.di_exapmle.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@org.springframework.boot.context.properties.ConstructorBinding
@ConfigurationProperties("guru")
public class ConstructorBinding {

    private final String userName;
    private final String password;
    private final String jdbcurl;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public ConstructorBinding(String userName, String password, String jdbcurl) {
        this.userName = userName;
        this.password = password;
        this.jdbcurl = jdbcurl;


    }
}
