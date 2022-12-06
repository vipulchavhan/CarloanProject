package com.vip.CarLoanRegistation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vip.CarLoanRegistation.app.model.AccountDetails;
import com.vip.CarLoanRegistation.app.model.Emi;
import com.vip.CarLoanRegistation.app.model.NonselfEmployee;
//import com.vip.CarLoanRegistation.app.model.Profession;
import com.vip.CarLoanRegistation.app.model.RegistrationDetails;
import com.vip.CarLoanRegistation.app.model.SelfEmployee;
import com.vip.CarLoanRegistation.app.model.SpouseDetails;
@Repository
public interface Registrationrepository extends JpaRepository<RegistrationDetails, Integer> {



}
