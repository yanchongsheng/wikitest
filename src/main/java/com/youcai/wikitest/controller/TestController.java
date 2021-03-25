package com.youcai.wikitest.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

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
}
