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
 * XiaomaiCongaibingHuifeishizirandaidulv generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_congaibing_huifeishizirandaidulv", catalog = "jiaduo")
public class XiaomaiCongaibingHuifeishizirandaidulvUpdateValid implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String person;
	private String place;
	private String caichongdikuai;
	private String xiaomaipinzhong;
	private String chongtai;
	private String jiechongmiaoshu;
	private String fabingmiaoshu;
	private String daidulv;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiCongaibingHuifeishizirandaidulvUpdateValid() {
	}

	public XiaomaiCongaibingHuifeishizirandaidulvUpdateValid(Date dateTime, String person, String place, String caichongdikuai,
			String xiaomaipinzhong, String chongtai, String jiechongmiaoshu, String fabingmiaoshu, String daidulv,
			String remark, Integer userId, String userName, String longitude, String latitude) {
		this.dateTime = dateTime;
		this.person = person;
		this.place = place;
		this.caichongdikuai = caichongdikuai;
		this.xiaomaipinzhong = xiaomaipinzhong;
		this.chongtai = chongtai;
		this.jiechongmiaoshu = jiechongmiaoshu;
		this.fabingmiaoshu = fabingmiaoshu;
		this.daidulv = daidulv;
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

	@Column(name = "caichongdikuai")
	public String getCaichongdikuai() {
		return this.caichongdikuai;
	}

	public void setCaichongdikuai(String caichongdikuai) {
		this.caichongdikuai = caichongdikuai;
	}

	@Column(name = "xiaomaipinzhong")
	public String getXiaomaipinzhong() {
		return this.xiaomaipinzhong;
	}

	public void setXiaomaipinzhong(String xiaomaipinzhong) {
		this.xiaomaipinzhong = xiaomaipinzhong;
	}

	@Column(name = "chongtai")
	public String getChongtai() {
		return this.chongtai;
	}

	public void setChongtai(String chongtai) {
		this.chongtai = chongtai;
	}

	@Column(name = "jiechongmiaoshu")
	public String getJiechongmiaoshu() {
		return this.jiechongmiaoshu;
	}

	public void setJiechongmiaoshu(String jiechongmiaoshu) {
		this.jiechongmiaoshu = jiechongmiaoshu;
	}

	@Column(name = "fabingmiaoshu")
	public String getFabingmiaoshu() {
		return this.fabingmiaoshu;
	}

	public void setFabingmiaoshu(String fabingmiaoshu) {
		this.fabingmiaoshu = fabingmiaoshu;
	}

	@Column(name = "daidulv")
	public String getDaidulv() {
		return this.daidulv;
	}

	public void setDaidulv(String daidulv) {
		this.daidulv = daidulv;
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