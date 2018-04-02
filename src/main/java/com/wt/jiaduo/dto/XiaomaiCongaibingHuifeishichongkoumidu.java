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
 * XiaomaiCongaibingHuifeishichongkoumidu generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_congaibing_huifeishichongkoumidu", catalog = "jiaduo")
public class XiaomaiCongaibingHuifeishichongkoumidu implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String place;
	private String pinzhong;
	private String leixingtian;
	private String shengyuqi;
	private String diaochamianji;
	private String chengchong;
	private String chongkoumidu;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiCongaibingHuifeishichongkoumidu() {
	}

	public XiaomaiCongaibingHuifeishichongkoumidu(Date dateTime, String place, String pinzhong, String leixingtian,
			String shengyuqi, String diaochamianji, String chengchong, String chongkoumidu, String remark,
			Integer userId, String userName, String longitude, String latitude) {
		this.dateTime = dateTime;
		this.place = place;
		this.pinzhong = pinzhong;
		this.leixingtian = leixingtian;
		this.shengyuqi = shengyuqi;
		this.diaochamianji = diaochamianji;
		this.chengchong = chengchong;
		this.chongkoumidu = chongkoumidu;
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

	@Column(name = "shengyuqi")
	public String getShengyuqi() {
		return this.shengyuqi;
	}

	public void setShengyuqi(String shengyuqi) {
		this.shengyuqi = shengyuqi;
	}

	@Column(name = "diaochamianji")
	public String getDiaochamianji() {
		return this.diaochamianji;
	}

	public void setDiaochamianji(String diaochamianji) {
		this.diaochamianji = diaochamianji;
	}

	@Column(name = "chengchong")
	public String getChengchong() {
		return this.chengchong;
	}

	public void setChengchong(String chengchong) {
		this.chengchong = chengchong;
	}

	@Column(name = "chongkoumidu")
	public String getChongkoumidu() {
		return this.chongkoumidu;
	}

	public void setChongkoumidu(String chongkoumidu) {
		this.chongkoumidu = chongkoumidu;
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
