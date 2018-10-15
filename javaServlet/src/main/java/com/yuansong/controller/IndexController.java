package com.yuansong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @author  袁松 
 * @date 创建时间：2018年10月8日 下午3:37:55 
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String test1(){
		return "index";
	}
	@RequestMapping("/hhh")
	public String test2(){
		return "hhh";
	}
	@RequestMapping("/ds")
	String home() {
		return "Hello World!";
	}
}
