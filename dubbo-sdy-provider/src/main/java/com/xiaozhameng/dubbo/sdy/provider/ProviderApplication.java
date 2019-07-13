package com.xiaozhameng.dubbo.sdy.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaozhameng
 * 服务提供者应用程序
 */
public class ProviderApplication {

    public static void main(String[] args) throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-provider.xml"});
        context.start();
        System.out.println("我是服务提供者，我启动了！！！");
        // 按任意键退出
        System.in.read();
    }

}
