package com.fjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fjs.dto.MstCustomerDto;

@Controller()
public class T001Controller {
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("web/T001");
      MstCustomerDto model = new MstCustomerDto();
      mav.addObject("model", model);
      return mav;
   }
  
   @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
   public ModelAndView springMVCPage() {
      ModelAndView mav = new ModelAndView("springmvc");
      return mav;
   }
}
