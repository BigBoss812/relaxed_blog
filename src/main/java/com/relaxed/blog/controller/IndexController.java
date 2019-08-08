package com.relaxed.blog.controller;

import com.relaxed.blog.po.CategoryPo;
import com.relaxed.blog.po.LabelPo;
import com.relaxed.blog.service.CategoryService;
import com.relaxed.blog.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 首页controller
 * @Date 2019/8/5 14:06
 */
@Controller
public class IndexController {

    @Autowired
    private LabelService labelService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping({"/" ,"/index", "/index.html"})
    public String index(Model model) {
        List<LabelPo> labelList = labelService.findAll();
        List<CategoryPo> categoryList = categoryService.findAll();
        model.addAttribute("labelList", labelList);
        model.addAttribute("categoryList", categoryList);
        return "index";
    }

}
