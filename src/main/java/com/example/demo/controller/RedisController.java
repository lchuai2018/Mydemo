package com.example.demo.controller;

import com.example.demo.service.TestRedis;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "redis11")
@RestController
@RequestMapping("/redis11")
public class RedisController {

    @Autowired
    private TestRedis testRedis;
    @GetMapping(value = "/tree")
    @ApiOperation(value = "ceshi ", notes = "ceshi")
    public String  testTree() {
        testRedis.testLrem();

        return "success";
    }
}
