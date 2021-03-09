package com.example.test;

import com.example.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class TestApplicationTests {

	@Autowired
	DataSource dataSource;
	@Autowired
	UserService userService;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}

	@Test
	public void testGetUserByName(){
		System.out.println(userService.getUserByName("test1"));
	}

}
