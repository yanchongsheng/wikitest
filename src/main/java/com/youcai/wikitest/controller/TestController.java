package com.youcai.wikitest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.youcai.wikitest")
// @ComponentScan({"com.youcai.wikitest", "com.youcai.test"}) // 支持同时扫描多个包
@RestController
public class TestController {

    // :Test 表示该变量的默认配置值为 Test
    @Value("${test.hello:Test}")
    private String testHello;

//    @PostMapping("/insert")
//    @DeleteMapping("/delete")
//    @PutMapping("/update")
//    @GetMapping("/select")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}
