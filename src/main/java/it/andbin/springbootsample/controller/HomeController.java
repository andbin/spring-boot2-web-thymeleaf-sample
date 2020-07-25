/*
 * Copyright (C) 2019-2020 Andrea Binello ("andbin")
 *
 * This file is part of the "Spring Boot 2 Web Thymeleaf Sample" project
 * and is released under the MIT License. See one of the license files
 * included in the root of the project for the full text of the license.
 */

package it.andbin.springbootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.andbin.springbootsample.service.AppInfoService;

@Controller
public class HomeController {
    @Autowired
    private AppInfoService appInfoService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appInfo", appInfoService.getAppInfo());
        return "home";
    }
}
