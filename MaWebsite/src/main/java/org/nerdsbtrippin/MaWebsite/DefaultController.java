package org.nerdsbtrippin.MaWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class DefaultController {
	@RequestMapping("/")
	String pageOne() {
		return "index";
	}
}
