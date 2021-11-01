package com.yangls.dynamicsource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.yangls.dynamicsource.mapper")
public class DynamicsourceApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(DynamicsourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String bean:beanDefinitionNames) {
            System.out.println(bean);
        }

    }
}
