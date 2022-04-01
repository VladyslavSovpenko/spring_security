package com.vss.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String forAllEmp() {
        return "view_for_all_emp";
    }

    @GetMapping("/hr_info")
    public String forAllHR() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String forAllManager() {
        return "view_for_manager";
    }


}
