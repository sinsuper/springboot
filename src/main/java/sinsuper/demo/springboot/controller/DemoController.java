package sinsuper.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import sinsuper.demo.springboot.service.DemoService;
import sinsuper.demo.springboot.vo.DemoVo;

@Slf4j
@Controller
public class DemoController {

	@Autowired
	public DemoService demoService;
	
	@RequestMapping(value = "/main")
	public String main() {
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping(value = "demo/value")
	public String value() {
		return "값을 보낸다.";
	}
	
	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model) {
		DemoVo testModel = DemoVo.builder().
				memberNo(1L).
				id("sinsuper").
				name("신원출").
				build();
		
		model.addAttribute("testModel", testModel);
		
		demoService.selectDemo();
		log.info("thymeleafTest call");
		return "thymeleaf/thymeleafDemo";
	}
	
	@RequestMapping("/demo")
	public ModelAndView demo(ModelAndView mav) {
		mav.setViewName("thymeleaf/thymeleafDemo");
		List<DemoVo> list = demoService.selectDemo();
		log.info(String.valueOf(list));
		
		mav.addObject("list", list);
		return mav;
	}
	
}
