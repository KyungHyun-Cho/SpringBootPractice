package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("������");
			add("1�� ����");
			add("2�� ����");
			add("3�� ����");
		}
	};	
	
	@PostMapping("/user/{id}/{name}")
	public String PostTest(@PathVariable("id") int userId, @PathVariable String name) {
		String before = userList.get(userId);
		userList.set(userId, name);
		return "Change User " + userId + ", Before : " + before + ", After : " + userList.get(userId);
	}
	
	@PostMapping("/user/{id}")
	public String PostTest1(@PathVariable("id") int userId, @RequestBody String name) {
		String before = userList.get(userId);
		userList.set(userId, name);
		return "Change User " + userId + ", Before : " + before + ", After : " + userList.get(userId);
	}
	
}
