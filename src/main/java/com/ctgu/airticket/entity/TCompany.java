package com.ctgu.airticket.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * (TCompany)实体类
 *
 * @author Mr.zhou
 * @since 2020-12-18 20:46:04
 */

@Entity
@Table(name = "t_company")
public class TCompany implements Serializable {
    private static final long serialVersionUID = 499541913435883875L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    
    private String cname;
    
    private String logourl;
    
    private String description;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}