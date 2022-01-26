package net.seehope.springboot.util;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "net.seehope.springboot")
@Data
public class ProjectProperties {
    private ShowapiProperties showapi;
}
