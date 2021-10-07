package com.ignite;

import com.ignite.model.Department;
import com.ignite.model.Employee;
import com.ignite.service.DepartmentService;
import com.ignite.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class RestfulAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctxt = SpringApplication.run(RestfulAppApplication.class, args);
        System.out.println("Welcome");

//        DepartmentService departmentService = ctxt.getBean(DepartmentService.class);
//        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);

//        Department department1 = new Department();
//        department1.setName("Sales");
//
//        Employee employee1 = new Employee();
//        employee1.setName("Kishor");
//        employee1.setDepartment(department1);
//
//        Employee employee2 = new Employee();
//        employee2.setName("Kumar");
//        employee2.setDepartment(department1);
//
//        department1.getEmployees().add(employee1);
//        department1.getEmployees().add(employee2);
//
//        departmentService.saveDepartment(department1);
//
//        employeeService.saveEmployee(employee1);
//        employeeService.saveEmployee(employee2);

//        List<Department> departments = departmentService.findAllDepartments();
//        for(Department department : departments){
//            System.out.println("Department Name : "+department.getName());
//            System.out.println("List of Employees");
//            List<Employee> employees = department.getEmployees();
//            for(Employee employee : employees){
//                System.out.println("ID : "+employee.getId());
//                System.out.println("Name : "+employee.getName());
//            }
//        }
    }

}
