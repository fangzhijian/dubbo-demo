package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "dubbo.demo")
public class DubboDemoCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoCustomerApplication.class, args);
	}
}
