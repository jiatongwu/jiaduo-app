package com.wt.jiaduo.controller.pojovalid;
// Generated 2018-3-31 10:29:38 by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * MalingshuWanyibingzhongxibingzhuxt generated by hbm2java
 */
public class MalingshuWanyibingzhongxibingzhuxtUpdateValid implements java.io.Serializable {
	@NotNull(message="id不能为空")
	private Integer id;
	private String place;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateTime;
	private String pingzhong;
	private String shengyuqi;
	private String diaochamianji;
	private String fabingzhushu;
	private String zhibeimidu;
	private String bingzhulv;
	private String yangzhongdu0;
	private String yangzhongdu1;
	private String yangzhongdu3;
	private String yangzhongdu5;
	private String yangzhongdu7;
	private String yangzhongdu9;
	private String bingqingzhishu;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;
	private Integer pinzhongId;
	private Integer shengyuqiId;
	public Integer getPinzhongId() {
		return pinzhongId;
	}

	public void setPinzhongId(Integer pinzhongId) {
		this.pinzhongId = pinzhongId;
	}

	public Integer getShengyuqiId() {
		return shengyuqiId;
	}

	public void setShengyuqiId(Integer shengyuqiId) {
		this.shengyuqiId = shengyuqiId;
	}


	public MalingshuWanyibingzhongxibingzhuxtUpdateValid() {
	}

	public MalingshuWanyibingzhongxibingzhuxtUpdateValid(String place,  Date dateTime, String pingzhong,
			String shengyuqi, String diaochamianji, String fabingzhushu, String zhibeimidu, String bingzhulv,
			String yangzhongdu0, String yangzhongdu1, String yangzhongdu3, String yangzhongdu5, String yangzhongdu7,
			String yangzhongdu9, String bingqingzhishu, String remark, Integer userId, String userName,
			String longitude, String latitude,
			Integer pinzhongId, Integer shengyuqiId) {
		this.place = place;
		this.dateTime = dateTime;
		this.pingzhong = pingzhong;
		this.shengyuqi = shengyuqi;
		this.diaochamianji = diaochamianji;
		this.fabingzhushu = fabingzhushu;
		this.zhibeimidu = zhibeimidu;
		this.bingzhulv = bingzhulv;
		this.yangzhongdu0 = yangzhongdu0;
		this.yangzhongdu1 = yangzhongdu1;
		this.yangzhongdu3 = yangzhongdu3;
		this.yangzhongdu5 = yangzhongdu5;
		this.yangzhongdu7 = yangzhongdu7;
		this.yangzhongdu9 = yangzhongdu9;
		this.bingqingzhishu = bingqingzhishu;
		this.remark = remark;
		this.userId = userId;
		this.userName = userName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.pinzhongId = pinzhongId;
		this.shengyuqiId = shengyuqiId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getPingzhong() {
		return this.pingzhong;
	}

	public void setPingzhong(String pingzhong) {
		this.pingzhong = pingzhong;
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

	public String getFabingzhushu() {
		return this.fabingzhushu;
	}

	public void setFabingzhushu(String fabingzhushu) {
		this.fabingzhushu = fabingzhushu;
	}

	public String getZhibeimidu() {
		return this.zhibeimidu;
	}

	public void setZhibeimidu(String zhibeimidu) {
		this.zhibeimidu = zhibeimidu;
	}

	public String getBingzhulv() {
		return this.bingzhulv;
	}

	public void setBingzhulv(String bingzhulv) {
		this.bingzhulv = bingzhulv;
	}

	public String getYangzhongdu0() {
		return this.yangzhongdu0;
	}

	public void setYangzhongdu0(String yangzhongdu0) {
		this.yangzhongdu0 = yangzhongdu0;
	}

	public String getYangzhongdu1() {
		return this.yangzhongdu1;
	}

	public void setYangzhongdu1(String yangzhongdu1) {
		this.yangzhongdu1 = yangzhongdu1;
	}

	public String getYangzhongdu3() {
		return this.yangzhongdu3;
	}

	public void setYangzhongdu3(String yangzhongdu3) {
		this.yangzhongdu3 = yangzhongdu3;
	}

	public String getYangzhongdu5() {
		return this.yangzhongdu5;
	}

	public void setYangzhongdu5(String yangzhongdu5) {
		this.yangzhongdu5 = yangzhongdu5;
	}

	public String getYangzhongdu7() {
		return this.yangzhongdu7;
	}

	public void setYangzhongdu7(String yangzhongdu7) {
		this.yangzhongdu7 = yangzhongdu7;
	}

	public String getYangzhongdu9() {
		return this.yangzhongdu9;
	}

	public void setYangzhongdu9(String yangzhongdu9) {
		this.yangzhongdu9 = yangzhongdu9;
	}

	public String getBingqingzhishu() {
		return this.bingqingzhishu;
	}

	public void setBingqingzhishu(String bingqingzhishu) {
		this.bingqingzhishu = bingqingzhishu;
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
