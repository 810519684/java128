package org.project.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class KeyWords {

	private Integer id;

	private String keywords;

	private Integer agentId;

	private String agentName;

	private Integer customId;

	private String customName;

	private double preRegFrozenMoney;

	private double price;

	private Integer productType;

	private Integer serviceYears;
	// 0是未开通，1是开通
	private Integer openApp;

	private String appUserName;

	private String appPassword;

	private String loginUrl;

	private String iosDownloadUrl;

	private String androidDownloadUrl;

	private String codeIosUrl;

	private String codeAndroidUrl;

	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date preRegDatetime;
	
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date preRegPassDatetime;
	
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
	private Date regDatetime;
	
	
	@DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date regPassDatetime;
	
	private Integer isPass;
	
	private Integer checkStatus;
	
	private Integer isUse;
	
	private String note;
	
	
	
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getAppPassword() {
		return appPassword;
	}

	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getIosDownLoadUrl() {
		return iosDownloadUrl;
	}

	public void setIosDownLoadUrl(String iosDownLoadUrl) {
		this.iosDownloadUrl = iosDownLoadUrl;
	}

	public Date getPreRegPassDatetime() {
		return preRegPassDatetime;
	}

	public void setPreRegPassDatetime(Date preRegPassDatetime) {
		this.preRegPassDatetime = preRegPassDatetime;
	}

	public Date getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}

	public Date getRegPassDatetime() {
		return regPassDatetime;
	}

	public void setRegPassDatetime(Date regPassDatetime) {
		this.regPassDatetime = regPassDatetime;
	}

	public Integer getIsPass() {
		return isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getIsUse() {
		return isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

	public String getAndroidDownloadUrl() {
		return androidDownloadUrl;
	}

	public void setAndroidDownloadUrl(String androidDownloadUrl) {
		this.androidDownloadUrl = androidDownloadUrl;
	}

	public String getCodeIosUrl() {
		return codeIosUrl;
	}

	public void setCodeIosUrl(String codeIosUrl) {
		this.codeIosUrl = codeIosUrl;
	}

	public String getCodeAndroidUrl() {
		return codeAndroidUrl;
	}

	public void setCodeAndroidUrl(String codeAndroidUrl) {
		this.codeAndroidUrl = codeAndroidUrl;
	}

	public Date getPreRegDatetime() {
		return preRegDatetime;
	}

	public void setPreRegDatetime(Date preRegDatetime) {
		this.preRegDatetime = preRegDatetime;
	}

	public KeyWords() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Integer getCustomId() {
		return customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public double getPreRegFrozenMoney() {
		return preRegFrozenMoney;
	}

	public void setPreRegFrozenMoney(double preRegFrozenMoney) {
		this.preRegFrozenMoney = preRegFrozenMoney;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public Integer getServiceyears() {
		return serviceYears;
	}

	public void setServiceyears(Integer serviceyears) {
		this.serviceYears = serviceyears;
	}

	public Integer getOpenApp() {
		return openApp;
	}

	public void setOpenApp(Integer openApp) {
		this.openApp = openApp;
	}

	public String getAppUserName() {
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	@Override
	public String toString() {
		return "Keywords [id=" + id + ", keywords=" + keywords + ", agentId=" + agentId + ", agentName=" + agentName
				+ ", customId=" + customId + ", customName=" + customName + ", preRegFrozenMoney=" + preRegFrozenMoney
				+ ", price=" + price + ", productType=" + productType + ", serviceyears=" + serviceYears + ", openApp="
				+ openApp + ", appUserName=" + appUserName + ", appPassword=" + appPassword + ", loginUrl=" + loginUrl
				+ ", iosDownLoadUrl=" + iosDownloadUrl + ", androidDownloadUrl=" + androidDownloadUrl + ", codeIosUrl="
				+ codeIosUrl + ", codeAndroidUrl=" + codeAndroidUrl + ", preRegDatetime=" + preRegDatetime
				+ ", preRegPassDatetime=" + preRegPassDatetime + ", regDatetime=" + regDatetime + ", regPassDatetime="
				+ regPassDatetime + ", isPass=" + isPass + ", checkStatus=" + checkStatus + ", isUse=" + isUse
				+ ", note=" + note + "]";
	}


	
	
}
