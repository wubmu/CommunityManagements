package com.cm.bean;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public class Customer {
    private String name;
    private String id;
    private String tel;
    private String password;
    private String address;
    private String sex;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
