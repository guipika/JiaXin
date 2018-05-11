package com.whwj.entity.fei;

import java.util.Date;

public class Baoyang {
    private Integer id;

    private Integer qid;

    private Date bdate;

    private Date remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Date getRemarks() {
        return remarks;
    }

    public void setRemarks(Date remarks) {
        this.remarks = remarks;
    }
}