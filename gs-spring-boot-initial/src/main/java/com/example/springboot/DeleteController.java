package com.example.springboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteController {

	ArrayList<String> userList = new ArrayList<String>() {
		{
			add("������");
			add("1�� ����");
			add("2�� ����");
			add("3�� ����");
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
