package com.relaxed.blog.dao;

import com.relaxed.blog.po.ArticlePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jerry
 * @version 1.0
 * @description 文章服务类
 * @Date 2019/8/7 15:39
 */
@Repository
public interface ArticleDao extends JpaRepository<ArticlePo,Integer> {
}
