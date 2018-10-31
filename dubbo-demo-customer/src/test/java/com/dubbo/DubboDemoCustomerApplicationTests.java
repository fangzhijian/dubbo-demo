package com.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;
import dubbo.demo.model.User;
import dubbo.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboDemoCustomerApplication.class)
public class DubboDemoCustomerApplicationTests {

	@Reference
	private UserService userService;
	@Autowired
	private Gson gson;

	@Test
	public void contextLoads() {
		User user = userService.getUserById(1);
		System.out.println(gson.toJson(user));
	}

}
