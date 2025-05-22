package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String postEmp(Employee e) {
		er.save(e);
		return "Saved Successfully";
	}
	
	public String postEmployee(List<Employee> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}
	
	public Employee FindById(int n) {
		return er.findById(n).get();
	}
	
	public List<Employee> findAll() {
		return er.findAll();
	}
	
	public String deleteById(int n) {
		er.deleteById(n);
		return "Deleted Successfully";
	}
	
	public String update(int a,Employee e) {
		Employee x=er.findById(a).get();
		x.setName(e.getName());
		x.setAge(e.getAge());
		x.setGender(e.getGender());
		x.setSalary(e.getSalary());
		x.setRole(e.getRole());
		er.save(x);
		return "Updated Successfully";
	}
	
	public String roleUpdate(int a,Employee e) {
		Employee x=er.findById(a).get();
		x.setRole(e.getRole());
		er.save(x);
		return "Updated";
	}

	public List<Employee> getByName(String name) {
		
		return er.getByName(name);
	}

	public List<Employee> getSalary(int num1, int num2) {
		
		return er.getSalary(num1,num2);
	}

	public List<String> getName() {
		
		return er.getName();
	}

	public List<Employee> startsWith(String letter) {
		
		return er.startsWith(letter);
	}

	public List<Employee> endsWith(String letter) {
		
		return er.endsWith(letter);
	}

	public List<String> secondCharacter(String let1, String let2) {
		
		return er.secondCharacter(let1,let2);
	}

	public List<Employee> ascendingOrder() {
		
		return er.ascendingOrder();
	}

	public List<Object> descendingOrder() {
		
		return er.descendingOrder();
	}

	public List<Employee> maxSalary() {
		
		return er.maxSalary();
	}

	public List<Integer> groupingBy() {
		
		return er.groupingBy();
	}

	public Integer average() {
		
		return er.average();
	}

	public Employee secondMax() {
		
		return er.secondMax();
	}

}
