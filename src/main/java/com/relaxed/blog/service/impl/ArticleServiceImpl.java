package com.relaxed.blog.service.impl;

import com.relaxed.blog.dao.ArticleDao;
import com.relaxed.blog.parameter.ArticleParameter;
import com.relaxed.blog.po.ArticlePo;
import com.relaxed.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 文章服务实现类
 * @Date 2019/8/7 13:49
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<ArticlePo> findAll(ArticleParameter articleParameter) {
        return articleDao.findAll();
    }

}
