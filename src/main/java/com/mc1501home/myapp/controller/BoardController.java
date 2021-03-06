package com.mc1501home.myapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="board")
public class BoardController {

	@RequestMapping(value="/{action}", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView) {
		String viewName="board/";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if("board".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
		}else if("write".equals(action)) {
			viewName = viewName+action;
		}else {
			viewName = viewName+"board";
		}
		
		modelandView.setViewName(viewName);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}
