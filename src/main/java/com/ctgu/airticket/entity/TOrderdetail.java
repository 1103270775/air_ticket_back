package com.ctgu.airticket.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * (TOrderdetail)实体类
 *
 * @author xzh
 * @since 2020-12-18 20:23:26
 */
@Entity
@Data
@Table(name="t_orderdetail")
public class TOrderdetail implements Serializable {
    private static final long serialVersionUID = 999534069805499738L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailid;
    
    private String passname;
    
    private String idcard;
    
    private String fid;
    
    private String orderid;


    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public String getPassname() {
        return passname;
    }

    public void setPassname(String passname) {
        this.passname = passname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

}