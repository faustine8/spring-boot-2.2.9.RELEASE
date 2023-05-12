package com.davis.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author faustine
 * @date 2023/5/12
 */

@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "simple.bean")
public class SimpleBean {

    private int id;

    private String name;

}
