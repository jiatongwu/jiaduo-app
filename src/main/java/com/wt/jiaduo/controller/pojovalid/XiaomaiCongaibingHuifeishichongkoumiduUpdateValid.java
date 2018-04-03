package com.wt.jiaduo.controller.pojovalid;
// Generated 2018-3-31 10:29:38 by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * XiaomaiCongaibingHuifeishichongkoumidu generated by hbm2java
 */
public class XiaomaiCongaibingHuifeishichongkoumiduUpdateValid implements java.io.Serializable {
	@NotNull(message="id不能为空")
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
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

	public XiaomaiCongaibingHuifeishichongkoumiduUpdateValid() {
	}

	public XiaomaiCongaibingHuifeishichongkoumiduUpdateValid(Date dateTime,  String place, String pinzhong,
			String leixingtian, String shengyuqi, String diaochamianji, String chengchong, String chongkoumidu,
			String remark, Integer userId, String userName, String longitude, String latitude) {
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

	public String getPinzhong() {
		return this.pinzhong;
	}

	public void setPinzhong(String pinzhong) {
		this.pinzhong = pinzhong;
	}

	public String getLeixingtian() {
		return this.leixingtian;
	}

	public void setLeixingtian(String leixingtian) {
		this.leixingtian = leixingtian;
	}

	public String getShengyuqi() {
		return this.shengyuqi;
	}

	public void setShengyuqi(String shengyuqi) {
		this.shengyuqi = shengyuqi;
	}

	public String getDiaochamianji() {
		return this.diaochamianji;
	}

	public void setDiaochamianji(String diaochamianji) {
		this.diaochamianji = diaochamianji;
	}

	public String getChengchong() {
		return this.chengchong;
	}

	public void setChengchong(String chengchong) {
		this.chengchong = chengchong;
	}

	public String getChongkoumidu() {
		return this.chongkoumidu;
	}

	public void setChongkoumidu(String chongkoumidu) {
		this.chongkoumidu = chongkoumidu;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
