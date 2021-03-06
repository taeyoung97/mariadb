package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.MariaDomain;
import com.example.demo.service.MariaService;



//사용자의 요청을 처리 한 후 지정된 뷰에 모델 객체를 넘겨주는 역할
@Controller
public class HomeController{
	//필요한 의존 객체의 타입에 해당하는 빈을 찾아 주입
	//Spring Ioc 컨테이너가 관리하는 자바 객체를 빈이라는 용어로 부른다
	@Autowired MariaService mad;
	//요청 URL을 어떤 메서드가 처리할지 mapping해주는 어노테이션 ****
	
	@RequestMapping(value = "/home", method=RequestMethod.GET) 
	public ModelAndView goHome(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView(); 
		
		List<MariaDomain> resultList = new ArrayList<MariaDomain>(); 
		

		resultList = mad.readAll();
		
		mav.addObject("resultList",resultList); 
		mav.setViewName("home"); 
		
		return mav;

	}

}
