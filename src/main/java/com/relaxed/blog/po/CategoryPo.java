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
 * <p>
 *  文章分类数据库实体定义
 * </p>
 *
 * @author Big Boss
 * @since 2019-08-06
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
     * 分类关键词
     */
    @Column(name = "keywords",length = 150)
    private String keywords;

    /**
     * 分类描述
     */
    @Column(name = "description")
    private String description;

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
