package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Scooter;
import boots.service.ScooterService;



@Controller
public class ScooterController {
	@Autowired
	private ScooterService scooterService;
	
	
	@GetMapping("/all-scooters")
	public String allScooters(HttpServletRequest request){
		request.setAttribute("scooters", scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "scooter";
	}
	
	@GetMapping("/new-scooter")
	public String newScooters(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "scooter";
	}
	
	@GetMapping("/update-scooters")
	public String updateScooters(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("scooter", scooterService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "scooter";
	}
	
	@GetMapping("/delete-scooter")
	public String deleteScooters(@RequestParam int id, HttpServletRequest request){
		scooterService.delete(id);
		request.setAttribute("scooters",scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "scooter";
	}
	
	@PostMapping("/save-scooter")
	public String saveScooters(@ModelAttribute Scooter scooter,
			BindingResult bindingResult, HttpServletRequest request){
		scooterService.save(scooter);
		request.setAttribute("scooters", scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "scooter";
	}
	
	

}
