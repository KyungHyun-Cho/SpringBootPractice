package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("관리자");
			add("1번 유저");
			add("2번 유저");
			add("3번 유저");
		}
	};	
	
	@DeleteMapping("/user/{id}")
	public String DeleteTest(@PathVariable int id) {
		if(userList.size() < id) {
			return "Not Exist Member";
		}else {
			String before = userList.toString();
			userList.remove(id);
			String after = userList.toString();
			return "Before : " + before + "\nAfter : " + after;
		}		
	}
	
	@DeleteMapping("/user")
	public String DeleteTest2(@RequestParam int id) {
		if(userList.size() < id) {
			return "Not Exist Member";
		}else {
			String before = userList.toString();
			userList.remove(id);
			String after = userList.toString();
			return "Before : " + before + "\nAfter : " + after;
		}	
	}
}
