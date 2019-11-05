package com.vaa25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config {

    @Value("${mysql.property}")
    private String mysql;
    @Value("${mysql.overridden-property}")
    private String mysqlOverridden;
    @Value("${elasticsearch.property}")
    private String elasticsearch;
    @Value("${java.home}")
    private String javaHome;
    @Autowired
    private Environment environment;
    @Autowired
    private MysqlProperties mysqlProperties;

    @Bean
    public Void run(){
        System.out.println(mysql);
        System.out.println(mysqlOverridden);
        System.out.println(elasticsearch);
        System.out.println(mysqlProperties.property());
        System.out.println(mysqlProperties.overriddenProperty());
        System.out.println(javaHome);
        System.out.println(environment.getProperty("java.home"));

        return null;
    }

}
