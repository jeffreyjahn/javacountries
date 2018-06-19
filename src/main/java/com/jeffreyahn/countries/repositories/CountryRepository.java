package com.jeffreyahn.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffreyahn.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	List<Country> findAll();
	
	
//	1. What query would you run to get all the countries that speak Slovene? Your query should return the name of the country, language, and language percentage. Your query should arrange the result by language percentage in descending order. 
	@Query("SELECT c.name, l.language, l.percentage from Country c JOIN c.languages l WHERE l.language='Slovene' ORDER BY l.percentage DESC")
	List<Object[]> sloveneJoin();
	
//	2. What query would you run to display the total number of cities for each country? Your query should return the name of the country and the total number of cities. Your query should arrange the result by the number of cities in descending order.
	@Query("SELECT c.name, COUNT(city.id) AS city_count FROM Country c JOIN c.cities city GROUP BY c.name ORDER BY city_count DESC")
	List<Object[]> cityCount();
	
//	3. What query would you run to get all the cities in Mexico with a population of greater than 500,000? Your query should arrange the result by population in descending order.
	@Query("SELECT ci.name, ci.population FROM Country co JOIN co.cities ci WHERE co.name = 'Mexico' AND ci.population > 500000 ORDER BY ci.population DESC")
	List<Object[]> mexCityPop();
//	4.What query would you run to get all languages in each country with a percentage greater than 89%? Your query should arrange the result by percentage in descending order.
	@Query("SELECT l.language, c.name, l.percentage FROM Country c JOIN c.languages l WHERE l.percentage > 89.0 ORDER BY l.percentage DESC")
	List<Object[]> over9000();
//	5.What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?
	@Query("SELECT c.name, c.surface_area, c.population FROM Country c WHERE c.surface_area < 501 AND c.population > 100000")
	List<Object[]> surfPop();
//	6.What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years?
	@Query("SELECT c.name, c.government_form, c.surface_area, c.life_expectancy FROM Country c WHERE c.government_form = 'Constitutional Monarchy' AND c.surface_area > 200 AND c.life_expectancy > 75")
	List<Object[]> num6();
//	7.What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000? The query should return the Country Name, City Name, District, and Population.
	@Query("SELECT co.name, ci.name, ci.district, ci.population FROM Country co JOIN co.cities ci WHERE co.name='Argentina' AND ci.district='Buenos Aires' AND ci.population > 500000")
	List<Object[]> buenos();
//	8.What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. Also, the query should arrange the result by the number of countries in descending order.
	@Query("SELECT co.region, COUNT(co.name) AS country_count FROM Country co GROUP BY co.region ORDER BY country_count DESC")
	List<Object[]> yum();
}
