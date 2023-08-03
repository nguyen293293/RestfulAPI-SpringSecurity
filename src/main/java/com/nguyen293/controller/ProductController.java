package com.nguyen293.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyen293.entity.Product;
import com.nguyen293.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid") Optional<String> cid) {
		List<Product> products;
		if(cid.isPresent()) {
			products = productService.findByCategoryId(cid.get());
		}else {
			products = productService.findAll();
		}
		model.addAttribute("products", products);
		return "/product/list";
	}
	
	@RequestMapping("/product/detail/{id}")
	public String detail(@PathVariable("id") Integer id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("p", product);
		return "/product/detail";
	}
}
