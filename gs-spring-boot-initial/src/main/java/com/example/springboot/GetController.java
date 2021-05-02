package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("������");
			add("1�� ����");
			add("2�� ����");
			add("3�� ����");
		}
	};	
	
	
	@GetMapping("/user")
	public String getTest() {
		return userList.toString();
	}
	
	/*@GetMapping("/user")
	public String getTest2(@RequestParam("id") int userId) {
		return "Return user : " + userList.get(userId);
	}*/
	
	@GetMapping("/user/{id}")
	public String getTest3(@PathVariable("id") int userId) {
		return "Return user : " + userList.get(userId);
	}
}
