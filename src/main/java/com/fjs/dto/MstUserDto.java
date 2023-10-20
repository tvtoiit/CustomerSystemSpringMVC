package com.fjs.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MstUserDto {
	private Long psnCd;
    private String userId;
    private String password;
    private String username;
    private Timestamp deleteYmd;
    private Timestamp insertYmd;
    private BigDecimal insertPsnCd;
    private Timestamp updateYmd;
    private BigDecimal updatePsnCd;
	public Long getPsnCd() {
		return psnCd;
	}
	public void setPsnCd(Long psnCd) {
		this.psnCd = psnCd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
