package com.vip.CarLoanRegistation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vip.CarLoanRegistation.app.model.Emi;
@Repository
public interface Emirepository extends JpaRepository<Emi, Integer> {

}
