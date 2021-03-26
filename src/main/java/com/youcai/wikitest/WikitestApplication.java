package com.youcai.wikitest;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

// @ComponentScan({"com.youcai.wikitest", "com.youcai.test"}) // 支持同时扫描多个包
@ComponentScan("com.youcai")
@MapperScan("com.youcai.wikitest.mapper")
@SpringBootApplication
public class WikitestApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(WikitestApplication.class);

	public static void main(String[] args) {
		// SpringApplication.run(WikitestApplication.class, args);
		SpringApplication app = new SpringApplication(WikitestApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOGGER.info("启动成功！");
		LOGGER.info("地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
