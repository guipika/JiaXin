package com.whwj.entity.fei;

public class Cangku {
    private Integer id;

    private String weizhi;

    private String shuliang;

    private String cleixing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi == null ? null : weizhi.trim();
    }

    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang == null ? null : shuliang.trim();
    }

    public String getCleixing() {
        return cleixing;
    }

    public void setCleixing(String cleixing) {
        this.cleixing = cleixing == null ? null : cleixing.trim();
    }
}