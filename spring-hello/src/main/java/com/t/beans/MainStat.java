package com.t.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @description: 启动类
 * @auther: TanChuSheng
 * @date: 2022/6/17 23:32
 */
@Configuration
@ComponentScan("com.t.beans")
public class MainStat {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainStat.class);
		TestServiceImpl testService = context.getBean(TestServiceImpl.class);
		System.out.println(testService.sayHello("小明","10"));
	}


}
