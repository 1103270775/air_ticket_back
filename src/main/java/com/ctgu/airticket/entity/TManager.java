package com.ctgu.airticket.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * (TManager)实体类
 *
 * @author xzh
 * @since 2020-12-18 20:44:36
 */
@Entity
@Data
@Table(name="t_manager")
public class TManager implements Serializable {
    private static final long serialVersionUID = 320719688653075277L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mid;
    
    private String password;
    
    private String phone;
    
    private String truename;
    
    private String username;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}