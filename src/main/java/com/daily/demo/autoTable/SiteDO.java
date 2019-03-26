package com.daily.demo.autoTable;

import java.io.Serializable;
import java.util.Date;

public class SiteDO implements Serializable{
	
	private static final long serialVersionUID = 5571371545479376033L;

	private Integer siteId;

    private String siteName;

    private String siteDomain;

    private String siteLead;

    private String siteLeadPhone;

    private Long siteCreditLine;

    private String siteBank;

    private String siteBankcardNum;

    private String siteBankReserve;

    private String alipayAcc;

    private String alipayPossessor;

    private Date createTime;

    private Date modifyTime;

    private String remark;

    private Integer status;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain == null ? null : siteDomain.trim();
    }

    public String getSiteLead() {
        return siteLead;
    }

    public void setSiteLead(String siteLead) {
        this.siteLead = siteLead == null ? null : siteLead.trim();
    }

    public String getSiteLeadPhone() {
        return siteLeadPhone;
    }

    public void setSiteLeadPhone(String siteLeadPhone) {
        this.siteLeadPhone = siteLeadPhone == null ? null : siteLeadPhone.trim();
    }

    public Long getSiteCreditLine() {
        return siteCreditLine;
    }

    public void setSiteCreditLine(Long siteCreditLine) {
        this.siteCreditLine = siteCreditLine;
    }

    public String getSiteBank() {
        return siteBank;
    }

    public void setSiteBank(String siteBank) {
        this.siteBank = siteBank == null ? null : siteBank.trim();
    }

    public String getSiteBankcardNum() {
        return siteBankcardNum;
    }

    public void setSiteBankcardNum(String siteBankcardNum) {
        this.siteBankcardNum = siteBankcardNum == null ? null : siteBankcardNum.trim();
    }

    public String getSiteBankReserve() {
        return siteBankReserve;
    }

    public void setSiteBankReserve(String siteBankReserve) {
        this.siteBankReserve = siteBankReserve == null ? null : siteBankReserve.trim();
    }

    public String getAlipayAcc() {
        return alipayAcc;
    }

    public void setAlipayAcc(String alipayAcc) {
        this.alipayAcc = alipayAcc == null ? null : alipayAcc.trim();
    }

    public String getAlipayPossessor() {
        return alipayPossessor;
    }

    public void setAlipayPossessor(String alipayPossessor) {
        this.alipayPossessor = alipayPossessor == null ? null : alipayPossessor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}