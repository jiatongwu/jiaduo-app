package com.wt.jiaduo.dto;
// Generated 2018-3-31 9:23:34 by Hibernate Tools 5.2.8.Final

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
 * XiaomaiTiaoxiubingHouqi generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_tiaoxiubing_houqi", catalog = "jiaduo")
public class XiaomaiTiaoxiubingHouqi implements java.io.Serializable {

	private Integer id;
	private String place;
	private String person;
	private Date dateTime;
	private String variety;
	private String fieldNum;
	private String growthPeriod;
	private String typeField1Rate;
	private String typeField1Severity;
	private String typeField2Rate;
	private String typeField2Severity;
	private String typeField3Rate;
	private String typeField3Severity;
	private String typeField4Rate;
	private String typeField4Severity;
	private String typeField5Rate;
	private String typeField5Severity;
	private String typeAverageRate;
	private String typeAverageSeverity;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiTiaoxiubingHouqi() {
	}

	public XiaomaiTiaoxiubingHouqi(String place, String person, Date dateTime, String variety, String fieldNum,
			String growthPeriod, String typeField1Rate, String typeField1Severity, String typeField2Rate,
			String typeField2Severity, String typeField3Rate, String typeField3Severity, String typeField4Rate,
			String typeField4Severity, String typeField5Rate, String typeField5Severity, String typeAverageRate,
			String typeAverageSeverity, Integer userId, String userName, String longitude, String latitude) {
		this.place = place;
		this.person = person;
		this.dateTime = dateTime;
		this.variety = variety;
		this.fieldNum = fieldNum;
		this.growthPeriod = growthPeriod;
		this.typeField1Rate = typeField1Rate;
		this.typeField1Severity = typeField1Severity;
		this.typeField2Rate = typeField2Rate;
		this.typeField2Severity = typeField2Severity;
		this.typeField3Rate = typeField3Rate;
		this.typeField3Severity = typeField3Severity;
		this.typeField4Rate = typeField4Rate;
		this.typeField4Severity = typeField4Severity;
		this.typeField5Rate = typeField5Rate;
		this.typeField5Severity = typeField5Severity;
		this.typeAverageRate = typeAverageRate;
		this.typeAverageSeverity = typeAverageSeverity;
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

	@Column(name = "place")
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "person")
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", length = 19)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "variety")
	public String getVariety() {
		return this.variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Column(name = "field_num")
	public String getFieldNum() {
		return this.fieldNum;
	}

	public void setFieldNum(String fieldNum) {
		this.fieldNum = fieldNum;
	}

	@Column(name = "growth_period")
	public String getGrowthPeriod() {
		return this.growthPeriod;
	}

	public void setGrowthPeriod(String growthPeriod) {
		this.growthPeriod = growthPeriod;
	}

	@Column(name = "type_field1_rate")
	public String getTypeField1Rate() {
		return this.typeField1Rate;
	}

	public void setTypeField1Rate(String typeField1Rate) {
		this.typeField1Rate = typeField1Rate;
	}

	@Column(name = "type_field1_severity")
	public String getTypeField1Severity() {
		return this.typeField1Severity;
	}

	public void setTypeField1Severity(String typeField1Severity) {
		this.typeField1Severity = typeField1Severity;
	}

	@Column(name = "type_field2_rate")
	public String getTypeField2Rate() {
		return this.typeField2Rate;
	}

	public void setTypeField2Rate(String typeField2Rate) {
		this.typeField2Rate = typeField2Rate;
	}

	@Column(name = "type_field2_severity")
	public String getTypeField2Severity() {
		return this.typeField2Severity;
	}

	public void setTypeField2Severity(String typeField2Severity) {
		this.typeField2Severity = typeField2Severity;
	}

	@Column(name = "type_field3_rate")
	public String getTypeField3Rate() {
		return this.typeField3Rate;
	}

	public void setTypeField3Rate(String typeField3Rate) {
		this.typeField3Rate = typeField3Rate;
	}

	@Column(name = "type_field3_severity")
	public String getTypeField3Severity() {
		return this.typeField3Severity;
	}

	public void setTypeField3Severity(String typeField3Severity) {
		this.typeField3Severity = typeField3Severity;
	}

	@Column(name = "type_field4_rate")
	public String getTypeField4Rate() {
		return this.typeField4Rate;
	}

	public void setTypeField4Rate(String typeField4Rate) {
		this.typeField4Rate = typeField4Rate;
	}

	@Column(name = "type_field4_severity")
	public String getTypeField4Severity() {
		return this.typeField4Severity;
	}

	public void setTypeField4Severity(String typeField4Severity) {
		this.typeField4Severity = typeField4Severity;
	}

	@Column(name = "type_field5_rate")
	public String getTypeField5Rate() {
		return this.typeField5Rate;
	}

	public void setTypeField5Rate(String typeField5Rate) {
		this.typeField5Rate = typeField5Rate;
	}

	@Column(name = "type_field5_severity")
	public String getTypeField5Severity() {
		return this.typeField5Severity;
	}

	public void setTypeField5Severity(String typeField5Severity) {
		this.typeField5Severity = typeField5Severity;
	}

	@Column(name = "type_average_rate")
	public String getTypeAverageRate() {
		return this.typeAverageRate;
	}

	public void setTypeAverageRate(String typeAverageRate) {
		this.typeAverageRate = typeAverageRate;
	}

	@Column(name = "type_average_severity")
	public String getTypeAverageSeverity() {
		return this.typeAverageSeverity;
	}

	public void setTypeAverageSeverity(String typeAverageSeverity) {
		this.typeAverageSeverity = typeAverageSeverity;
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
