package com.vip.CarLoanRegistation.app.controller;

import java.io.IOException;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vip.CarLoanRegistation.app.model.AccountDetails;
import com.vip.CarLoanRegistation.app.model.Emi;
import com.vip.CarLoanRegistation.app.model.NonselfEmployee;
//import com.vip.CarLoanRegistation.app.model.Profession;
import com.vip.CarLoanRegistation.app.model.RegistrationDetails;
import com.vip.CarLoanRegistation.app.model.SelfEmployee;
import com.vip.CarLoanRegistation.app.model.SpouseDetails;
import com.vip.CarLoanRegistation.app.service.Registrationservice;

@RestController
public class RegistrationController {
	
@Autowired
Registrationservice rs;

@PostMapping(value="/newcustomerregistration")
public ResponseEntity<RegistrationDetails> saveData(
		
//		               SelfEmployee pojo files
		@RequestParam ("selfempBlankcheque")MultipartFile f1,
		@RequestParam ("selfempBankstatement")MultipartFile f2,
		@RequestParam ("form16")MultipartFile f3,
		@RequestParam ("selfempPhoto")MultipartFile f4,
		@RequestParam ("selfempSignature")MultipartFile f5,
		@RequestParam ("selfempDrivinglicence")MultipartFile f6,
		
//		                 NonSelfEmployee pojo files
		@RequestParam ("nonselfempBlankcheque")MultipartFile f7,
		@RequestParam ("nonselfempBankstatement")MultipartFile f8,
		@RequestParam ("nonselfeempIncomeproof")MultipartFile f9,
		@RequestParam ("nonselfempElectricitybill")MultipartFile f10,
		@RequestParam ("nonselfempAddressproof")MultipartFile f11,
		@RequestParam ("nonselfempPhoto")MultipartFile f12,
		@RequestParam ("nonselfempSignature")MultipartFile f13,
		
//		       RegistrationDetails pojo
//	    @RequestParam ("regId")String regId,
	    @RequestParam ("regDob")String regDob,
		@RequestParam ("regAge")String regAge,
		@RequestParam ("regGender")String regGender,
		@RequestParam ("regMobno")String regMobno,
		@RequestParam ("regOccopation")String regOccopation,
		
//		              Emi pojo
//		@RequestParam ("emiId")String emiId,
		@RequestParam ("emiAmount")String emiAmount,
		@RequestParam ("principalAmount")String principalAmount,
		@RequestParam ("interest")String interest,
		@RequestParam ("tenure")String tenure,
		
//		                SelfEmployee pojo
//		@RequestParam ("selfempId")String selfempId
		@RequestParam ("selfempName")String selfempName,
		@RequestParam ("selfempAge")String selfempAge,
		@RequestParam ("selfempCompanyName")String selfempCompanyName,
		@RequestParam ("selfempBusinessname")String selfempBusinessname,


//		           AccountDetails pojo
//		@RequestParam ("accId")String accId,
		@RequestParam ("accNo")String accNo,
		@RequestParam ("accName")String accName,
		@RequestParam ("bankName")String bankName,
		@RequestParam ("bankAddress")String bankAddress,
		@RequestParam ("ifscCode")String ifcCode,
		@RequestParam ("accType")String accType,
		
//		             NonselfEmployee pojo
//		@RequestParam ("nonselfempId")String nonselfempId,
		@RequestParam ("nonselfempAge")String nonselfempAge,
		@RequestParam ("nonselfempName")String nonselfempName,
		@RequestParam ("nonselfempOccopation")String nonselfempOccopation,
		
//		               SpouseDetails
//		@RequestParam ("spouseId")String spouseId,
		@RequestParam ("spouseName")String spouseName,
		@RequestParam ("spouseRelation")String spouseRelation,
		@RequestParam ("spouseDob")String spouseDob,
		@RequestParam ("spouseMobno")String spouseMobno)
		
		
//                  Profession pojo
//        @RequestParam ("proId")String proId,
//        @RequestParam ("selfEmployee")String selfEmployee,
//        @RequestParam ("NonselfEmployee")String NonselfEmployee)

		{
	
	ObjectMapper om=new ObjectMapper();
	
	RegistrationDetails rr=new RegistrationDetails();
	SelfEmployee se=new SelfEmployee();
	NonselfEmployee nse=new NonselfEmployee();
	Emi em=new 	Emi();
	AccountDetails ac=new AccountDetails();
	SpouseDetails sp=new SpouseDetails();
	
	rr.setSelfEmployee(se);
	rr.setNonselfEmployee(nse);
	rr.setEmi(em);
	rr.setRegSpouse(sp);
	rr.setRegaccountdetails(ac);
	
	
	try {
//		Profession self = om.readValue(selfEmployee, Profession.class);
//		Profession non = om.readValue(NonselfEmployee, Profession.class);
//		
		
//		          RegistrationDetails pojo
		
		RegistrationDetails readValue3 = om.readValue(regDob, RegistrationDetails.class);
		RegistrationDetails readValue4 = om.readValue(regAge, RegistrationDetails.class);
		RegistrationDetails readValue5 = om.readValue(regGender, RegistrationDetails.class);
		RegistrationDetails readValue6 = om.readValue(regMobno, RegistrationDetails.class);
		RegistrationDetails readValue7 = om.readValue(regOccopation, RegistrationDetails.class);
//		
		rr.setRegDob(readValue3.getRegDob());
		rr.setRegAge(readValue4.getRegAge());
		rr.setRegGender(readValue5.getRegGender());
		rr.setRegMobno(readValue6.getRegMobno());
		rr.setRegOccopation(readValue7.getRegOccopation());
		
		
//		                Emi pojo		
		Emi readValue = om.readValue(emiAmount,Emi.class);
		Emi readValue9 = om.readValue(principalAmount, Emi.class);
		Emi readValue10 = om.readValue(interest, Emi.class);
		Emi readValue11 = om.readValue(tenure, Emi.class);
		rr.getEmi().setInterest(readValue10.getInterest());
		rr.getEmi().setEmiAmount(readValue.getEmiAmount());
		rr.getEmi().setPrincipalAmount(readValue9.getPrincipalAmount());
		rr.getEmi().setTenure(readValue11.getTenure());
		
//		             AccountDetails pojo
		AccountDetails readValue12 = om.readValue(accNo, AccountDetails.class);
		AccountDetails readValue14 = om.readValue(accName, AccountDetails.class);
		AccountDetails readValue15 = om.readValue(bankName, AccountDetails.class);
		AccountDetails readValue16 = om.readValue(bankAddress, AccountDetails.class);
		AccountDetails readValue17 = om.readValue(ifcCode, AccountDetails.class);
		AccountDetails readValue18 = om.readValue(accType, AccountDetails.class);
		rr.getRegaccountdetails().setAccName(readValue14.getAccName());
		rr.getRegaccountdetails().setAccNo(readValue12.getAccNo());
		rr.getRegaccountdetails().setAccType(readValue18.getAccType());
		rr.getRegaccountdetails().setBankAddress(readValue16.getBankAddress());
		rr.getRegaccountdetails().setBankName(readValue15.getBankName());
		rr.getRegaccountdetails().setIfscCode(readValue17.getIfscCode());
		
//                         SpouseDetails
//		SpouseDetails readValue19 = om.readValue(spouseId, SpouseDetails.class);
		SpouseDetails readValue20 = om.readValue(spouseName, SpouseDetails.class);
		SpouseDetails readValue21 = om.readValue(spouseDob, SpouseDetails.class);
		SpouseDetails readValue22 = om.readValue(spouseRelation, SpouseDetails.class);
		SpouseDetails readValue23 = om.readValue(spouseMobno, SpouseDetails.class);
		rr.getRegSpouse().setSpouseMobno(readValue23.getSpouseMobno());
		rr.getRegSpouse().setSpouseName(readValue20.getSpouseName());
		rr.getRegSpouse().setSpouseRelation(readValue22.getSpouseRelation());
		rr.getRegSpouse().setSpouseDob(readValue21.getSpouseDob());
//		                      SelfEmployee pojo        
//		SelfEmployee readValue24 = om.readValue(selfempId, SelfEmployee.class);
		SelfEmployee readValue25 = om.readValue(selfempName, SelfEmployee.class);
		SelfEmployee readValue26 = om.readValue(selfempAge, SelfEmployee.class);
		SelfEmployee readValue27 = om.readValue(selfempCompanyName, SelfEmployee.class);
		SelfEmployee readValue28 = om.readValue(selfempBusinessname, SelfEmployee.class);
		rr.getSelfEmployee().setSelfempCompanyName(readValue27.getSelfempCompanyName());
		rr.getSelfEmployee().setSelfempBusinessname(readValue28.getSelfempBusinessname());
		rr.getSelfEmployee().setSelfempAge(readValue26.getSelfempAge());
		rr.getSelfEmployee().setSelfempName(readValue25.getSelfempName());
		
//                            NonselfEmployee pojo
//		NonselfEmployee readValue29 = om.readValue(nselfempId, NonselfEmployee.class);
		NonselfEmployee readValue30 = om.readValue(nonselfempName, NonselfEmployee.class);
		NonselfEmployee readValue31 = om.readValue(nonselfempAge, NonselfEmployee.class);
		NonselfEmployee readValue32 = om.readValue(nonselfempOccopation, NonselfEmployee.class);
		rr.getNonselfEmployee().setNonselfempAge(readValue31.getNonselfempAge());
		rr.getNonselfEmployee().setNonselfempOccopation(readValue32.getNonselfempOccopation());
		rr.getNonselfEmployee().setNonselfempName(readValue30.getNonselfempName());
//		                     SelfEmployee pojo files
		rr.getSelfEmployee().setSelfempBlankcheque(f1.getBytes());
		rr.getSelfEmployee().setSelfempBankstatement(f2.getBytes());
		rr.getSelfEmployee().setForm16(f3.getBytes());
		rr.getSelfEmployee().setSelfempDrivinglicence(f6.getBytes());
		rr.getSelfEmployee().setSelfempPhoto(f4.getBytes());
		rr.getSelfEmployee().setSelfempSignature(f5.getBytes());
		
		
		
//		                    NonSelfEmployee pojo files
		rr.getNonselfEmployee().setNonselfempAddressproof(f11.getBytes());
		rr.getNonselfEmployee().setNonselfempBankstatement(f8.getBytes());
		rr.getNonselfEmployee().setNonselfempBlankcheque(f7.getBytes());
		rr.getNonselfEmployee().setNonselfempElectricitybill(f10.getBytes());
		rr.getNonselfEmployee().setNonselfempPhoto(f12.getBytes());
		rr.getNonselfEmployee().setNonselfempSignature(f13.getBytes());
		rr.getNonselfEmployee().setNonselfeempIncomeproof(f9.getBytes());
		
		rs.saveData(rr);
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		
	}
	
	return new ResponseEntity<RegistrationDetails>(rr,HttpStatus.CREATED);
}	

@GetMapping("/viewRegistration")	
public ResponseEntity<Iterable<RegistrationDetails>> getData(){
	Iterable<RegistrationDetails>  list=rs.displayAllCustomerRegistration();
	return new ResponseEntity<Iterable<RegistrationDetails>>(list,HttpStatus.OK);
}

@PutMapping("/newcustomerregistration/{regId}")	
public ResponseEntity<RegistrationDetails> updateData(@PathVariable ("regId") Integer regId,@RequestParam ("selfempBlankcheque")MultipartFile f1,
		@RequestParam ("selfempBankstatement")MultipartFile f2,
		@RequestParam ("form16")MultipartFile f3,
		@RequestParam ("selfempPhoto")MultipartFile f4,
		@RequestParam ("selfempSignature")MultipartFile f5,
		@RequestParam ("selfempDrivinglicence")MultipartFile f6,
		
//		                 NonSelfEmployee pojo files
		@RequestParam ("nonselfempBlankcheque")MultipartFile f7,
		@RequestParam ("nonselfempBankstatement")MultipartFile f8,
		@RequestParam ("nonselfeempIncomeproof")MultipartFile f9,
		@RequestParam ("nonselfempElectricitybill")MultipartFile f10,
		@RequestParam ("nonselfempAddressproof")MultipartFile f11,
		@RequestParam ("nonselfempPhoto")MultipartFile f12,
		@RequestParam ("nonselfempSignature")MultipartFile f13,
		
//		       RegistrationDetails pojo
//	    @RequestParam ("regId")String regId,
	    @RequestParam ("regDob")String regDob,
		@RequestParam ("regAge")String regAge,
		@RequestParam ("regGender")String regGender,
		@RequestParam ("regMobno")String regMobno,
		@RequestParam ("regOccopation")String regOccopation,
		
//		              Emi pojo
//		@RequestParam ("emiId")String emiId,
		@RequestParam ("emiAmount")String emiAmount,
		@RequestParam ("principalAmount")String principalAmount,
		@RequestParam ("interest")String interest,
		@RequestParam ("tenure")String tenure,
		
//		                SelfEmployee pojo
//		@RequestParam ("selfempId")String selfempId
		@RequestParam ("selfempName")String selfempName,
		@RequestParam ("selfempAge")String selfempAge,
		@RequestParam ("selfempCompanyName")String selfempCompanyName,
		@RequestParam ("selfempBusinessname")String selfempBusinessname,


//		           AccountDetails pojo
//		@RequestParam ("accId")String accId,
		@RequestParam ("accNo")String accNo,
		@RequestParam ("accName")String accName,
		@RequestParam ("bankName")String bankName,
		@RequestParam ("bankAddress")String bankAddress,
		@RequestParam ("ifscCode")String ifcCode,
		@RequestParam ("accType")String accType,
		
//		             NonselfEmployee pojo
//		@RequestParam ("nonselfempId")String nonselfempId,
		@RequestParam ("nonselfempAge")String nonselfempAge,
		@RequestParam ("nonselfempName")String nonselfempName,
		@RequestParam ("nonselfempOccopation")String nonselfempOccopation,
		
//		               SpouseDetails
//		@RequestParam ("spouseId")String spouseId,
		@RequestParam ("spouseName")String spouseName,
		@RequestParam ("spouseRelation")String spouseRelation,
		@RequestParam ("spouseDob")String spouseDob,
		@RequestParam ("spouseMobno")String spouseMobno)
		
		
//                  Profession pojo
//        @RequestParam ("proId")String proId,
//        @RequestParam ("selfEmployee")String selfEmployee,
//        @RequestParam ("NonselfEmployee")String NonselfEmployee)

		{
	
	ObjectMapper om=new ObjectMapper();
	
	RegistrationDetails rr=new RegistrationDetails();
	SelfEmployee se=new SelfEmployee();
	NonselfEmployee nse=new NonselfEmployee();
	Emi em=new 	Emi();
	AccountDetails ac=new AccountDetails();
	SpouseDetails sp=new SpouseDetails();
	
	rr.setSelfEmployee(se);
	rr.setNonselfEmployee(nse);
	rr.setEmi(em);
	rr.setRegSpouse(sp);
	rr.setRegaccountdetails(ac);
	
	
	try {
//		Profession self = om.readValue(selfEmployee, Profession.class);
//		Profession non = om.readValue(NonselfEmployee, Profession.class);
//		
		
//		          RegistrationDetails pojo
		
		RegistrationDetails readValue3 = om.readValue(regDob, RegistrationDetails.class);
		RegistrationDetails readValue4 = om.readValue(regAge, RegistrationDetails.class);
		RegistrationDetails readValue5 = om.readValue(regGender, RegistrationDetails.class);
		RegistrationDetails readValue6 = om.readValue(regMobno, RegistrationDetails.class);
		RegistrationDetails readValue7 = om.readValue(regOccopation, RegistrationDetails.class);
//		
		rr.setRegDob(readValue3.getRegDob());
		rr.setRegAge(readValue4.getRegAge());
		rr.setRegGender(readValue5.getRegGender());
		rr.setRegMobno(readValue6.getRegMobno());
		rr.setRegOccopation(readValue7.getRegOccopation());
//		                Emi pojo
		
//		
		Emi readValue = om.readValue(emiAmount,Emi.class);
		Emi readValue9 = om.readValue(principalAmount, Emi.class);
		Emi readValue10 = om.readValue(interest, Emi.class);
		Emi readValue11 = om.readValue(tenure, Emi.class);
		rr.getEmi().setInterest(readValue10.getInterest());
		rr.getEmi().setEmiAmount(readValue.getEmiAmount());
		rr.getEmi().setPrincipalAmount(readValue9.getPrincipalAmount());
		rr.getEmi().setTenure(readValue11.getTenure());
//		             AccountDetails pojo
		AccountDetails readValue12 = om.readValue(accNo, AccountDetails.class);
		AccountDetails readValue14 = om.readValue(accName, AccountDetails.class);
		AccountDetails readValue15 = om.readValue(bankName, AccountDetails.class);
		AccountDetails readValue16 = om.readValue(bankAddress, AccountDetails.class);
		AccountDetails readValue17 = om.readValue(ifcCode, AccountDetails.class);
		AccountDetails readValue18 = om.readValue(accType, AccountDetails.class);
		rr.getRegaccountdetails().setAccName(readValue14.getAccName());
		rr.getRegaccountdetails().setAccNo(readValue12.getAccNo());
		rr.getRegaccountdetails().setAccType(readValue18.getAccType());
		rr.getRegaccountdetails().setBankAddress(readValue16.getBankAddress());
		rr.getRegaccountdetails().setBankName(readValue15.getBankName());
		rr.getRegaccountdetails().setIfscCode(readValue17.getIfscCode());
		
//                         SpouseDetails
//		SpouseDetails readValue19 = om.readValue(spouseId, SpouseDetails.class);
		SpouseDetails readValue20 = om.readValue(spouseName, SpouseDetails.class);
		SpouseDetails readValue21 = om.readValue(spouseDob, SpouseDetails.class);
		SpouseDetails readValue22 = om.readValue(spouseRelation, SpouseDetails.class);
		SpouseDetails readValue23 = om.readValue(spouseMobno, SpouseDetails.class);
		rr.getRegSpouse().setSpouseMobno(readValue23.getSpouseMobno());
		rr.getRegSpouse().setSpouseName(readValue20.getSpouseName());
		rr.getRegSpouse().setSpouseRelation(readValue22.getSpouseRelation());
		rr.getRegSpouse().setSpouseDob(readValue21.getSpouseDob());
//		                      SelfEmployee pojo        
//		SelfEmployee readValue24 = om.readValue(selfempId, SelfEmployee.class);
		SelfEmployee readValue25 = om.readValue(selfempName, SelfEmployee.class);
		SelfEmployee readValue26 = om.readValue(selfempAge, SelfEmployee.class);
		SelfEmployee readValue27 = om.readValue(selfempCompanyName, SelfEmployee.class);
		SelfEmployee readValue28 = om.readValue(selfempBusinessname, SelfEmployee.class);
		rr.getSelfEmployee().setSelfempCompanyName(readValue27.getSelfempCompanyName());
		rr.getSelfEmployee().setSelfempBusinessname(readValue28.getSelfempBusinessname());
		rr.getSelfEmployee().setSelfempAge(readValue26.getSelfempAge());
		rr.getSelfEmployee().setSelfempName(readValue25.getSelfempName());
		
//                            NonselfEmployee pojo
//		NonselfEmployee readValue29 = om.readValue(nselfempId, NonselfEmployee.class);
		NonselfEmployee readValue30 = om.readValue(nonselfempName, NonselfEmployee.class);
		NonselfEmployee readValue31 = om.readValue(nonselfempAge, NonselfEmployee.class);
		NonselfEmployee readValue32 = om.readValue(nonselfempOccopation, NonselfEmployee.class);
		rr.getNonselfEmployee().setNonselfempAge(readValue31.getNonselfempAge());
		rr.getNonselfEmployee().setNonselfempOccopation(readValue32.getNonselfempOccopation());
		rr.getNonselfEmployee().setNonselfempName(readValue30.getNonselfempName());
//		                     SelfEmployee pojo files
		rr.getSelfEmployee().setSelfempBlankcheque(f1.getBytes());
		rr.getSelfEmployee().setSelfempBankstatement(f2.getBytes());
		rr.getSelfEmployee().setForm16(f3.getBytes());
		rr.getSelfEmployee().setSelfempDrivinglicence(f6.getBytes());
		rr.getSelfEmployee().setSelfempPhoto(f4.getBytes());
		rr.getSelfEmployee().setSelfempSignature(f5.getBytes());
		
		
		
//		                    NonSelfEmployee pojo files
		rr.getNonselfEmployee().setNonselfempAddressproof(f11.getBytes());
		rr.getNonselfEmployee().setNonselfempBankstatement(f8.getBytes());
		rr.getNonselfEmployee().setNonselfempBlankcheque(f7.getBytes());
		rr.getNonselfEmployee().setNonselfempElectricitybill(f10.getBytes());
		rr.getNonselfEmployee().setNonselfempPhoto(f12.getBytes());
		rr.getNonselfEmployee().setNonselfempSignature(f13.getBytes());
		rr.getNonselfEmployee().setNonselfeempIncomeproof(f9.getBytes());
		
		RegistrationDetails registration = rs.updateCustomerRegistration(rr, regId);
		rs.saveData(registration);
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		
	}
	
	return new ResponseEntity<RegistrationDetails>(HttpStatus.ACCEPTED);
}

@DeleteMapping(value="/removeregistrationdetails/{regId}")
public ResponseEntity deleteData(@PathVariable ("regId") Integer regId)
		 {
	rs.removeregistrationdetails(regId);
	return new ResponseEntity(HttpStatus.NO_CONTENT);
}

}

