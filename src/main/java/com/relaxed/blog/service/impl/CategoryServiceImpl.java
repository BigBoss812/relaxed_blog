package com.relaxed.blog.service.impl;

import com.relaxed.blog.dao.CategoryDao;
import com.relaxed.blog.po.CategoryPo;
import com.relaxed.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 分类服务实现类
 * @Date 2019/8/7 13:49
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<CategoryPo> findAll() {
        return categoryDao.findAll();
    }

}
