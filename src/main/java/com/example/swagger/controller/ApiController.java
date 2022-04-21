package com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"API 정보를 제공하는 Controller"})    // 1. @Api
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/plus/{x}")
    public int plus(
            @ApiParam(value="x값")   // 2. @ApiParam
            @PathVariable int x,

            @ApiParam(value="y값")
            @RequestParam int y){
        return x+y;
    }

}
