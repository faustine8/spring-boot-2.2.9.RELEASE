package com.davis.config;

import com.davis.bean.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author faustine
 * @date 2023/5/12
 */
@Configuration
@ConditionalOnClass(ConfigMark.class)
public class MyAutoConfiguration {

    static {
        System.out.println("=== MyAutoConfiguration init ===");
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }

}
