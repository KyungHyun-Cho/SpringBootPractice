package com.example.springboot;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++)
			sb.append("<alert>Èþ ¼Ó¾ÒÁö?</alert><alert>¤²¤§¤²¤§?</alert>");
		return sb.toString();
	}

	@RequestMapping("/kunsoo")
	public String kunsoo() {
		return "Hello Poo!";
	}

}
