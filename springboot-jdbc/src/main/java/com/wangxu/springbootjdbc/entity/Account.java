package com.wangxu.springbootjdbc.entity;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjdbc.entity
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 13:49
 */
public class Account {


    private Integer id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
