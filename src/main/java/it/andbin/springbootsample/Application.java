/*
 * Copyright (C) 2019-2020 Andrea Binello ("andbin")
 *
 * This file is part of the "Spring Boot 2 Web Thymeleaf Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package it.andbin.springbootsample;

import java.time.ZonedDateTime;
import java.util.function.Supplier;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Autowired
    private ServletContext servletContext;

    @Bean
    public Supplier<AppInfo> appInfoSupplier() {
        return this::getAppInfo;
    }

    private AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(RuntimeUtils.getJavaRuntimeVersion());
        appInfo.setSpringVersion(RuntimeUtils.getSpringVersion());
        appInfo.setSpringBootVersion(RuntimeUtils.getSpringBootVersion());
        appInfo.setThymeleafVersion(RuntimeUtils.getThymeleafVersion());
        appInfo.setServerInfo(servletContext.getServerInfo());
        appInfo.setVmStartTime(RuntimeUtils.getVmStartZonedDateTime());
        appInfo.setCurrentTime(ZonedDateTime.now());
        return appInfo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
