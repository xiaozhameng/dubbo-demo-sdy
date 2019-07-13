package com.xiaozhameng.dubbo.sdy.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiaozhameng
 * @date  2019-07-05
 * 用户实体类
 */
@Data
public class User implements Serializable {

    private String id;
    private String userId;
    private String name;
    private String age;
    private String addr;
    private String work;

    public User() {
    }

    /**
     *
     * @param id
     * @param userId
     * @param name
     * @param age
     * @param addr
     * @param work
     */
    public User(String id, String userId, String name, String age,
                String addr, String work) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.work = work;
    }
}
