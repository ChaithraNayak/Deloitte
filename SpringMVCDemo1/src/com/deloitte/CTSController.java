package com.deloitte;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CTSController {

	@RequestMapping("/applefew")
	public String gg(){
		return "balls";
	}
	
	
}
