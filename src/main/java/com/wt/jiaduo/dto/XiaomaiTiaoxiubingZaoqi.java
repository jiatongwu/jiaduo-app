package com.wt.jiaduo.dto;
// Generated 2018-3-31 15:55:00 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * XiaomaiTiaoxiubingZaoqi generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_tiaoxiubing_zaoqi", catalog = "jiaduo")
public class XiaomaiTiaoxiubingZaoqi implements java.io.Serializable {

	private Integer id;
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

	public XiaomaiTiaoxiubingZaoqi() {
	}

	public XiaomaiTiaoxiubingZaoqi(Date dateTime, String place, String serialNumber, String varietyName,
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

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", length = 19)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "place")
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "serial_number")
	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "variety_name")
	public String getVarietyName() {
		return this.varietyName;
	}

	public void setVarietyName(String varietyName) {
		this.varietyName = varietyName;
	}

	@Column(name = "sowing_date")
	public String getSowingDate() {
		return this.sowingDate;
	}

	public void setSowingDate(String sowingDate) {
		this.sowingDate = sowingDate;
	}

	@Column(name = "field_area")
	public String getFieldArea() {
		return this.fieldArea;
	}

	public void setFieldArea(String fieldArea) {
		this.fieldArea = fieldArea;
	}

	@Column(name = "check_area")
	public String getCheckArea() {
		return this.checkArea;
	}

	public void setCheckArea(String checkArea) {
		this.checkArea = checkArea;
	}

	@Column(name = "blade_density")
	public String getBladeDensity() {
		return this.bladeDensity;
	}

	public void setBladeDensity(String bladeDensity) {
		this.bladeDensity = bladeDensity;
	}

	@Column(name = "disease_density")
	public String getDiseaseDensity() {
		return this.diseaseDensity;
	}

	public void setDiseaseDensity(String diseaseDensity) {
		this.diseaseDensity = diseaseDensity;
	}

	@Column(name = "disease_averagearea")
	public String getDiseaseAveragearea() {
		return this.diseaseAveragearea;
	}

	public void setDiseaseAveragearea(String diseaseAveragearea) {
		this.diseaseAveragearea = diseaseAveragearea;
	}

	@Column(name = "disease_number_leave")
	public String getDiseaseNumberLeave() {
		return this.diseaseNumberLeave;
	}

	public void setDiseaseNumberLeave(String diseaseNumberLeave) {
		this.diseaseNumberLeave = diseaseNumberLeave;
	}

	@Column(name = "monolithic_leaf_density")
	public String getMonolithicLeafDensity() {
		return this.monolithicLeafDensity;
	}

	public void setMonolithicLeafDensity(String monolithicLeafDensity) {
		this.monolithicLeafDensity = monolithicLeafDensity;
	}

	@Column(name = "survey_bladenum")
	public String getSurveyBladenum() {
		return this.surveyBladenum;
	}

	public void setSurveyBladenum(String surveyBladenum) {
		this.surveyBladenum = surveyBladenum;
	}

	@Column(name = "onset_bladenum")
	public String getOnsetBladenum() {
		return this.onsetBladenum;
	}

	public void setOnsetBladenum(String onsetBladenum) {
		this.onsetBladenum = onsetBladenum;
	}

	@Column(name = "diseased_leafrate")
	public String getDiseasedLeafrate() {
		return this.diseasedLeafrate;
	}

	public void setDiseasedLeafrate(String diseasedLeafrate) {
		this.diseasedLeafrate = diseasedLeafrate;
	}

	@Column(name = "severity")
	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	@Column(name = "field_rate")
	public String getFieldRate() {
		return this.fieldRate;
	}

	public void setFieldRate(String fieldRate) {
		this.fieldRate = fieldRate;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "longitude")
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "latitude")
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
