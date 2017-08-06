package com.atguigu.bbs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName Application
 * @author Administrator
 * @Date 2017年8月6日 下午12:30:16
 * @version 1.0.0
 */
@SpringBootApplication
@ComponentScan("com.atguigu.bbs")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }
}
