package com.example.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/2/1.
 */
@Controller
@ConfigurationProperties(prefix = "test")
public class StudentController {

    private String testId;

    public void setTestId(String testId) {
        this.testId = testId;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("str", "hello world");
        model.addAttribute("testId", testId);
        return "test";
    }
}
