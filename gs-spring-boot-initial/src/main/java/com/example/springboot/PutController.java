package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PutController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("������");
			add("1�� ����");
			add("2�� ����");
			add("3�� ����");
		}
	};	
	
	@PutMapping("/user/{name}")
	public String PutTest(@PathVariable String name) {
		String before = userList.toString();
		userList.add(name);
		String after = userList.toString();
		return "Before : " + before + "\nAfter : " + after;
	}
	
	@PutMapping("/user")
	public String PutTest2(@RequestBody String name) {
		String before = userList.toString();
		userList.add(name);
		String after = userList.toString();
		return "Before : " + before + "\nAfter : " + after;
	}
}
