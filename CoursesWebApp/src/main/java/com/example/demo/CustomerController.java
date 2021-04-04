package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	CustomersRepo repo;

	@RequestMapping("/")
	public String courses() {
		return "form";
	}

	@RequestMapping("/details")
	public String details(Customers customer) {
		repo.save(customer);
		return "form";
	}

	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewCustomers";
	}

	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam int custId) {
		ModelAndView mv = new ModelAndView("retrieve");
		Customers customer = repo.findById(custId).orElse(null);
		mv.addObject(customer);
		return mv;

	}
}
