package com.godeltech.simplewebapp.repository;

import com.godeltech.simplewebapp.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

        Employee findByIdEmployee(Long id);

        void deleteByIdEmployee(Long id);
        }
