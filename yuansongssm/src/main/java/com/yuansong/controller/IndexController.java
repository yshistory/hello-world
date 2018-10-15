package com.yuansong.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/** 
 * @author  袁松 
 * @date 创建时间：2018年10月8日 下午9:05:25 
 */
@RestController
public class IndexController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView ftlIndex() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("index");
        return model;
    }
}
