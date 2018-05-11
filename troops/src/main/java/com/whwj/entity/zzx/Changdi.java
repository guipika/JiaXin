package com.whwj.entity.zzx;

public class Changdi {
    private Integer id;

    private String name;

    private String xiangqing;

    private Integer churuid;

    private String chepai;

    private Integer fuzerenid;

    private Integer jiashiyuanid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getXiangqing() {
        return xiangqing;
    }

    public void setXiangqing(String xiangqing) {
        this.xiangqing = xiangqing == null ? null : xiangqing.trim();
    }

    public Integer getChuruid() {
        return churuid;
    }

    public void setChuruid(Integer churuid) {
        this.churuid = churuid;
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