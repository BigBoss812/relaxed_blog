package com.relaxed.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jerry
 * @version 1.0
 * @description 启动类
 * @Date 2019/8/5 13:13
 */
@SpringBootApplication
public class ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class,args);
        System.out.println("relaxed-blog runner success!");
    }

}
