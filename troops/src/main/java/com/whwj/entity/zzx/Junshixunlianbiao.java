package com.whwj.entity.zzx;

import java.util.Date;

public class Junshixunlianbiao {
    private Integer id;

    private Date xunlianshijian;

    private Date jieshushijian;

    private Integer kemuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getXunlianshijian() {
        return xunlianshijian;
    }

    public void setXunlianshijian(Date xunlianshijian) {
        this.xunlianshijian = xunlianshijian;
    }

    public Date getJieshushijian() {
        return jieshushijian;
    }

    public void setJieshushijian(Date jieshushijian) {
        this.jieshushijian = jieshushijian;
    }

    public Integer getKemuid() {
        return kemuid;
    }

    public void setKemuid(Integer kemuid) {
        this.kemuid = kemuid;
    }
}