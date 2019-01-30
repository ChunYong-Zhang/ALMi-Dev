package online.almi.portal.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import online.almi.portal.service.HomepageService;

/**
 * HomepageController
 * 
 * @author ChunYong-Zhang
 *
 */
@Controller
@RequestMapping(value = "/homepage")
public class HomepageController {
	
	@Resource
	HomepageService homepageService;

	@RequestMapping(value = "/init")
	public String init() {
		return "homepage";
	}
}
