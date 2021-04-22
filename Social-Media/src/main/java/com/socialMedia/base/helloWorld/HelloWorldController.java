package com.socialMedia.base.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource msgSource;
	// GET
	// URI - hello-world
	// method - "Hello-World"

	// @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	/*
	 * @GetMapping(path = "/hello-world-internationalized") public String
	 * helloWorldInternationalied(@RequestHeader(name = "Accept-language", required
	 * = false) Locale locale) { return msgSource.getMessage("good.morning.message",
	 * null, locale); }
	 */

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalied() {
		//Alternate for request header is to 
		// get it from LocaleContextHolder
		return msgSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

	// hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	// hello-world-bean/path-variable/aritra
	@GetMapping(path = "hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World Bean, %s", name));
	}

}
