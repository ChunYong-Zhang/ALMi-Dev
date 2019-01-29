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
@RequestMapping(value = "/homepage")
public class HomepageController {

	@RequestMapping(value = "/init")
	public String init() {
		return "homepage";
	}
}
