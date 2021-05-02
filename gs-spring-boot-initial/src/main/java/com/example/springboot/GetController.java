package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("관리자");
			add("1번 유저");
			add("2번 유저");
			add("3번 유저");
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
