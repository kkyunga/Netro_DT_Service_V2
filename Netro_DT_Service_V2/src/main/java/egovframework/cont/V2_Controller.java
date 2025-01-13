package egovframework.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V2_Controller {
	
	@GetMapping("/test")
	public String getTestString() {
		return "Trigger success!!qqwe";
	}
}
