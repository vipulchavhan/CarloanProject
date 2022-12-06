package com.vip.CarLoanRegistation.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accId;
	private Long accNo;
	private String accName;
	private String bankName;
	private String bankAddress;
	private String ifscCode;
	private String accType;

}
