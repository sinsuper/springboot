package sinsuper.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping(value="demo/restvalue")
	public String restvalue() {
		return "레스트 컨트롤러 데모";
	}
}
