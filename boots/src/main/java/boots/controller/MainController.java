package boots.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Scooter;
import boots.model.Seller;
import boots.model.Task;
import boots.service.ScooterService;
import boots.service.SellerService;
import boots.service.TaskService;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

@Controller
public class MainController {
	
	

	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";	
		
	}
	
	
	
	@GetMapping("task")
	public String hometask(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_TASK");
		return "task";	
		
	}
	
	
	
	@GetMapping("scooter")
	public String homescooter(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_SCOOTER");
		return "scooter";	
		
	}
	
	
	@GetMapping("seller")
	public String homeseller(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_SELLER");
		return "seller";	
		
	}
	
}
