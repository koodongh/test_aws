package com.mult.myboot02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring_mvc.mybatis.IProductDAO;
import com.spring_mvc.mybatis.ProductController;

@SpringBootApplication
@ComponentScan(basePackageClasses = ProductController.class)
@ComponentScan
@MapperScan(basePackageClasses = IProductDAO.class)
public class Myboot02Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot02Application.class, args);
	}

}
