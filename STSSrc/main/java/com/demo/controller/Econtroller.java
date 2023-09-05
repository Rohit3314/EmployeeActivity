package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.Erepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Econtroller 
{

	@Autowired
	private Erepository erepo;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public Employee insertrecord(@RequestBody Employee e1)
	{
		return this.erepo.save(e1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public Employee updaterecord(@RequestBody Employee e1)
	{
		return this.erepo.save(e1);
	}

	@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/deleterecord")
    public void deleterecord(@RequestBody Employee e1)
    {
		 this.erepo.delete(e1);
    }

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewrecord")
	public List<Employee> viewrecord()
	{
		return this.erepo.findAll();
	}
}






