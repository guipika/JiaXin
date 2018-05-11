package com.whwj.entity.fei;

public class Zidan {
    private Integer id;

    private String koujing;

    private String dankechangdu;

    private String dankexingzhuang;

    private String fuzhu;

    private String beizhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKoujing() {
        return koujing;
    }

    public void setKoujing(String koujing) {
        this.koujing = koujing == null ? null : koujing.trim();
    }

    public String getDankechangdu() {
        return dankechangdu;
    }

    public void setDankechangdu(String dankechangdu) {
        this.dankechangdu = dankechangdu == null ? null : dankechangdu.trim();
    }

    public String getDankexingzhuang() {
        return dankexingzhuang;
    }

    public void setDankexingzhuang(String dankexingzhuang) {
        this.dankexingzhuang = dankexingzhuang == null ? null : dankexingzhuang.trim();
    }

    public String getFuzhu() {
        return fuzhu;
    }

    public void setFuzhu(String fuzhu) {
        this.fuzhu = fuzhu == null ? null : fuzhu.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}