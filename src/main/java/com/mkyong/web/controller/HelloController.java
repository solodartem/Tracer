package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	@ResponseBody
    public String get(@RequestParam Map<String,String> allRequestParams) {
        System.out.println("Invoke of GET method with parameters: " + allRequestParams);
        return "p1=5&p2=&p3=&p4=1&p5=0&p6=1&p7=0&p8=0&token=&CustomData=";

	}

}