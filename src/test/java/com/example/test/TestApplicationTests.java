package com.example.test;

import com.example.test.service.OrnamentService;
import com.example.test.service.UserService;
import com.example.test.service.WorkService;
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
	@Autowired
	OrnamentService ornamentService;
	@Autowired
	WorkService workService;

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

	@Test
	public void testGetOrnament(){
		System.out.println(ornamentService.getOrnaments());
	}

	@Test
	public void testGetWork(){
		System.out.println(workService.getAllWork());
	}

	@Test
	public void testInsertWork(){
		workService.insertWork("http://1.15.114.144:8080/photo/clo103.jpg");
		System.out.println(workService.getAllWork());
	}
}
