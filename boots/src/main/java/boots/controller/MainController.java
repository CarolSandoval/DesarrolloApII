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
	@Autowired
	private TaskService taskService;
	@Autowired
	private SellerService sellerService;
	@Autowired
	private ScooterService scooterService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/all-tasks")
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/new-task")
	public String newTasks(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@GetMapping("/update-task")
	public String updateTasks(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", taskService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-task")
	public String deleteTasks(@RequestParam int id, HttpServletRequest request){
		taskService.delete(id);
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@PostMapping("/save-task")
	public String saveTask(@ModelAttribute Task task,
			BindingResult bindingResult, HttpServletRequest request){
		taskService.save(task);
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}

	
	
	
	@GetMapping("/all-sellers")
	public String allSellers(HttpServletRequest request){
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "index";
	}
	
	@GetMapping("/new-seller")
	public String newSellers(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW_SELLER");
		return "index";
	}
	
	@GetMapping("/update-seller")
	public String updateSellers(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("seller", sellerService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE_SELLER");
		return "index";
	}
	
	@GetMapping("/delete-seller")
	public String deleteSellers(@RequestParam int id, HttpServletRequest request){
		sellerService.delete(id);
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "index";
	}
	
	@PostMapping("/save-sellers")
	public String saveSeller(@ModelAttribute Seller seller,
			BindingResult bindingResult, HttpServletRequest request){
		sellerService.save(seller);
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "index";
	}

	
	

	
	
	
	
	
	@GetMapping("/all-scooters")
	public String allScooters(HttpServletRequest request){
		request.setAttribute("scooters", scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "index";
	}
	
	@GetMapping("/new-scooter")
	public String newScooters(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW_SCOOTER");
		return "index";
	}
	
	@GetMapping("/update-scooters")
	public String updateScooters(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("scooter", scooterService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE_SCOOTER");
		return "index";
	}
	
	@GetMapping("/delete-scooter")
	public String deleteScooters(@RequestParam int id, HttpServletRequest request){
		scooterService.delete(id);
		request.setAttribute("scooters",scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "index";
	}
	
	@PostMapping("/save-scooter")
	public String saveScooters(@ModelAttribute Scooter scooter,
			BindingResult bindingResult, HttpServletRequest request){
		scooterService.save(scooter);
		request.setAttribute("scooters", scooterService.findAll());
		request.setAttribute("mode", "MODE_SCOOTERS");
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
