package com.hcmute.dhspkt.ms19110145_trandangkhoa.fonos.Model;

import java.io.Serializable;

public class Coupons implements Serializable {
    private String code;
    private double dis_percent;
    private String expired_date;

    public Coupons(String code, double dis_percent, String expired_date) {
        this.code = code;
        this.dis_percent = dis_percent;
        this.expired_date = expired_date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDis_percent() {
        return dis_percent;
    }

    public void setDis_percent(double dis_percent) {
        this.dis_percent = dis_percent;
    }

    public String getExpired_date() {
        return expired_date;
    }

    public void setExpired_date(String expired_date) {
        this.expired_date = expired_date;
    }
}
