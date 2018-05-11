package com.whwj.entity.zzx;

import java.util.Date;

public class Churu {
    private Integer id;

    private Integer changdiid;

    private Integer danweiid;

    private Integer rudanweiid;

    private String rname;

    private Date rushijian;

    private Date chushijian;

    private String chepai;

    private Integer fuzerenid;

    private Integer jiashiyuanid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChangdiid() {
        return changdiid;
    }

    public void setChangdiid(Integer changdiid) {
        this.changdiid = changdiid;
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

    public String getChepai() {
        return chepai;
    }

    public void setChepai(String chepai) {
        this.chepai = chepai == null ? null : chepai.trim();
    }

    public Integer getFuzerenid() {
        return fuzerenid;
    }

    public void setFuzerenid(Integer fuzerenid) {
        this.fuzerenid = fuzerenid;
    }

    public Integer getJiashiyuanid() {
        return jiashiyuanid;
    }

    public void setJiashiyuanid(Integer jiashiyuanid) {
        this.jiashiyuanid = jiashiyuanid;
    }
}