package com.whwj.entity.fei;

import java.util.Date;

public class Jilu {
    private Integer id;

    private Integer sid;

    private Integer qid;

    private Date lingdate;

    private Date huandate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Date getLingdate() {
        return lingdate;
    }

    public void setLingdate(Date lingdate) {
        this.lingdate = lingdate;
    }

    public Date getHuandate() {
        return huandate;
    }

    public void setHuandate(Date huandate) {
        this.huandate = huandate;
    }
}