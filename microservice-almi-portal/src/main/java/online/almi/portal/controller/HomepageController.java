package online.almi.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomepageController
 * 
 * @author ChunYong-Zhang
 *
 */
@Controller
@RequestMapping("/homepage")
public class HomepageController {
	
	@RequestMapping("/init")
	public String init() {
		return "homepage";
	}
}
