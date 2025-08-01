package com.platform.payments.repository;

import com.platform.payments.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByDocument(String document); //O JPA já monta a query em tempo real
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserById(String id);
}
