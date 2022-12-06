package com.vip.CarLoanRegistation.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer regId;
private String regDob;
private Integer regAge;
private String  regGender;
private long regMobno;
private String regOccopation;
@OneToOne(cascade = CascadeType.ALL)
private SpouseDetails regSpouse;
@OneToOne(cascade = CascadeType.ALL)
private Emi emi;
@OneToOne(cascade = CascadeType.ALL)
private AccountDetails regaccountdetails;
@OneToOne(cascade = CascadeType.ALL)
private SelfEmployee selfEmployee;
@OneToOne(cascade = CascadeType.ALL)
private NonselfEmployee nonselfEmployee;

}
