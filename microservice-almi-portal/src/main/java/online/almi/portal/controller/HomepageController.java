package online.almi.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
/**
 * HomepageController
 * 
 * @author ChunYong-Zhang
 *
 */
@RequestMapping("/homepage")
public class HomepageController {
	
	@RequestMapping("/init")
	public String init() {
		return "homepage";
	}
}
