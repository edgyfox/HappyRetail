package com.happyretail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customers")
public class CustomerBean {
	@Id
	@Column(name="custId")
	private int custId;
	
	@NotNull(message="Field should not be empty")
	@Size(min=2,message="Name should have at least two characters")
	@Column(name="custName")
	private String custName;
	
	@NotNull(message="Field should not be empty")
	@Pattern(regexp="\\w+@\\w+\\.\\w+",message="Email is invalid")
	@Column(name="custEmail")
	private String custEmail;
	
	@NotNull(message="Field should not be empty")
	@Size(min=6,message="Password should have at least six characters")
	@Column(name="custPass")
	private String custPass;
	
	@NotNull(message="Field should not be empty")
	@Size(min=10,message="Phone number should have at least 10 digits")
	@Column(name="custPhone")
	private String custPhone;
	
	@NotNull(message="Field should not be empty")
	@Column(name="CustGender")
	private String custGender; 
	
	
	public CustomerBean()
	{
		
	}
	
	public CustomerBean(int custId,
			@NotNull(message = "Field should not be empty") @Size(min = 2, message = "Name should have at least two characters") String custName,
			@NotNull(message = "Field should not be empty") @Pattern(regexp = "\\w+@\\w+\\.\\w+", message = "Email is invalid") String custEmail,
			@NotNull(message = "Field should not be empty") @Size(min = 6, message = "Password should have at least six characters") String custPass,
			@NotNull(message = "Field should not be empty") @Size(min = 10, message = "Phone number should have at least 10 digits") String custPhone,
			@NotNull(message = "Field should not be empty") String custGender) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.custPhone = custPhone;
		this.custGender = custGender;
	}

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
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustGender() {
		return custGender;
	}
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

}
