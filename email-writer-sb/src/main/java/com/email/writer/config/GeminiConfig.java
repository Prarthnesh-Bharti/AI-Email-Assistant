package com.email.writer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "gemini.api")
@Data
public class GeminiConfig {
    private String url;
    private String key;
}
