package com.fjs.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MstCustomerDto {
	private Long customerId;
	private String customerName;
	private String sex;
	private String birthDay;
	private String email;
	private String address;
	private Timestamp deleteYmd;
	private Timestamp insertYmd;
	private BigDecimal insertPsnCd;
	private Timestamp updateYmd;
	private BigDecimal updatePsnCd;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
