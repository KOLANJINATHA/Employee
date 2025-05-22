package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/emp/api")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/postSingleEmp")
	public String postEmp(@RequestBody Employee e) {
		return es.postEmp(e);
	}
	
	@PostMapping(value="/postMultiple")
	public String postEmployee(@RequestBody List<Employee> e) {
		return es.postEmployee(e);
	}
	
	@GetMapping (value="/findById/{n}")
	public Employee FindById(@PathVariable int n) {
		return es.FindById(n);
	}
	
	@GetMapping (value="/findAll")
	public List<Employee> findAll(){
		return es.findAll();
	}
	
	@DeleteMapping (value="/deleteById/{n}")
	public String deleteById(@PathVariable int n) {
		return es.deleteById(n);
	}
	
	@PutMapping (value="/update/{n}")
	public String update(@PathVariable int n, @RequestBody Employee e) {
		return es.update(n,e);
	}
	
	@PatchMapping (value="/roleUpdate/{n}")
	public String roleUpdate(@PathVariable int n,@RequestBody Employee e) {
		return es.roleUpdate(n,e);
	}
	
	@GetMapping (value="/getMax")
	public Employee getMax() {
		return es.getMax();
	}
	
	@GetMapping(value="/getByName/{name}")
	public List<Employee> getByName(@PathVariable String name){
		return es.getByName(name);
	}
	
	@GetMapping(value="/getSalary/{num1}/{num2}")
	public List<Employee> getSalary(@PathVariable int num1,@PathVariable int num2){
		return es.getSalary(num1,num2);
	}
	
	@GetMapping(value="/getName")
	public List<String> getName(){
		return es.getName();
	}
	
	@GetMapping(value="/startsWith/{letter}")
	public List<Employee> startsWith(@PathVariable String letter){
		return es.startsWith(letter);
	}
	
	@GetMapping(value="/endsWith")
	public List<Employee> endsWith(@RequestParam String letter){
		return es.endsWith(letter);
	}
	
	@GetMapping(value="/secondCharacter/{let1}/{let2}")
	public List<String> secondCharacter(@PathVariable String let1, @PathVariable String let2){
		return es.secondCharacter(let1,let2);
	}
	
	@GetMapping(value="/ascendingOrder")
	public List<Employee> ascendingOrder(){
		return es.ascendingOrder();
	}
	
	@GetMapping(value="/descendingOrder")
	public List<Object> descendingOrder(){
		return es.descendingOrder();
	}
	
	@GetMapping(value="/maxSalary")
	public List<Employee> maxSalary(){
		return es.maxSalary();
	}
	
	@GetMapping(value="/groupingBy")
	public List<Integer>  groupingBy(){
		return es.groupingBy();
	}
	
	@GetMapping(value="/average")
	public Integer average() {
		return es.average();
	}
	
	@GetMapping(value="/secondMax")
	public Employee secondMax() {
		return es.secondMax();
	}
}
