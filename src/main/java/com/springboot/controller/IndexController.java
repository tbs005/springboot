package com.springboot.controller;

import com.springboot.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by user on 2017/4/26.
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @ApiOperation(value = "首页", notes = "测试项目首页")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        User user = new User(1L,"张三","123","qq@qq.com");
        model.addAttribute("user",user);
        return "index";
    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam(name = "uploadFile")MultipartFile file){
        return "success";
    }
}
