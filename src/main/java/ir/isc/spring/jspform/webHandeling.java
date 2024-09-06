package ir.isc.spring.jspform;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;


@Controller
public class webHandeling {
	@GetMapping(value = "/")
	@ResponseBody
	public View index(){
		return new JstlView("/front/index.jsp");
	}
	@GetMapping(value = "/formRegister")
	@ResponseBody
	public View test(){
		return new JstlView("/front/formRegister.jsp");
	}
	@PostMapping(value = "/savedata")
	@ResponseBody
	public String saveDate(@RequestParam String name){
		return name;
	}

}
