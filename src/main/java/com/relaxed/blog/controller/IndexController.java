package com.relaxed.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jerry
 * @version 1.0
 * @description 首页controller
 * @Date 2019/8/5 14:06
 */
@Controller
public class IndexController {

    @GetMapping({"/" ,"/index", "/index.html"})
    public String index(Model model) {
        return "index";
    }

}
