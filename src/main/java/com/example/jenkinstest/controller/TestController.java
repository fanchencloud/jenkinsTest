package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Version: V1.0    <br/>
 * Datetime:   2022/2/2 1:11   <br/>
 * Description: 测试接口
 *
 * @author: chen
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
