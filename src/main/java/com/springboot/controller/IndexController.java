package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by user on 2017/4/26.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam(name = "uploadFile")MultipartFile file){
        return "success";
    }
}
