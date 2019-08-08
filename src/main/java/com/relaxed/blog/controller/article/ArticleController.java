package com.relaxed.blog.controller.article;

import com.relaxed.blog.parameter.ArticleParameter;
import com.relaxed.blog.service.ArticleService;
import com.relaxed.blog.suport.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author jerry
 * @version 1.0
 * @description 文章controller
 * @Date 2019/8/5 14:06
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @PostMapping({"/",""})
    public ResultBean list(ArticleParameter parameter) {
        ResultBean resultBean = new ResultBean();
        resultBean.putResult("articlePage", new ArrayList<>());
        return resultBean;
    }

}
