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
 *  标签数据库实体定义
 * </p>
 *
 * @author Big Boss
 * @since 2019-08-06
 */
@Data
@Entity
@Table(name = "bigboss_label")
public class LabelPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    /**
     * 标签名称
     */
    @Column(name = "name",length = 30)
    private String name;

    /**
     * 标签描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 标签顺序(0开始)
     */
    @Column(name = "index")
    private Integer index;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

}
