package com.fjs.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fjs.dto.MstCustomerDto;
import com.fjs.service.IMstCustomerService;
import com.fjs.util.MessageUtil;

@Controller(value = "t003ControllerOfWeb")
public class T003Controller {
	@Autowired
	private IMstCustomerService customerService;
	
	@Autowired
	private MessageUtil messageUtil;
	
	@RequestMapping(value = "/T003/chinh-sua", method = RequestMethod.POST)
	public ModelAndView editCustomer(@RequestParam(value = "id", required = false) Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		MstCustomerDto model = new MstCustomerDto();
		if (id != null) {
			model = customerService.findById(id);
		}
		if (request.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(request.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
	
}
