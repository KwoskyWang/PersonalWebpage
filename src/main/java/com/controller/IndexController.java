package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by moooke on 2019/1/7.
 */

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "This is the index page";
    }
}
