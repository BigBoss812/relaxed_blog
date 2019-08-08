package com.relaxed.blog.parameter;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jerry
 * @version 1.0
 * @description 文章服务参数类
 * @Date 2019/8/7 15:53
 */
@Data
public class ArticleParameter implements Serializable {

    private static final long serialVersionUID = -863881428412064371L;

    /**
     * 页码
     */
    private int currPage;

    /**
     * 分页数量
     */
    private int pageSize;

    /**
     * 入参关键字
     */
    private String keyword;
}
