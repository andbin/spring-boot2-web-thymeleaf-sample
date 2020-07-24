/*
 * Copyright (C) 2019-2020 Andrea Binello ("andbin")
 *
 * This file is part of the "Spring Boot 2 Web Thymeleaf Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package it.andbin.springbootsample;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.thymeleaf.Thymeleaf;

public class RuntimeUtils {
    private RuntimeUtils() {}

    public static String getJavaRuntimeVersion() {
        return System.getProperty("java.runtime.version");
    }

    public static String getSpringVersion() {
        return SpringVersion.getVersion();
    }

    public static String getSpringBootVersion() {
        return SpringBootVersion.getVersion();
    }

    public static String getThymeleafVersion() {
        return Thymeleaf.VERSION;
    }

    public static ZonedDateTime getVmStartZonedDateTime() {
        return ZonedDateTime.ofInstant(getVmStartInstant(), ZoneId.systemDefault());
    }

    public static Instant getVmStartInstant() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        Instant startTime = Instant.ofEpochMilli(runtimeMXBean.getStartTime());
        return startTime;
    }
}
