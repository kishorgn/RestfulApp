package com.ignite.service;

import com.ignite.exception.EmployeeNotFound;
import com.ignite.model.Employee;
import com.ignite.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee findEmployeeById(int id) throws  EmployeeNotFound{
        Employee employee = employeeRepository.findById(id).get();
        if(employee == null){
            throw new EmployeeNotFound("Employee not found with id : "+id);
        }
        return employee;
    }

    @Override
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Employee editEmployee(Employee employee) throws EmployeeNotFound {
        Employee emp = employeeRepository.findById(employee.getId()).get();
        if(emp == null){
            throw new EmployeeNotFound("Employee not found with id : "+employee.getId());
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee deleteEmployee(int id) throws EmployeeNotFound {
        Employee employee = employeeRepository.findById(id).get();
        if(employee == null){
            throw new EmployeeNotFound("Employee not found with id : "+id);
        }
        employeeRepository.deleteById(id);
        return employee;
    }
}
