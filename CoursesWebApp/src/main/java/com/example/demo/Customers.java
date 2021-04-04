package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
public class Customers {
	@Id
	private int custId;
	private String custName;
	private String custEmail;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + "]";
	}

}
