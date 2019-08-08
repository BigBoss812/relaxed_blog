package com.relaxed.blog.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author jerry
 * @version 1.0
 * @description 文章分类数据库实体定义
 * @Date 2019/8/7 13:43
 */
@Data
@Entity
@Table(name = "bigboss_category")
public class CategoryPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    /**
     * 分类名称
     */
    @Column(name = "name",length = 30)
    private String name;

    /**
     * 分类顺序(0开始)
     */
    @Column(name = "index",length = 2)
    private Integer index;


    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private LocalDateTime createTime;

}
