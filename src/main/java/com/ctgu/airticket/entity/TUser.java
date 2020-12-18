package com.ctgu.airticket.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 *
 * @author xzh
 * @since 2020-12-18 18:50
 */
@Entity
@Data
@Table(name="t_user")
public class TUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    
    private String username;
    
    private String password;

    private String nickname;

    private String sex;

    private String phone;

    private String email;

    private String truename;
    
    private String idcard;

}