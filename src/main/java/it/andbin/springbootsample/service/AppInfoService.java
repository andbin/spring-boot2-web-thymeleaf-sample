package it.andbin.springbootsample.service;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import org.thymeleaf.Thymeleaf;
import it.andbin.springbootsample.model.AppInfo;

@Service
public class AppInfoService {
    @Autowired
    private ServletContext servletContext;

    private RuntimeMXBean runtimeMXBean;

    @PostConstruct
    private void initialize() {
        runtimeMXBean = ManagementFactory.getRuntimeMXBean();
    }

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setSpringVersion(getSpringVersion());
        appInfo.setSpringBootVersion(getSpringBootVersion());
        appInfo.setThymeleafVersion(getThymeleafVersion());
        appInfo.setServerInfo(getServerInfo());
        appInfo.setVmStartTime(getVmStartZonedDateTime());
        appInfo.setCurrentTime(getCurrentZonedDateTime());
        return appInfo;
    }

    private String getJavaRuntimeVersion() {
        return System.getProperty("java.runtime.version");
    }

    private String getSpringVersion() {
        return SpringVersion.getVersion();
    }

    private String getSpringBootVersion() {
        return SpringBootVersion.getVersion();
    }

    private String getThymeleafVersion() {
        return Thymeleaf.VERSION;
    }

    private String getServerInfo() {
        return servletContext.getServerInfo();
    }

    private ZonedDateTime getVmStartZonedDateTime() {
        return ZonedDateTime.ofInstant(getVmStartInstant(), ZoneId.systemDefault());
    }

    private Instant getVmStartInstant() {
        return Instant.ofEpochMilli(runtimeMXBean.getStartTime());
    }

    private ZonedDateTime getCurrentZonedDateTime() {
        return ZonedDateTime.now();
    }
}
