package com.xiaozhameng.dubbo.sdy.provider.user;

import com.google.common.collect.Maps;
import com.xiaozhameng.dubbo.sdy.api.entity.User;
import com.xiaozhameng.dubbo.sdy.api.service.UserService;

import java.util.*;

/**
 * 用户服务的具体实现
 * @author xiaozhameng
 * @date 2019-07-05
 */
public class UserServiceImpl implements UserService {

    /**
     * 本来需要调用dao层来实现业务逻辑，但是这里先暂时不使用数据库
     */

    public List<User> queryAllUser() {
        Map<String,User> userMap = Maps.newLinkedHashMap();
        userMap.put("001", new User("001", "1001", "张三", "21", "中关村软件园", "程序员"));
        userMap.put("001", new User("002", "1002", "李四", "27", "中关村软件园", "架构师"));
        System.out.println("=====服务者被调用了=====" + userMap.values());
        return new LinkedList<User>(userMap.values());
    }

    public User getUserByUserId(String userId) {
        return null;
    }
}
