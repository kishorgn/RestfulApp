package com.ignite.service;

import com.ignite.exception.EmployeeNotFound;
import com.ignite.model.Employee;

import java.util.List;

public interface IEmployeeService {

    /**
     * Find a single Employee object based on the provided id.
     * @param id of the Employee which we wish to find.
     * @return the Employee object if it found based on the given ID.
     * @throws EmployeeNotFound if there is no Employee existing with the given ID.
     */
    Employee findEmployeeById(int id) throws EmployeeNotFound;


    /**
     * Find all of the Employees existing in the system.
     * @return all of the employees as List<>.
     */
    List<Employee> findAllEmployees();


    /**
     * Save a single Employee object
     * @param employee which we wish to save in the System. And this object don't have the value in the ID field.
     * @return the successfully saved Employee object. This object will have value in the ID field.
     */
    Employee saveEmployee(Employee employee);


    /**
     * Edit or modify the content of an existing Employee object. ID of the employee can't be edited.
     * @param employee the object which you wish to modify. Search will carried based on the ID of the argument.
     * @return the object with updated data.
     * @throws EmployeeNotFound
     */
    Employee editEmployee(Employee employee) throws EmployeeNotFound;


    /**
     * Delete an Employee object based on the ID of the employee has passed as argument.
     * @param id of the employee which you wish to delete.
     * @return the deleted employee object upon succesfully deleted.
     * @throws EmployeeNotFound is to be thrown when there is no Employee found for the given ID.
     */
    Employee deleteEmployee(int id) throws EmployeeNotFound;
}
