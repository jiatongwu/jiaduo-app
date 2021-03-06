package com.wt.jiaduo.controller.pojovalid;
// Generated 2018-3-31 10:29:38 by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * XiaomaiTiaoxiubingZaoqi generated by hbm2java
 */
public class XiaomaiTiaoxiubingZaoqiUpdateValid implements java.io.Serializable {
	@NotNull(message="id不能为空")
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateTime;
	private String place;
	private String serialNumber;
	private String varietyName;
	private String sowingDate;
	private String fieldArea;
	private String checkArea;
	private String bladeDensity;
	private String diseaseDensity;
	private String diseaseAveragearea;
	private String diseaseNumberLeave;
	private String monolithicLeafDensity;
	private String surveyBladenum;
	private String onsetBladenum;
	private String diseasedLeafrate;
	private String severity;
	private String fieldRate;
	private Integer userId;
	private String userName;
	private String remark;
	private String longitude;
	private String latitude;

	public XiaomaiTiaoxiubingZaoqiUpdateValid() {
	}

	public XiaomaiTiaoxiubingZaoqiUpdateValid(Date dateTime, String place,  String serialNumber, String varietyName,
			String sowingDate, String fieldArea, String checkArea, String bladeDensity, String diseaseDensity,
			String diseaseAveragearea, String diseaseNumberLeave, String monolithicLeafDensity, String surveyBladenum,
			String onsetBladenum, String diseasedLeafrate, String severity, String fieldRate, Integer userId,
			String userName, String remark, String longitude, String latitude) {
		this.dateTime = dateTime;
		this.place = place;
		this.serialNumber = serialNumber;
		this.varietyName = varietyName;
		this.sowingDate = sowingDate;
		this.fieldArea = fieldArea;
		this.checkArea = checkArea;
		this.bladeDensity = bladeDensity;
		this.diseaseDensity = diseaseDensity;
		this.diseaseAveragearea = diseaseAveragearea;
		this.diseaseNumberLeave = diseaseNumberLeave;
		this.monolithicLeafDensity = monolithicLeafDensity;
		this.surveyBladenum = surveyBladenum;
		this.onsetBladenum = onsetBladenum;
		this.diseasedLeafrate = diseasedLeafrate;
		this.severity = severity;
		this.fieldRate = fieldRate;
		this.userId = userId;
		this.userName = userName;
		this.remark = remark;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getVarietyName() {
		return this.varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}

	public String getSowingDate() {
		return this.sowingDate;
	}

	public void setSowingDate(String sowingDate) {
		this.sowingDate = sowingDate;
	}

	public String getFieldArea() {
		return this.fieldArea;
	}

	public void setFieldArea(String fieldArea) {
		this.fieldArea = fieldArea;
	}

	public String getCheckArea() {
		return this.checkArea;
	}

	public void setCheckArea(String checkArea) {
		this.checkArea = checkArea;
	}

	public String getBladeDensity() {
		return this.bladeDensity;
	}

	public void setBladeDensity(String bladeDensity) {
		this.bladeDensity = bladeDensity;
	}

	public String getDiseaseDensity() {
		return this.diseaseDensity;
	}

	public void setDiseaseDensity(String diseaseDensity) {
		this.diseaseDensity = diseaseDensity;
	}

	public String getDiseaseAveragearea() {
		return this.diseaseAveragearea;
	}

	public void setDiseaseAveragearea(String diseaseAveragearea) {
		this.diseaseAveragearea = diseaseAveragearea;
	}

	public String getDiseaseNumberLeave() {
		return this.diseaseNumberLeave;
	}

	public void setDiseaseNumberLeave(String diseaseNumberLeave) {
		this.diseaseNumberLeave = diseaseNumberLeave;
	}

	public String getMonolithicLeafDensity() {
		return this.monolithicLeafDensity;
	}

	public void setMonolithicLeafDensity(String monolithicLeafDensity) {
		this.monolithicLeafDensity = monolithicLeafDensity;
	}

	public String getSurveyBladenum() {
		return this.surveyBladenum;
	}

	public void setSurveyBladenum(String surveyBladenum) {
		this.surveyBladenum = surveyBladenum;
	}

	public String getOnsetBladenum() {
		return this.onsetBladenum;
	}

	public void setOnsetBladenum(String onsetBladenum) {
		this.onsetBladenum = onsetBladenum;
	}

	public String getDiseasedLeafrate() {
		return this.diseasedLeafrate;
	}

	public void setDiseasedLeafrate(String diseasedLeafrate) {
		this.diseasedLeafrate = diseasedLeafrate;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getFieldRate() {
		return this.fieldRate;
	}

	public void setFieldRate(String fieldRate) {
		this.fieldRate = fieldRate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
