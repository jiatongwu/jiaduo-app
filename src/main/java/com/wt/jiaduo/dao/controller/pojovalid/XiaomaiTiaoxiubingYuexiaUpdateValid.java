package com.wt.jiaduo.dao.controller.pojovalid;
// Generated 2018-3-30 18:10:03 by Hibernate Tools 5.2.8.Final

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
 * XiaomaiTiaoxiubingYuexia generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_tiaoxiubing_yuexia", catalog = "jiaduo")
public class XiaomaiTiaoxiubingYuexiaUpdateValid implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String person;
	private String place;
	private String serialNumber;
	private String lateripeningArea;
	private String type;
	private String sowing;
	private String prevalenceRate;
	private String severity1;
	private String spontaneousArea;
	private String previousType;
	private String currentType;
	private String spontaneousDensity;
	private String diseaseRate;
	private String severity2;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiTiaoxiubingYuexiaUpdateValid() {
	}

	public XiaomaiTiaoxiubingYuexiaUpdateValid(Date dateTime, String person, String place, String serialNumber,
			String lateripeningArea, String type, String sowing, String prevalenceRate, String severity1,
			String spontaneousArea, String previousType, String currentType, String spontaneousDensity,
			String diseaseRate, String severity2, String remark, Integer userId, String userName, String longitude,
			String latitude) {
		this.dateTime = dateTime;
		this.person = person;
		this.place = place;
		this.serialNumber = serialNumber;
		this.lateripeningArea = lateripeningArea;
		this.type = type;
		this.sowing = sowing;
		this.prevalenceRate = prevalenceRate;
		this.severity1 = severity1;
		this.spontaneousArea = spontaneousArea;
		this.previousType = previousType;
		this.currentType = currentType;
		this.spontaneousDensity = spontaneousDensity;
		this.diseaseRate = diseaseRate;
		this.severity2 = severity2;
		this.remark = remark;
		this.userId = userId;
		this.userName = userName;
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

	@Column(name = "person")
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
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

	@Column(name = "lateripening_area")
	public String getLateripeningArea() {
		return this.lateripeningArea;
	}

	public void setLateripeningArea(String lateripeningArea) {
		this.lateripeningArea = lateripeningArea;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "sowing")
	public String getSowing() {
		return this.sowing;
	}

	public void setSowing(String sowing) {
		this.sowing = sowing;
	}

	@Column(name = "prevalence_rate")
	public String getPrevalenceRate() {
		return this.prevalenceRate;
	}

	public void setPrevalenceRate(String prevalenceRate) {
		this.prevalenceRate = prevalenceRate;
	}

	@Column(name = "severity1")
	public String getSeverity1() {
		return this.severity1;
	}

	public void setSeverity1(String severity1) {
		this.severity1 = severity1;
	}

	@Column(name = "spontaneous_area")
	public String getSpontaneousArea() {
		return this.spontaneousArea;
	}

	public void setSpontaneousArea(String spontaneousArea) {
		this.spontaneousArea = spontaneousArea;
	}

	@Column(name = "previous_type")
	public String getPreviousType() {
		return this.previousType;
	}

	public void setPreviousType(String previousType) {
		this.previousType = previousType;
	}

	@Column(name = "current_type")
	public String getCurrentType() {
		return this.currentType;
	}

	public void setCurrentType(String currentType) {
		this.currentType = currentType;
	}

	@Column(name = "spontaneous_density")
	public String getSpontaneousDensity() {
		return this.spontaneousDensity;
	}

	public void setSpontaneousDensity(String spontaneousDensity) {
		this.spontaneousDensity = spontaneousDensity;
	}

	@Column(name = "disease_rate")
	public String getDiseaseRate() {
		return this.diseaseRate;
	}

	public void setDiseaseRate(String diseaseRate) {
		this.diseaseRate = diseaseRate;
	}

	@Column(name = "severity2")
	public String getSeverity2() {
		return this.severity2;
	}

	public void setSeverity2(String severity2) {
		this.severity2 = severity2;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}
