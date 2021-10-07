package com.ignite.service;

import com.ignite.exception.DepartmentNotFound;
import com.ignite.model.Department;
import com.ignite.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository ;

    public Department findDepartmentById(int id) throws DepartmentNotFound {
        Department department = departmentRepository.findById(id).get();
        if(department == null){
            throw new DepartmentNotFound("Department not found with id : "+id);
        }
        return department;
    }

    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department){
        System.out.println(departmentRepository);
        return departmentRepository.save(department);
    }

    public Department editDepartment(Department department) throws DepartmentNotFound {
        Department deptEdit = departmentRepository.findById(department.getId()).get();
        if(deptEdit == null){
            throw new DepartmentNotFound("Department not found with id : "+department.getId());
        }
        return departmentRepository.save(department);
    }

    public Department deleteDepartment(int id) throws DepartmentNotFound {
        Department deptDel = departmentRepository.findById(id).get();
        if(deptDel == null){
            throw new DepartmentNotFound("Department not found with id : "+id);
        }
        departmentRepository.deleteById(id);
        return deptDel;
    }

}
