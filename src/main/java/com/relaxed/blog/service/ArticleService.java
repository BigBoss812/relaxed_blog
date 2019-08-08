package com.relaxed.blog.service;

import com.relaxed.blog.parameter.ArticleParameter;
import com.relaxed.blog.po.ArticlePo;
import com.relaxed.blog.po.LabelPo;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 文章服务
 * @Date 2019/8/7 13:29
 */
public interface ArticleService {

    /**
     * 根据入参查询文章列表
     * @return
     */
    List<ArticlePo> findAll(ArticleParameter articleParameter);

}
