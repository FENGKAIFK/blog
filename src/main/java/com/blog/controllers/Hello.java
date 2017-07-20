package com.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entities.BlogProperties;

@RestController
public class Hello {
	@Autowired
	private BlogProperties blogProperties;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String say() {
		return blogProperties.getWords() + " " + blogProperties.getLocation();
	}
}
