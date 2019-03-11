package com.wangxu.springbootjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootjpa.entity
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/11 15:15
 */
@Entity
public class Account {

    @Id
    @GeneratedValue // 字段自动生成
    private Integer id;

    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
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
