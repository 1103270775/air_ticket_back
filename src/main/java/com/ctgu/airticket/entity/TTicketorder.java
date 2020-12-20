package com.ctgu.airticket.entity;

import lombok.Data;
import javax.persistence.*;

import java.util.Date;
import java.io.Serializable;

/**
 * (TTicketorder)实体类
 *
 * @author xzh
 * @since 2020-12-18 19:37:57
 */
@Entity
@Data
@Table(name="t_ticketorder")

public class TTicketorder implements Serializable {
    private static final long serialVersionUID = 849515491426234160L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    
    private String orderno;
    
    private Date ordertime;
    
    private Integer price;
    
    private String spacetype;
    
    private Integer fid;
    
    private Integer uid;
    
    private Integer num;
    
    private Integer totalprice;
    
    private String contactphone;
    
    private String contactname;
    
    private String paystatus;

    private String idcard;


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSpacetype() {
        return spacetype;
    }

    public void setSpacetype(String spacetype) {
        this.spacetype = spacetype;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

}