//package com.godeltech.simplewebapp.repository;
//
//import com.godeltech.simplewebapp.domain.Employee;
//import com.godeltech.simplewebapp.domain.enums.Gender;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.assertj.core.api.Assertions.*;
//
//import java.time.LocalDate;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class EmployeeRepositoryIntegrationTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Test
//    public void whenfindById_thenReturnEmployee() {
//        // given
////        Employee employee = new Employee(1L,"Igor","Kabushkov",4L,"developer",Gender.MALE,LocalDate.of(1998, 9, 8));
////        entityManager.persist(employee);
////        entityManager.flush();
////
////        // when
////        Employee found = employeeRepository.findByIdEmployee(employee.getIdDepartment());
////
////        // then
////        assertThat(found.getIdEmployee())
////                .isEqualTo(employee.getIdDepartment());
////    }
//
//
//    @Test
//    public void deleteByIdEmployee() {
//    }
//}