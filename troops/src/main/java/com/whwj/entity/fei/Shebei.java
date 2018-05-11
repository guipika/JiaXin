package com.whwj.entity.fei;

public class Shebei {
    private Integer id;

    private String shebeiname;

    private String code;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShebeiname() {
        return shebeiname;
    }

    public void setShebeiname(String shebeiname) {
        this.shebeiname = shebeiname == null ? null : shebeiname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}