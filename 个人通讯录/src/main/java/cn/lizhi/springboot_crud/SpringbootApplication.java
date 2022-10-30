package cn.lizhi.springboot_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "cn.lizhi.springboot_crud.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);


    }


}
