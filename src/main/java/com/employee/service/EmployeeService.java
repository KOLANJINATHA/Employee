package com.employee.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public String postEmp(Employee e) {
		return ed.postEmp(e);
	}
	
	public String postEmployee(List<Employee> e) {
		return ed.postEmployee(e);
	}
	
	public Employee FindById(int n) {
		return ed.FindById(n);
	}
	
	public List<Employee> findAll(){
		return ed.findAll();
	}
	
	public String deleteById(int n) {
		return ed.deleteById(n);
	}
	
	public String update(int a,Employee e) {
		return ed.update(a,e);
	}
	
	public String roleUpdate(int a,Employee e) {
		return ed.roleUpdate(a,e);
	}
	
	//methods
	public Employee getMax() {
		List<Employee> x=ed.findAll();
		
		Employee e=x.stream().max(Comparator.comparing(Employee::getAge)).get();
		return e;
	}

	public List<Employee> getByName(String name) {
		
		return ed.getByName(name);
	}

	public List<Employee> getSalary(int num1, int num2) {
		
		return ed.getSalary(num1,num2);
	}

	public List<String> getName() {
		
		return ed.getName();
	}

	public List<Employee> startsWith(String letter) {
		
		return ed.startsWith(letter);
	}

	public List<Employee> endsWith(String letter) {
		
		return ed.endsWith(letter);
	}

	public List<String> secondCharacter(String let1, String let2) {
		
		return ed.secondCharacter(let1,let2);
	}

	public List<Employee> ascendingOrder() {
		
		return ed.ascendingOrder();
	}

	public List<Object> descendingOrder() {
		
		return ed.descendingOrder();
	}

	public List<Employee> maxSalary() {
		
		return ed.maxSalary();
	}

	public List<Integer> groupingBy() {
		
		return ed.groupingBy();
	}

	public Integer average() {
		
		return ed.average();
	}

	public Employee secondMax() {
	
		return ed.secondMax();
	}

}
