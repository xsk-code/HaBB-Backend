package com.sankan.habbcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sankan.habbcenter.mapper")
public class HabbCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HabbCenterApplication.class, args);
	}

}
