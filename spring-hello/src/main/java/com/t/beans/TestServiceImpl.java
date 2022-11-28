package com.t.beans;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {

	/**
	 *
	 * @param name
	 * @param age
	 * @return
	 * @throws RuntimeException
	 */
	public String sayHello(String name,String age) throws RuntimeException{
		return "hello"+name;
	}
	
}
