package com.ignite.service;

import com.ignite.model.Employee;
import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeService employeeService ;

    @BeforeEach
    void setUp() {

//        employeeService = mock(IEmployeeService.class);

    }

    @AfterEach
    void tearDown() {
        employeeService = null;
    }

    @SneakyThrows
    @Test
    void findEmployeeById() {
        assertNotNull(employeeService);
        when(employeeService.findEmployeeById(1)).thenReturn(new Employee(1,"Kishor"));
        Employee employee = employeeService.findEmployeeById(1);
        assertEquals("Kishor",employee.getName());
    }

    @Test
    void findAllEmployees() {
        assertNotNull(employeeService);
        when(employeeService.findAllEmployees()).thenReturn(Arrays.asList(
                new Employee(101, "Kishor"),
                new Employee(102,"Rajesh"),
                new Employee(103,"Sagar")));
        int noEmps = employeeService.findAllEmployees().size();
        assertEquals(3, noEmps);
    }

    @Test
    void saveEmployee() {
        assertNotNull(employeeService);
        Employee emp = new Employee(0,"Ram") ;
        when(employeeService.saveEmployee(emp)).thenReturn(new Employee(1,"Ram"));
        Employee employee = employeeService.saveEmployee(emp);
        System.out.println(employee);
        assertEquals(1,employee.getId());
    }

    @SneakyThrows
    @Test
    void editEmployee() {
        assertNotNull(employeeService);
        Employee empEdit = new Employee(101,"Ram");
        when(employeeService.editEmployee(empEdit)).thenReturn(new Employee(101,"Ram"));
        Employee employee = employeeService.editEmployee(empEdit);
        assertEquals(empEdit.getName(), employee.getName());
    }

    @SneakyThrows
    @Test
    void deleteEmployee() {
        assertNotNull(employeeService);
        Employee empEdit = new Employee(101,"Ram");
        when(employeeService.deleteEmployee(empEdit.getId())).thenReturn(new Employee(101,"Ram"));
        Employee employee = employeeService.deleteEmployee(empEdit.getId());
        assertEquals(empEdit.getName(), employee.getName());
    }
}