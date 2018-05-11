package com.whwj.entity.zzx;

import java.util.Date;

public class Churu {
    private Integer id;

    private Integer danweiid;

    private Integer rudanweiid;

    private String rname;

    private Date rushijian;

    private Date chushijian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDanweiid() {
        return danweiid;
    }

    public void setDanweiid(Integer danweiid) {
        this.danweiid = danweiid;
    }

    public Integer getRudanweiid() {
        return rudanweiid;
    }

    public void setRudanweiid(Integer rudanweiid) {
        this.rudanweiid = rudanweiid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Date getRushijian() {
        return rushijian;
    }

    public void setRushijian(Date rushijian) {
        this.rushijian = rushijian;
    }

    public Date getChushijian() {
        return chushijian;
    }

    public void setChushijian(Date chushijian) {
        this.chushijian = chushijian;
    }
}