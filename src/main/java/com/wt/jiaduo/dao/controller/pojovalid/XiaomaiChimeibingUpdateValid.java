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
 * XiaomaiChimeibing generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_chimeibing", catalog = "jiaduo")
public class XiaomaiChimeibingUpdateValid implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String person;
	private String place;
	private String pinzhong;
	private String leixingtian;
	private String diaochasuishu;
	private String bingsuishu;
	private String bingsuilv;
	private String bingqing0;
	private String bingqing1;
	private String bingqing2;
	private String bingqing3;
	private String bingqing4;
	private String bingqing5;
	private String bingqingzhishu;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiChimeibingUpdateValid() {
	}

	public XiaomaiChimeibingUpdateValid(Date dateTime, String person, String place, String pinzhong, String leixingtian,
			String diaochasuishu, String bingsuishu, String bingsuilv, String bingqing0, String bingqing1,
			String bingqing2, String bingqing3, String bingqing4, String bingqing5, String bingqingzhishu,
			String remark, Integer userId, String userName, String longitude, String latitude) {
		this.dateTime = dateTime;
		this.person = person;
		this.place = place;
		this.pinzhong = pinzhong;
		this.leixingtian = leixingtian;
		this.diaochasuishu = diaochasuishu;
		this.bingsuishu = bingsuishu;
		this.bingsuilv = bingsuilv;
		this.bingqing0 = bingqing0;
		this.bingqing1 = bingqing1;
		this.bingqing2 = bingqing2;
		this.bingqing3 = bingqing3;
		this.bingqing4 = bingqing4;
		this.bingqing5 = bingqing5;
		this.bingqingzhishu = bingqingzhishu;
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

	@Column(name = "pinzhong")
	public String getPinzhong() {
		return this.pinzhong;
	}

	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}

	@Column(name = "leixingtian")
	public String getLeixingtian() {
		return this.leixingtian;
	}

	public void setLeixingtian(String leixingtian) {
		this.leixingtian = leixingtian;
	}

	@Column(name = "diaochasuishu")
	public String getDiaochasuishu() {
		return this.diaochasuishu;
	}

	public void setDiaochasuishu(String diaochasuishu) {
		this.diaochasuishu = diaochasuishu;
	}

	@Column(name = "bingsuishu")
	public String getBingsuishu() {
		return this.bingsuishu;
	}

	public void setBingsuishu(String bingsuishu) {
		this.bingsuishu = bingsuishu;
	}

	@Column(name = "bingsuilv")
	public String getBingsuilv() {
		return this.bingsuilv;
	}

	public void setBingsuilv(String bingsuilv) {
		this.bingsuilv = bingsuilv;
	}

	@Column(name = "bingqing0")
	public String getBingqing0() {
		return this.bingqing0;
	}

	public void setBingqing0(String bingqing0) {
		this.bingqing0 = bingqing0;
	}

	@Column(name = "bingqing1")
	public String getBingqing1() {
		return this.bingqing1;
	}

	public void setBingqing1(String bingqing1) {
		this.bingqing1 = bingqing1;
	}

	@Column(name = "bingqing2")
	public String getBingqing2() {
		return this.bingqing2;
	}

	public void setBingqing2(String bingqing2) {
		this.bingqing2 = bingqing2;
	}

	@Column(name = "bingqing3")
	public String getBingqing3() {
		return this.bingqing3;
	}

	public void setBingqing3(String bingqing3) {
		this.bingqing3 = bingqing3;
	}

	@Column(name = "bingqing4")
	public String getBingqing4() {
		return this.bingqing4;
	}

	public void setBingqing4(String bingqing4) {
		this.bingqing4 = bingqing4;
	}

	@Column(name = "bingqing5")
	public String getBingqing5() {
		return this.bingqing5;
	}

	public void setBingqing5(String bingqing5) {
		this.bingqing5 = bingqing5;
	}

	@Column(name = "bingqingzhishu")
	public String getBingqingzhishu() {
		return this.bingqingzhishu;
	}

	public void setBingqingzhishu(String bingqingzhishu) {
		this.bingqingzhishu = bingqingzhishu;
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
