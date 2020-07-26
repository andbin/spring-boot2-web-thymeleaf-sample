/*
 * Copyright (C) 2019-2020 Andrea Binello ("andbin")
 *
 * This file is part of the "Spring Boot 2 Web Thymeleaf Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package it.andbin.springbootsample.model;

import java.time.ZonedDateTime;

public class AppInfo {
    private String javaVmName;
    private String javaVmVendor;
    private String javaVmVersion;
    private String javaRuntimeName;
    private String javaRuntimeVersion;
    private String springVersion;
    private String springBootVersion;
    private String thymeleafVersion;
    private String slf4jVersion;
    private String serverInfo;
    private ZonedDateTime vmStartTime;
    private ZonedDateTime currentTime;

    public String getJavaVmName() {
        return javaVmName;
    }

    public void setJavaVmName(String javaVmName) {
        this.javaVmName = javaVmName;
    }

    public String getJavaVmVendor() {
        return javaVmVendor;
    }

    public void setJavaVmVendor(String javaVmVendor) {
        this.javaVmVendor = javaVmVendor;
    }

    public String getJavaVmVersion() {
        return javaVmVersion;
    }

    public void setJavaVmVersion(String javaVmVersion) {
        this.javaVmVersion = javaVmVersion;
    }

    public String getJavaRuntimeName() {
        return javaRuntimeName;
    }

    public void setJavaRuntimeName(String javaRuntimeName) {
        this.javaRuntimeName = javaRuntimeName;
    }

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getSpringVersion() {
        return springVersion;
    }

    public void setSpringVersion(String springVersion) {
        this.springVersion = springVersion;
    }

    public String getSpringBootVersion() {
        return springBootVersion;
    }

    public void setSpringBootVersion(String springBootVersion) {
        this.springBootVersion = springBootVersion;
    }

    public String getThymeleafVersion() {
        return thymeleafVersion;
    }

    public void setThymeleafVersion(String thymeleafVersion) {
        this.thymeleafVersion = thymeleafVersion;
    }

    public String getSlf4jVersion() {
        return slf4jVersion;
    }

    public void setSlf4jVersion(String slf4jVersion) {
        this.slf4jVersion = slf4jVersion;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    public ZonedDateTime getVmStartTime() {
        return vmStartTime;
    }

    public void setVmStartTime(ZonedDateTime vmStartTime) {
        this.vmStartTime = vmStartTime;
    }

    public ZonedDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(ZonedDateTime currentTime) {
        this.currentTime = currentTime;
    }
}
