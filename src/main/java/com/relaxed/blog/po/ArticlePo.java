package com.relaxed.blog.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *  文章数据库实体定义
 * </p>
 *
 * @author Big Boss
 * @since 2019-08-06
 */
@Data
@Entity
@Table(name = "bigboss_article")
public class ArticlePo implements Serializable {

    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user",length = 11)
    private Integer user;

    /**
     * 文章分类编码
     */
    @Column(name = "category",length = 9)
    private Integer category;

    /**
     * 标题
     */
    @Column(name = "title",length = 50)
    private String title;

    /**
     * 关键字
     */
    @Column(name = "keywords",length = 150)
    private String keywords;

    /**
     * 描述
     */
    @Column(name = "description",length = 500)
    private String description;

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 点击量
     */
    @Column(name = "click_num",length = 9)
    private Integer clickNum;

    /**
     * 评论数
     */
    @Column(name = "comment_count",length = 9)
    private Integer commentCount;

    /**
     * 发表时间
     */
    @Column(name = "create_time",length = 30)
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time",length = 30)
    private Date updateTime;

}
