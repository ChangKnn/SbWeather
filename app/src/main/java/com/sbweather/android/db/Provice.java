package com.sbweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Provice extends LitePalSupport {

    private int id;

    private String proviceName;

    private int proviceCode;

    public int getId() {
        return id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
