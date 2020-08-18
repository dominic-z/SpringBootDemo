package com.example;

import com.example.utils.SpringContextUtil;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dominiczhu
 * @date 2020/8/12 10:19 上午
 */

@SpringBootApplication
public class HelloSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class,args);
        System.out.println(SpringContextUtil.applicationContext.getBean("argApple"));;
    }

}
