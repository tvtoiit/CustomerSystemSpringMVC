package com.fjs.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mstcustomer")
public class MstCustomerEntity {
	@Id
	@Column(name="CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	
	@Column(name="CUSTOMER_NAME", length = 50)
	private String customerName;
	
	@Column(name="SEX", length = 1)
	private String sex;
	
	@Column(name="BIRTHDAY", length = 10)
	private String birthDay;
	
	@Column(name="EMAIL", length = 40)
	private String email;
	
	@Column(name="ADDRESS", length = 256)
	private String address;
	
	@Column(name="DELETE_YMD")
	private Timestamp deleteYmd;
	
	@Column(name="INSERT_YMD")
	private Timestamp insertYmd;
	
	@Column(name="INSERT_PSN_CD", columnDefinition = "decimal(5,0)")
	private BigDecimal insertPsnCd;
	
	@Column(name="UPDATE_YMD")
	private Timestamp updateYmd;
	
	@Column(name="UPDATE_PSN_CD", columnDefinition = "decimal(5,0)")
	private BigDecimal updatePsnCd;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long id) {
		this.customerId = id;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getDeleteYmd() {
		return deleteYmd;
	}

	public void setDeleteYmd(Timestamp deleteYmd) {
		this.deleteYmd = deleteYmd;
	}

	public Timestamp getInsertYmd() {
		return insertYmd;
	}

	public void setInsertYmd(Timestamp insertYmd) {
		this.insertYmd = insertYmd;
	}

	public BigDecimal getInsertPsnCd() {
		return insertPsnCd;
	}

	public void setInsertPsnCd(BigDecimal insertPsnCd) {
		this.insertPsnCd = insertPsnCd;
	}

	public Timestamp getUpdateYmd() {
		return updateYmd;
	}

	public void setUpdateYmd(Timestamp updateYmd) {
		this.updateYmd = updateYmd;
	}

	public BigDecimal getUpdatePsnCd() {
		return updatePsnCd;
	}

	public void setUpdatePsnCd(BigDecimal updatePsnCd) {
		this.updatePsnCd = updatePsnCd;
	}
}
