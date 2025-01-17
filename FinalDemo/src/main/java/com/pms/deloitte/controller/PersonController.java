package com.pms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Product());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	
	//For add and update person both
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Product p){
		System.out.println("#####product :"+p);
			this.personService.addPerson(p);
		return "redirect:/persons";
	}

	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute("person") Product p){
		System.out.println("#####product updating :"+p);
			this.personService.updatePerson(p);
		return "redirect:/persons";
	}
	
	
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.personService.removePerson(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.personService.getPersonById(id));
        model.addAttribute("listPersons", this.personService.listPersons());
        return "person";
    }
	
}
