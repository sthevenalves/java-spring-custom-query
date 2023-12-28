package com.sthev.jparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sthev.jparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
