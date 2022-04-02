package com.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.constant.ConstantVariable;
import com.example.mvc.model.Employee;
import com.example.mvc.repository.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
	public String listEmployeeList(Model model) {
		List<Employee> employeeList = this.employeeRepository.findAll();
		model.addAttribute(ConstantVariable.EMPLOYEE_LIST, employeeList);
		return "listEmployee";
	}

	@RequestMapping(value = "/addEmployeePage", method = RequestMethod.GET)
	public String addEmployeePage() {
		return "addEmployee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployeePage(Employee employee) {
		employeeRepository.save(employee);
		return "redirect:/employee/listEmployee";
	}

}
