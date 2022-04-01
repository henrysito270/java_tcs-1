package com.cgranada.java_tcs1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgranada.java_tcs1.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

}