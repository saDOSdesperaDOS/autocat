package com.alexauto.autocat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alexauto.autocat.entities.AutoPart;
import com.alexauto.autocat.services.AutoPartServices;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	    public ModelAndView getSearch() {
				ModelAndView mV = new ModelAndView();
				mV.addObject("modelAP", new AutoPart());
				mV.setViewName("search");
				return mV;
	    }
	 @RequestMapping(value = "/result", method = RequestMethod.GET)
	    public ModelAndView getResult(@ModelAttribute("modelAP") AutoPart autoPart ) {
		
			AutoPartServices a = new AutoPartServices();
			String leaderCode = autoPart.getLeaderCode();
			autoPart = a.find(leaderCode);
			ModelAndView mV = new ModelAndView();
			mV.addObject("modelAP", autoPart);
			mV.setViewName("result");
			return mV;
	
	    }
}
