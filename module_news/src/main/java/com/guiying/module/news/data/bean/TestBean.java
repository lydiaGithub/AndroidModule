package com.guiying.module.news.data.bean;

/**
 * Created by mac on 2018/4/24.
 */

public class TestBean {
    public String name;

    public TestBean(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String sex;

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
