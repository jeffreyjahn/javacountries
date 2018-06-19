package com.jeffreyahn.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeffreyahn.countries.repositories.CityRepository;
import com.jeffreyahn.countries.repositories.CountryRepository;
import com.jeffreyahn.countries.repositories.LanguageRepository;

@Service
public class ApiService {
	private final CountryRepository countryRepo;
	private final CityRepository cityRepo;
	private final LanguageRepository languageRepo;
	public ApiService(CountryRepository countryRepo, CityRepository cityRepo, LanguageRepository languageRepo) {
		this.countryRepo = countryRepo;
		this.cityRepo = cityRepo;
		this.languageRepo = languageRepo;
	}
	public List<Object[]> allSloves(){
		return countryRepo.sloveneJoin();
	}
	public List<Object[]> countingCities(){
		return countryRepo.cityCount();
	}
	public List<Object[]> texMex(){
		return countryRepo.mexCityPop();
	}
	public List<Object[]> over89(){
		return countryRepo.over9000();
	}
	public List<Object[]> surfsUp(){
		return countryRepo.surfPop();
	}
	public List<Object[]> number6(){
		return countryRepo.num6();
	}
	public List<Object[]> aires(){
		return countryRepo.buenos();
	}
	public List<Object[]> last(){
		return countryRepo.yum();
	}
	
	
}
