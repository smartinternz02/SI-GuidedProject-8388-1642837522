package com.selva.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selva.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
