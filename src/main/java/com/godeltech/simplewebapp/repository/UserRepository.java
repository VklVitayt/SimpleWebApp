package com.godeltech.simplewebapp.repository;

import com.godeltech.simplewebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByIdUser(Long id);

    void deleteByIdUser(Long id);
}