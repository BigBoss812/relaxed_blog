package com.relaxed.blog.service;

import com.relaxed.blog.po.CategoryPo;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 分类服务
 * @Date 2019/8/7 13:29
 */
public interface CategoryService {

    /**
     * 查询分类列表
     * @return
     */
    List<CategoryPo> findAll();

}
