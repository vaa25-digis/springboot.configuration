package com.vaa25;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mysql")
@Component
public class MysqlProperties {

    private String property;
    private String overriddenProperty;

    public String property() {
        return property;
    }

    public String overriddenProperty() {
        return overriddenProperty;
    }
}
