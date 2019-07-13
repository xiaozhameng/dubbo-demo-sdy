package com.xiaozhameng.dubbo.sdy.consumer;


import com.xiaozhameng.dubbo.sdy.api.entity.User;
import com.xiaozhameng.dubbo.sdy.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * 用户消费者
 *
 * @author xiaozhameng
 */
public class UserConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-consumer.xml"});
        context.start();
        // 获取远程服务代理
        UserService userService = (UserService) context.getBean("userService");

        List<User> users = userService.queryAllUser();
        // 显示调用结果
        System.out.println( users );

        // 阻塞便于观察
        System.in.read();
    }

}
