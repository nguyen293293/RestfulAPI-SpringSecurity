package com.nguyen293.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/view")
	public String view() {
		return "order/checkout";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "order/list";
	}
	
	@RequestMapping("/detail/{id}")
	public String detail() {
		return "order/detail";
	}
}
