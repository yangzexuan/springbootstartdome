package com.dome.spring.boot.springmvc.controler;

import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DomeControler {

    @RequestMapping("/sayhello.html")
    public @ResponseBody String say(String name){
        return "hello "+name;
    }
}
