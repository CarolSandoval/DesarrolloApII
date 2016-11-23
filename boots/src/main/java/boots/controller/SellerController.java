package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Seller;
import boots.service.SellerService;



@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	
	
	
	
	@GetMapping("/all-sellers")
	public String allSellers(HttpServletRequest request){
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "seller";
	}
	
	@GetMapping("/new-seller")
	public String newSellers(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "seller";
	}
	
	@GetMapping("/update-seller")
	public String updateSellers(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("seller", sellerService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "seller";
	}
	
	@GetMapping("/delete-seller")
	public String deleteSellers(@RequestParam int id, HttpServletRequest request){
		sellerService.delete(id);
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "seller";
	}
	
	@PostMapping("/save-sellers")
	public String saveSeller(@ModelAttribute Seller seller,
			BindingResult bindingResult, HttpServletRequest request){
		sellerService.save(seller);
		request.setAttribute("sellers", sellerService.findAll());
		request.setAttribute("mode", "MODE_SELLERS");
		return "seller";
	}

	

}
