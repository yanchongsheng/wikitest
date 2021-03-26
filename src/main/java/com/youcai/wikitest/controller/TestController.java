package com.youcai.wikitest.controller;

import com.youcai.wikitest.domain.Test;
import com.youcai.wikitest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    // :Test 表示该变量的默认配置值为 Test
    @Value("${test.hello:Test}")
    private String testHello;

    @Autowired
    private TestService testService;

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

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
