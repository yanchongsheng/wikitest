package com.youcai.wikitest.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.youcai.wikitest")
// @ComponentScan({"com.youcai.wikitest", "com.youcai.test"}) // 支持同时扫描多个包
@RestController
public class TestController {

//    @PostMapping("/insert")
//    @DeleteMapping("/delete")
//    @PutMapping("/update")
//    @GetMapping("/select")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}
