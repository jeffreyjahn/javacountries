package com.jeffreyahn.countries.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffreyahn.countries.models.Country;
import com.jeffreyahn.countries.models.Language;
import com.jeffreyahn.countries.services.ApiService;

@Controller
public class CountriesController {	
	private final ApiService apiServe;

	public CountriesController(ApiService apiServe) {
		this.apiServe = apiServe;
	}
	@RequestMapping("/")
	public String index(Model model) {
//		1.
//		List<Object[]> sloves = apiServe.allSloves();
//		for(Object[] item : sloves) {
//			String country_name = (String) item[0];
//			String language_name = (String) item[1];
//			Double language_percent = (Double) item[2];
//			System.out.println(country_name);
//			System.out.println(language_name);
//			System.out.println(language_percent);
//		}
		
//		2.
//		List<Object[]> cities = apiServe.countingCities();
//		for(Object[] item: cities) {
//			String country_name= (String) item[0];
//			Long city_count = (Long) item[1];
//			System.out.println(country_name.concat(" ").concat(Long.toString(city_count)));
//		}
//		3.
//		List<Object[]> mex = apiServe.texMex();
//		for(Object[] item: mex) {
//			String cName = (String) item[0];
//			int pop = (int) item[1]; 
//			System.out.println(cName.concat(" ").concat(Integer.toString(pop)));
//		}
//		
//		4.
//		List<Object[]> wat = apiServe.over89();
//		for(Object[] item: wat) {
//			String lang = (String) item[0];
//			String name = (String) item[1];
//			Double perc = (Double) item[2];
//			System.out.println(lang.concat(" ").concat(name).concat(" ").concat(Double.toString(perc)));
//		}
//		5.
//		List<Object[]> surf = apiServe.surfsUp();
//		for(Object[] item: surf) {
//			String name = (String) item[0];
//			Double wat = (Double) item[1];
//			int pop = (int) item[2];
//			System.out.println(name.concat(" ").concat(Double.toString(wat)).concat(Integer.toString(pop)));
//		}
//		6.
//		List<Object[]> wat = apiServe.number6();
//		for(Object[] item: wat) {
//			String name = (String) item[0];
//			String gov = (String) item[1];
//			Double surf = (Double) item[2];
//			Double life = (Double) item[3];
//			System.out.println(name.concat(" ").concat(gov).concat(" ").concat(Double.toString(surf)).concat(Double.toString(life)));
//		}
//		7.
//		List<Object[]> wat = apiServe.aires();
//		for(Object[] item: wat) {
//			String coname = (String) item[0];
//			String ciname = (String) item[1];
//			String dist = (String) item[2];
//			int pop = (int) item[3];
//			System.out.println(coname.concat(" ").concat(ciname).concat(" ").concat(dist).concat(" ").concat(Integer.toString(pop)));
//		}
		
//		8.
		List<Object[]> wat = apiServe.last();
		for(Object[] item: wat) {
			String reg = (String) item[0];
			Long num = (Long) item[1];
			System.out.println(reg.concat(" ").concat(Long.toString(num)));
		}
		
		
		
		
		return "index.jsp";
	}
}
