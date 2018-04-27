package com.bee.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class ThymeleafController {
	
    @RequestMapping("/")
  	public String home(Locale locale, Model model) {
  		return "index";
  	}
}