package com.vip.CarLoanRegistation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vip.CarLoanRegistation.app.model.AccountDetails;
@Repository
public interface Accountrepository extends JpaRepository<AccountDetails, Integer>{

}
