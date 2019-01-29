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
@RequestMapping(value = "/")
public class IndexController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
