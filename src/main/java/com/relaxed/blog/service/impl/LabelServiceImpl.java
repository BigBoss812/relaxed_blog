package com.relaxed.blog.service.impl;

import com.relaxed.blog.dao.LabelDao;
import com.relaxed.blog.po.LabelPo;
import com.relaxed.blog.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jerry
 * @version 1.0
 * @description 标签服务实现类
 * @Date 2019/8/7 13:49
 */
@Service("labelService")
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Override
    public List<LabelPo> findAll() {
        return labelDao.findAll();
    }

}
