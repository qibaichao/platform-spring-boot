package com.cyou;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.core.SpringVersion;

/**
 * Created by qibaichao on 2016/4/13.
 */
// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class ApplicationMain extends SpringBootServletInitializer {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ApplicationMain.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationMain.class);
    }

    public static void main(String[] args) throws Exception {
        logger.info("SPRING VERSION: " + SpringVersion.getVersion());
        //启动Spring Boot项目的唯一入口
        SpringApplication.run(ApplicationMain.class, args);
    }
}
