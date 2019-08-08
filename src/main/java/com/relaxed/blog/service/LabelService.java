package com.relaxed.blog.service;

import com.relaxed.blog.po.LabelPo;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 标签服务
 * @Date 2019/8/7 13:29
 */
public interface LabelService {

    /**
     * 查询标签列表
     * @return
     */
    List<LabelPo> findAll();

}
