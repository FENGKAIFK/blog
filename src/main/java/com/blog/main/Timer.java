package com.blog.main;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Timer {
	@RequestMapping("timer")
	public String tellTime() {
		System.out.println("--->timer");
		return new Date().toString();
	}
}
