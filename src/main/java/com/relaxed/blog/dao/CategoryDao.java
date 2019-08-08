package com.relaxed.blog.dao;

import com.relaxed.blog.po.CategoryPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jerry
 * @version 1.0
 * @description 分类底层服务
 * @Date 2019/8/7 14:25
 */
@Repository
public interface CategoryDao extends JpaRepository<CategoryPo,Integer> {
}
