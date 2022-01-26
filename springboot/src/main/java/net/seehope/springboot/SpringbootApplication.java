package net.seehope.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//是Sprnig Boot项目的核心注解，目的是开启自动配置
@MapperScan("net.seehope.**.mapper")
//指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
@ComponentScan(basePackages = {"net.seehope"})
//告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。
@EnableAsync
@EnableScheduling
@EnableSwagger2
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
