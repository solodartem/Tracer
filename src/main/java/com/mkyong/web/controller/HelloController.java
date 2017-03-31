package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	@ResponseBody
    public String get(ModelMap model) {
        System.out.println("Invoke of GET method");
        return "hello";

	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ResponseBody
    public String post(ModelMap model) {
        System.out.println("Invoke of GET method");
        return "hello";

	}

}