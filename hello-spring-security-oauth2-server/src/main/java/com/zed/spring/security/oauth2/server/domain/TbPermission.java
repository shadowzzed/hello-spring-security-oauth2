package com.zed.spring.security.oauth2.server.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
  * @author Zed
  * @date 2020/2/25 上午1:20
  * @contact shadowl91@163.com
  */
@Data
@Table(name = "tb_permission")
public class TbPermission implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 父权限
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 权限名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 权限英文名称
     */
    @Column(name = "enname")
    private String enname;

    /**
     * 授权路径
     */
    @Column(name = "url")
    private String url;

    /**
     * 备注
     */
    @Column(name = "description")
    private String description;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    private static final long serialVersionUID = 1L;
}