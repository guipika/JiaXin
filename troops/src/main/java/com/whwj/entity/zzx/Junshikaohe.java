package com.whwj.entity.zzx;

import java.util.Date;

public class Junshikaohe {
    private Integer id;

    private Date kaoheshijian;

    private Integer kaoherenyuanid;

    private Integer kaohefuzherenid;

    private Integer kaihekemuid;

    private String kaohechengji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getKaoheshijian() {
        return kaoheshijian;
    }

    public void setKaoheshijian(Date kaoheshijian) {
        this.kaoheshijian = kaoheshijian;
    }

    public Integer getKaoherenyuanid() {
        return kaoherenyuanid;
    }

    public void setKaoherenyuanid(Integer kaoherenyuanid) {
        this.kaoherenyuanid = kaoherenyuanid;
    }

    public Integer getKaohefuzherenid() {
        return kaohefuzherenid;
    }

    public void setKaohefuzherenid(Integer kaohefuzherenid) {
        this.kaohefuzherenid = kaohefuzherenid;
    }

    public Integer getKaihekemuid() {
        return kaihekemuid;
    }

    public void setKaihekemuid(Integer kaihekemuid) {
        this.kaihekemuid = kaihekemuid;
    }

    public String getKaohechengji() {
        return kaohechengji;
    }

    public void setKaohechengji(String kaohechengji) {
        this.kaohechengji = kaohechengji == null ? null : kaohechengji.trim();
    }
}