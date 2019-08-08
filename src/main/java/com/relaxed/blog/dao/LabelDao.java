package com.relaxed.blog.dao;

import com.relaxed.blog.po.LabelPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jerry
 * @version 1.0
 * @description 标签底层服务
 * @Date 2019/8/7 13:52
 */
@Repository
public interface LabelDao extends JpaRepository<LabelPo,Integer> {
}
