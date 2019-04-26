package com.godeltech.simplewebapp.service;


import com.godeltech.simplewebapp.domain.Employee;
import com.godeltech.simplewebapp.domain.enums.Gender;
import com.godeltech.simplewebapp.repository.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {


    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;
    @Before
    public void setUp() {
        Employee employee = new Employee(1L,"Igor","Kabushkov",4L,"developer",Gender.MALE,LocalDate.of(1998, 9, 8));

        Mockito.when(employeeRepository.findByIdEmployee(employee.getIdDepartment()))
                .thenReturn(employee);
    }
    @Test
    public void whenValidId_thenEmployeeShouldBeFound() {
        Long id = 1L;
        Employee found = employeeService.find(id);

        assertThat(found.getIdEmployee())
                .isEqualTo(id);
    }

    @Test
    public void getAllEmployee() {
    }

    @Test
    public void find() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void save() {
    }
}