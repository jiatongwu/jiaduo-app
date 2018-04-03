package com.wt.jiaduo.controller.pojovalid;
// Generated 2018-3-31 10:29:38 by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * XiaomaiXijiangchongbosui generated by hbm2java
 */
public class XiaomaiXijiangchongbosuiUpdateValid implements java.io.Serializable {
	@NotNull(message="id不能为空")
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date dateTime;
	private String place;
	private String xiaomaipingzhong;
	private String tuzhi;
	private String jianchasuishu;
	private String beihaisuishu;
	private String beihaisuilv;
	private String jianchalishu;
	private String beihailishu;
	private String beihaililv;
	private String youchongzongchongshu;
	private String pingjundansui;
	private String zuiduodansui;
	private String pingjunmeili;
	private String sunshilv;
	private String remark;
	private Integer userId;
	private String userName;
	private String longitude;
	private String latitude;

	public XiaomaiXijiangchongbosuiUpdateValid() {
	}

	public XiaomaiXijiangchongbosuiUpdateValid(Date dateTime, String place, String xiaomaipingzhong, String tuzhi,
			String jianchasuishu, String beihaisuishu, String beihaisuilv, String jianchalishu, String beihailishu,
			String beihaililv, String youchongzongchongshu, String pingjundansui, String zuiduodansui,
			String pingjunmeili, String sunshilv, String remark, Integer userId, String userName, String longitude,
			String latitude) {
		this.dateTime = dateTime;
		this.place = place;
		this.xiaomaipingzhong = xiaomaipingzhong;
		this.tuzhi = tuzhi;
		this.jianchasuishu = jianchasuishu;
		this.beihaisuishu = beihaisuishu;
		this.beihaisuilv = beihaisuilv;
		this.jianchalishu = jianchalishu;
		this.beihailishu = beihailishu;
		this.beihaililv = beihaililv;
		this.youchongzongchongshu = youchongzongchongshu;
		this.pingjundansui = pingjundansui;
		this.zuiduodansui = zuiduodansui;
		this.pingjunmeili = pingjunmeili;
		this.sunshilv = sunshilv;
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

	public String getXiaomaipingzhong() {
		return this.xiaomaipingzhong;
	}

	public void setXiaomaipingzhong(String xiaomaipingzhong) {
		this.xiaomaipingzhong = xiaomaipingzhong;
	}

	public String getTuzhi() {
		return this.tuzhi;
	}

	public void setTuzhi(String tuzhi) {
		this.tuzhi = tuzhi;
	}

	public String getJianchasuishu() {
		return this.jianchasuishu;
	}

	public void setJianchasuishu(String jianchasuishu) {
		this.jianchasuishu = jianchasuishu;
	}

	public String getBeihaisuishu() {
		return this.beihaisuishu;
	}

	public void setBeihaisuishu(String beihaisuishu) {
		this.beihaisuishu = beihaisuishu;
	}

	public String getBeihaisuilv() {
		return this.beihaisuilv;
	}

	public void setBeihaisuilv(String beihaisuilv) {
		this.beihaisuilv = beihaisuilv;
	}

	public String getJianchalishu() {
		return this.jianchalishu;
	}

	public void setJianchalishu(String jianchalishu) {
		this.jianchalishu = jianchalishu;
	}

	public String getBeihailishu() {
		return this.beihailishu;
	}

	public void setBeihailishu(String beihailishu) {
		this.beihailishu = beihailishu;
	}

	public String getBeihaililv() {
		return this.beihaililv;
	}

	public void setBeihaililv(String beihaililv) {
		this.beihaililv = beihaililv;
	}

	public String getYouchongzongchongshu() {
		return this.youchongzongchongshu;
	}

	public void setYouchongzongchongshu(String youchongzongchongshu) {
		this.youchongzongchongshu = youchongzongchongshu;
	}

	public String getPingjundansui() {
		return this.pingjundansui;
	}

	public void setPingjundansui(String pingjundansui) {
		this.pingjundansui = pingjundansui;
	}

	public String getZuiduodansui() {
		return this.zuiduodansui;
	}

	public void setZuiduodansui(String zuiduodansui) {
		this.zuiduodansui = zuiduodansui;
	}

	public String getPingjunmeili() {
		return this.pingjunmeili;
	}

	public void setPingjunmeili(String pingjunmeili) {
		this.pingjunmeili = pingjunmeili;
	}

	public String getSunshilv() {
		return this.sunshilv;
	}

	public void setSunshilv(String sunshilv) {
		this.sunshilv = sunshilv;
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
