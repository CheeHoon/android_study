package com.sch.polio;

public class Ex10PhoneNum {
    String num;
    String name;
    String phone;
    int resId;

    public Ex10PhoneNum(String num, String name, String phone, int resId) {
        this.num = num;
        this.name = name;
        this.phone = phone;
        this.resId = resId;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public int getResId() {
        return resId;
    }
    public void setResId(int resId) {
        this.resId = resId;
    }
}
