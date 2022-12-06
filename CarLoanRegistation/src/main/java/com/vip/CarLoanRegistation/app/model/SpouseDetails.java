package com.vip.CarLoanRegistation.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SpouseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer spouseId;
	private String spouseName;
	private String spouseRelation;
	private String spouseDob;
	private Long spouseMobno;

}
