package com.wt.jiaduo.dto.jpa;
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
 * XiaomaiBaifenbing generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_baifenbing", catalog = "jiaduo")
public class XiaomaiBaifenbing implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String place;
	private String varietyName;
	private String sowingDate;
	private String growthPeriod;
	private String fieldArea;
	private String checkArea;
	private String numberofinvestigations;
	private String numberofdiseasedplants;
	private String diseaseRate;
	private String surveyBladenum;
	private String onsetBladenum;
	private String diseasedLeafrate;
	private String severity;
	private String diseaseIndex;
	private String diseasepointRate;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;
	private String remark;

	public XiaomaiBaifenbing() {
	}

	public XiaomaiBaifenbing(Date dateTime, String place, String varietyName, String sowingDate, String growthPeriod,
			String fieldArea, String checkArea, String numberofinvestigations, String numberofdiseasedplants,
			String diseaseRate, String surveyBladenum, String onsetBladenum, String diseasedLeafrate, String severity,
			String diseaseIndex, String diseasepointRate, Integer userId, String userName, String longitude,
			String latitude, String remark) {
		this.dateTime = dateTime;
		this.place = place;
		this.varietyName = varietyName;
		this.sowingDate = sowingDate;
		this.growthPeriod = growthPeriod;
		this.fieldArea = fieldArea;
		this.checkArea = checkArea;
		this.numberofinvestigations = numberofinvestigations;
		this.numberofdiseasedplants = numberofdiseasedplants;
		this.diseaseRate = diseaseRate;
		this.surveyBladenum = surveyBladenum;
		this.onsetBladenum = onsetBladenum;
		this.diseasedLeafrate = diseasedLeafrate;
		this.severity = severity;
		this.diseaseIndex = diseaseIndex;
		this.diseasepointRate = diseasepointRate;
		this.userId = userId;
		this.userName = userName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.remark = remark;
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

	@Column(name = "growth_period")
	public String getGrowthPeriod() {
		return this.growthPeriod;
	}

	public void setGrowthPeriod(String growthPeriod) {
		this.growthPeriod = growthPeriod;
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

	@Column(name = "numberofinvestigations")
	public String getNumberofinvestigations() {
		return this.numberofinvestigations;
	}

	public void setNumberofinvestigations(String numberofinvestigations) {
		this.numberofinvestigations = numberofinvestigations;
	}

	@Column(name = "numberofdiseasedplants")
	public String getNumberofdiseasedplants() {
		return this.numberofdiseasedplants;
	}

	public void setNumberofdiseasedplants(String numberofdiseasedplants) {
		this.numberofdiseasedplants = numberofdiseasedplants;
	}

	@Column(name = "disease_rate")
	public String getDiseaseRate() {
		return this.diseaseRate;
	}

	public void setDiseaseRate(String diseaseRate) {
		this.diseaseRate = diseaseRate;
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

	@Column(name = "disease_index")
	public String getDiseaseIndex() {
		return this.diseaseIndex;
	}

	public void setDiseaseIndex(String diseaseIndex) {
		this.diseaseIndex = diseaseIndex;
	}

	@Column(name = "diseasepoint_rate")
	public String getDiseasepointRate() {
		return this.diseasepointRate;
	}

	public void setDiseasepointRate(String diseasepointRate) {
		this.diseasepointRate = diseasepointRate;
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

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
