package com.sz.old.bean;

import java.io.Serializable;

public class Girl  implements Serializable {

    public  static  final long SeriaVersionUID = -1L;

    private Integer num;
    private String name;
    private  String color;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
