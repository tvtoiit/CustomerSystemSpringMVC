package com.fjs.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "mstuser")
public class MstUserEntity {
	@Id
    @Column(name = "PSN_CD")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long psnCd;

    @Column(name = "USERID", length = 8)
    private String userId;

    @Column(name = "PASSWORD", length = 8)
    private String password;

    @Column(name = "USERNAME", length = 40)
    private String username;

    @Column(name = "DELETE_YMD")
    private Timestamp deleteYmd;

    @Column(name = "INSERT_YMD")
    private Timestamp insertYmd;

    @Column(name = "INSERT_PSN_CD", columnDefinition = "decimal(5,0)")
    private BigDecimal insertPsnCd;

    @Column(name = "UPDATE_YMD")
    private Timestamp updateYmd;

    @Column(name = "UPDATE_PSN_CD", columnDefinition = "decimal(5,0)")
    private BigDecimal updatePsnCd;

	public Long getPsnCd() {
		return psnCd;
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
