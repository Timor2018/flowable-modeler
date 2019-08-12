package com.example.flowablemodeler;

import com.example.flowablemodeler.conf.AppDispatcherServletConfiguration;
import com.example.flowablemodeler.conf.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 主程序
 *      1.引入重写的两个配置类
 *      2.排除spring-security认证 实现免登陆
 *
 * @ClassName: FlowableApplication
 * @author: Jack Chan
 * @date: 2019/6/17  10:33
 */
@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
@SpringBootApplication(
        exclude = {SecurityAutoConfiguration.class})
public class FlowableModelerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableModelerApplication.class, args);
    }

}
