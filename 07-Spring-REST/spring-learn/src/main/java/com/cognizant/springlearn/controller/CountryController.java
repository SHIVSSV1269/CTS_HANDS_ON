package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    /** GET /country -> India loaded from spring XML configuration. */
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START getCountryIndia()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("india");
        LOGGER.info("END getCountryIndia()");
        return country;
    }

    /** GET /countries -> full list from country.xml. */
    @GetMapping("/countries")
    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {
        LOGGER.info("START getAllCountries()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        LOGGER.info("END getAllCountries()");
        return countryList;
    }

    /** GET /countries/{code} -> single country, case-insensitive. */
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START getCountry() code={}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END getCountry()");
        return country;
    }
}
