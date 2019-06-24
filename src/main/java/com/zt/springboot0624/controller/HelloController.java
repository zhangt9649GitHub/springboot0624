package com.zt.springboot0624.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 张婷
 * @date 2019/6/24 9:51
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name,
                        @RequestParam(name = "id") Integer id, Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        return "hello";
    }
}
