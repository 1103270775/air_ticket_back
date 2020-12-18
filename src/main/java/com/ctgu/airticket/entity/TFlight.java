package com.ctgu.airticket.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

/**
 * (TFlight)实体类
 *
 * @author Mr.zhou
 * @since 2020-12-18 19:28:49
 */
@Entity
@Data
@Table(name = "t_flight")
public class TFlight implements Serializable {
    private static final long serialVersionUID = -62805466918684364L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;
    
    private String aircraftno;
    
    private String aircrafttype;
    
    private String fromcity;
    
    private String tocity;
    
    private Date fromtime;
    
    private Date totime;
    
    private Integer ecprice;
    
    private String flytime;
    
    private Integer ecticketremain;
    
    private Integer ectickettotal;
    
    private Integer fcprice;
    
    private Integer fcticketremain;
    
    private Integer fctickettotal;
    
    private String flighttype;
    
    private String cname;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getAircraftno() {
        return aircraftno;
    }

    public void setAircraftno(String aircraftno) {
        this.aircraftno = aircraftno;
    }

    public String getAircrafttype() {
        return aircrafttype;
    }

    public void setAircrafttype(String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity;
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity;
    }

    public Date getFromtime() {
        return fromtime;
    }

    public void setFromtime(Date fromtime) {
        this.fromtime = fromtime;
    }

    public Date getTotime() {
        return totime;
    }

    public void setTotime(Date totime) {
        this.totime = totime;
    }

    public Integer getEcprice() {
        return ecprice;
    }

    public void setEcprice(Integer ecprice) {
        this.ecprice = ecprice;
    }

    public String getFlytime() {
        return flytime;
    }

    public void setFlytime(String flytime) {
        this.flytime = flytime;
    }

    public Integer getEcticketremain() {
        return ecticketremain;
    }

    public void setEcticketremain(Integer ecticketremain) {
        this.ecticketremain = ecticketremain;
    }

    public Integer getEctickettotal() {
        return ectickettotal;
    }

    public void setEctickettotal(Integer ectickettotal) {
        this.ectickettotal = ectickettotal;
    }

    public Integer getFcprice() {
        return fcprice;
    }

    public void setFcprice(Integer fcprice) {
        this.fcprice = fcprice;
    }

    public Integer getFcticketremain() {
        return fcticketremain;
    }

    public void setFcticketremain(Integer fcticketremain) {
        this.fcticketremain = fcticketremain;
    }

    public Integer getFctickettotal() {
        return fctickettotal;
    }

    public void setFctickettotal(Integer fctickettotal) {
        this.fctickettotal = fctickettotal;
    }

    public String getFlighttype() {
        return flighttype;
    }

    public void setFlighttype(String flighttype) {
        this.flighttype = flighttype;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}