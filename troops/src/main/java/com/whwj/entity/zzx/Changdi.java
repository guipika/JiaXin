package com.whwj.entity.zzx;

public class Changdi {
    private Integer id;

    private String name;

    private String xiangqing;

    private Integer fuzedanweiid;

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

    public Integer getFuzedanweiid() {
        return fuzedanweiid;
    }

    public void setFuzedanweiid(Integer fuzedanweiid) {
        this.fuzedanweiid = fuzedanweiid;
    }
}