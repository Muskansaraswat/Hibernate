package com.hibernate.ormtool.onetomany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Person {
	@Id
	@Column(name = "person_id")
	private int aadharNumber;
	private String accountHolderName;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
	private List<BankAccounts> bankAccounts;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<BankAccounts> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccounts> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	

}
