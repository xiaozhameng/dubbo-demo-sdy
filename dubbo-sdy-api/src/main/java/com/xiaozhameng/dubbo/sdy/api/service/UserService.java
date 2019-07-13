package com.xiaozhameng.dubbo.sdy.api.service;

import com.xiaozhameng.dubbo.sdy.api.entity.User;

import java.util.List;

/**
 * 用户服务接口
 *
 * @author xiaozhameng
 * @date 2019-07-05
 */
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    List<User> queryAllUser();

    /**
     * 根据用户的userId 查询用户实体
     * @param userId
     * @return
     */
    User getUserByUserId(String userId);

}
