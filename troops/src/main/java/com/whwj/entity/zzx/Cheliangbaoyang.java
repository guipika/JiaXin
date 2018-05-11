package com.whwj.entity.zzx;

import java.util.Date;

public class Cheliangbaoyang {
    private Integer id;

    private Integer cheliangid;

    private Date baoyangshijian;

    private String baoyangleixing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCheliangid() {
        return cheliangid;
    }

    public void setCheliangid(Integer cheliangid) {
        this.cheliangid = cheliangid;
    }

    public Date getBaoyangshijian() {
        return baoyangshijian;
    }

    public void setBaoyangshijian(Date baoyangshijian) {
        this.baoyangshijian = baoyangshijian;
    }

    public String getBaoyangleixing() {
        return baoyangleixing;
    }

    public void setBaoyangleixing(String baoyangleixing) {
        this.baoyangleixing = baoyangleixing == null ? null : baoyangleixing.trim();
    }
}