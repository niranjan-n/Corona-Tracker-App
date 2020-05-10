package com.corona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.corona.service.CoronaVirusDataService;

@Controller
public class HomeController {

	@Autowired
	private CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model  model) {
		
		var allStats= coronaVirusDataService.getAllStats();
		var totalCases = allStats.stream().mapToInt(s-> s.getLatestCases()).sum();
		var totalNewCases = allStats.stream().mapToInt(s-> s.getPreviousDayCases()).sum();
		  model.addAttribute("locationStats", allStats);
		  model.addAttribute("totalCases", totalCases);
		  model.addAttribute("totalNewCases", totalNewCases);
		  return "home";
	}

}
