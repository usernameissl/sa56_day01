package sg.edu.nus.iss.sa56_day01.service;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.sa56_day01.model.Employee;

import java.util.*;


@Service
public class EmployeeService {
    
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeService(){
        employees.add(new Employee("1", "Hi", "Hi"));
        employees.add(new Employee("2", "Hello", "Hello"));
        employees.add(new Employee("3", "Bye", "Bye"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName){
        List<Employee> fiterEmployees = employees.stream().filter(emp -> emp.getLastName().equals
                                        (lastName)).toList();
        return fiterEmployees;
    }
}
