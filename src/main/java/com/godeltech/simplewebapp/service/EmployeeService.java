package com.godeltech.simplewebapp.service;

import com.godeltech.simplewebapp.domain.Employee;
import com.godeltech.simplewebapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee find(Long id) {
        return employeeRepository.findByIdEmployee(id);
    }

    public void delete(Long id){
        employeeRepository.deleteByIdEmployee(id);
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

}