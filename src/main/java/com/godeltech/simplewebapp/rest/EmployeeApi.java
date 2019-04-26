package com.godeltech.simplewebapp.rest;

import com.godeltech.simplewebapp.domain.Employee;
import com.godeltech.simplewebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@CrossOrigin
public class EmployeeApi {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    private List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmployeeById/{id}")
    private Employee getEmployeeById(@PathVariable Long id){
        return employeeService.find(id);
    }

    @PostMapping("/postEmployee")
    private void postEmployee(@RequestBody Employee employee ){
        employeeService.save(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    private ResponseEntity deleteEmployeeById(@PathVariable Long id){
        System.out.println(id);
        employeeService.delete(id);
        return ResponseEntity.ok().build();
    }
}
