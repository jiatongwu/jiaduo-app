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
 * MalingshuWanyibingfabingqingkuang generated by hbm2java
 */
@Entity
@Table(name = "malingshu_wanyibingfabingqingkuang", catalog = "jiaduo")
public class MalingshuWanyibingfabingqingkuang implements java.io.Serializable {

	private Integer id;
	private String place;
	private String person;
	private Date dateTime;
	private String pingzhong;
	private String tiankuaileixing;
	private String shengyuqi;
	private String diaochatiankuai;
	private String fabingtiankuai;
	private String bingtianlv;
	private String diaochazhushu;
	private String fabingzhushu;
	private String bingzhulv;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public MalingshuWanyibingfabingqingkuang() {
	}

	public MalingshuWanyibingfabingqingkuang(String place, String person, Date dateTime, String pingzhong,
			String tiankuaileixing, String shengyuqi, String diaochatiankuai, String fabingtiankuai, String bingtianlv,
			String diaochazhushu, String fabingzhushu, String bingzhulv, String remark, Integer userId, String userName,
			String longitude, String latitude) {
		this.place = place;
		this.person = person;
		this.dateTime = dateTime;
		this.pingzhong = pingzhong;
		this.tiankuaileixing = tiankuaileixing;
		this.shengyuqi = shengyuqi;
		this.diaochatiankuai = diaochatiankuai;
		this.fabingtiankuai = fabingtiankuai;
		this.bingtianlv = bingtianlv;
		this.diaochazhushu = diaochazhushu;
		this.fabingzhushu = fabingzhushu;
		this.bingzhulv = bingzhulv;
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

	@Column(name = "pingzhong")
	public String getPingzhong() {
		return this.pingzhong;
	}

	public void setPingzhong(String pingzhong) {
		this.pingzhong = pingzhong;
	}

	@Column(name = "tiankuaileixing")
	public String getTiankuaileixing() {
		return this.tiankuaileixing;
	}

	public void setTiankuaileixing(String tiankuaileixing) {
		this.tiankuaileixing = tiankuaileixing;
	}

	@Column(name = "shengyuqi")
	public String getShengyuqi() {
		return this.shengyuqi;
	}

	public void setShengyuqi(String shengyuqi) {
		this.shengyuqi = shengyuqi;
	}

	@Column(name = "diaochatiankuai")
	public String getDiaochatiankuai() {
		return this.diaochatiankuai;
	}

	public void setDiaochatiankuai(String diaochatiankuai) {
		this.diaochatiankuai = diaochatiankuai;
	}

	@Column(name = "fabingtiankuai")
	public String getFabingtiankuai() {
		return this.fabingtiankuai;
	}

	public void setFabingtiankuai(String fabingtiankuai) {
		this.fabingtiankuai = fabingtiankuai;
	}

	@Column(name = "bingtianlv")
	public String getBingtianlv() {
		return this.bingtianlv;
	}

	public void setBingtianlv(String bingtianlv) {
		this.bingtianlv = bingtianlv;
	}

	@Column(name = "diaochazhushu")
	public String getDiaochazhushu() {
		return this.diaochazhushu;
	}

	public void setDiaochazhushu(String diaochazhushu) {
		this.diaochazhushu = diaochazhushu;
	}

	@Column(name = "fabingzhushu")
	public String getFabingzhushu() {
		return this.fabingzhushu;
	}

	public void setFabingzhushu(String fabingzhushu) {
		this.fabingzhushu = fabingzhushu;
	}

	@Column(name = "bingzhulv")
	public String getBingzhulv() {
		return this.bingzhulv;
	}

	public void setBingzhulv(String bingzhulv) {
		this.bingzhulv = bingzhulv;
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
