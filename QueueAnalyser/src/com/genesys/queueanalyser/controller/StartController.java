package com.genesys.queueanalyser.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/queue")
public class StartController {

	private Logger log = Logger.getLogger("StartController");
	/**
	 * @param args
	 */
	@RequestMapping(value="/start",method = RequestMethod.GET)
	public @ResponseBody String gotoStart(ModelMap model, HttpServletRequest request)
	{
		log.info("SDSdsdadas");
		System.out.println("Called start controller123");
		return "login";
	}
}
