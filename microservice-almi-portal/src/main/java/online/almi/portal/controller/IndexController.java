package online.almi.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 * 
 * @author ChunYong-Zhang
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/")
	public String init() {
		return "index";
	}
}
