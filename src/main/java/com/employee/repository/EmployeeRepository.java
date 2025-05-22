package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.Employee;

public interface   EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select e from Employee e where e.name like :name")
	List<Employee> getByName( @Param("name")String name);
	
	@Query(value="select e from Employee e where e.salary>= :num1 and e.salary<= :num2")
	List<Employee> getSalary(int num1, int num2);
	
	@Query(value="select name from Employee")
	List<String> getName();
	
	@Query(value="select e from Employee e where e.name like concat(:letter,'%')")
	List<Employee> startsWith(@Param("letter") String letter);
	
	@Query(value="select e from Employee e where e.name like concat('%', :letter)")
	List<Employee> endsWith(@Param("letter") String letter);
	
	@Query(value="select name from Employee where name like concat('_',:let1,'%',:let2,'_') ")
	List<String> secondCharacter(@Param("let1")String let1,@Param("let2") String let2);
	
	@Query(value="select e from Employee e order by name")
	List<Employee> ascendingOrder();
	
	@Query(value="select id,name,salary from Employee  order by salary desc")
	List<Object> descendingOrder();
	
	@Query(value="select e from Employee e order by salary desc limit 1 ")
	List<Employee> maxSalary();
	
	@Query(value="select salary from Employee group by salary")
	List<Integer> groupingBy();
	
	@Query(value="select avg(salary) from Employee ")
	Integer average();
	
	@Query(value="select e from Employee e where e.salary=(select max(e2.salary) from Employee e2  where e2.salary < (select max(e3.salary) from Employee e3))")
	Employee secondMax();	
	

	

}
