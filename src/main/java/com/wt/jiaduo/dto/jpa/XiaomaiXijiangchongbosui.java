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
 * XiaomaiXijiangchongbosui generated by hbm2java
 */
@Entity
@Table(name = "xiaomai_xijiangchongbosui", catalog = "jiaduo")
public class XiaomaiXijiangchongbosui implements java.io.Serializable {

	private Integer id;
	private Date dateTime;
	private String person;
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

	public XiaomaiXijiangchongbosui() {
	}

	public XiaomaiXijiangchongbosui(Date dateTime, String person, String place, String xiaomaipingzhong, String tuzhi,
			String jianchasuishu, String beihaisuishu, String beihaisuilv, String jianchalishu, String beihailishu,
			String beihaililv, String youchongzongchongshu, String pingjundansui, String zuiduodansui,
			String pingjunmeili, String sunshilv, String remark, Integer userId, String userName, String longitude,
			String latitude) {
		this.dateTime = dateTime;
		this.person = person;
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

	@Column(name = "xiaomaipingzhong")
	public String getXiaomaipingzhong() {
		return this.xiaomaipingzhong;
	}

	public void setXiaomaipingzhong(String xiaomaipingzhong) {
		this.xiaomaipingzhong = xiaomaipingzhong;
	}

	@Column(name = "tuzhi")
	public String getTuzhi() {
		return this.tuzhi;
	}

	public void setTuzhi(String tuzhi) {
		this.tuzhi = tuzhi;
	}

	@Column(name = "jianchasuishu")
	public String getJianchasuishu() {
		return this.jianchasuishu;
	}

	public void setJianchasuishu(String jianchasuishu) {
		this.jianchasuishu = jianchasuishu;
	}

	@Column(name = "beihaisuishu")
	public String getBeihaisuishu() {
		return this.beihaisuishu;
	}

	public void setBeihaisuishu(String beihaisuishu) {
		this.beihaisuishu = beihaisuishu;
	}

	@Column(name = "beihaisuilv")
	public String getBeihaisuilv() {
		return this.beihaisuilv;
	}

	public void setBeihaisuilv(String beihaisuilv) {
		this.beihaisuilv = beihaisuilv;
	}

	@Column(name = "jianchalishu")
	public String getJianchalishu() {
		return this.jianchalishu;
	}

	public void setJianchalishu(String jianchalishu) {
		this.jianchalishu = jianchalishu;
	}

	@Column(name = "beihailishu")
	public String getBeihailishu() {
		return this.beihailishu;
	}

	public void setBeihailishu(String beihailishu) {
		this.beihailishu = beihailishu;
	}

	@Column(name = "beihaililv")
	public String getBeihaililv() {
		return this.beihaililv;
	}

	public void setBeihaililv(String beihaililv) {
		this.beihaililv = beihaililv;
	}

	@Column(name = "youchongzongchongshu")
	public String getYouchongzongchongshu() {
		return this.youchongzongchongshu;
	}

	public void setYouchongzongchongshu(String youchongzongchongshu) {
		this.youchongzongchongshu = youchongzongchongshu;
	}

	@Column(name = "pingjundansui")
	public String getPingjundansui() {
		return this.pingjundansui;
	}

	public void setPingjundansui(String pingjundansui) {
		this.pingjundansui = pingjundansui;
	}

	@Column(name = "zuiduodansui")
	public String getZuiduodansui() {
		return this.zuiduodansui;
	}

	public void setZuiduodansui(String zuiduodansui) {
		this.zuiduodansui = zuiduodansui;
	}

	@Column(name = "pingjunmeili")
	public String getPingjunmeili() {
		return this.pingjunmeili;
	}

	public void setPingjunmeili(String pingjunmeili) {
		this.pingjunmeili = pingjunmeili;
	}

	@Column(name = "sunshilv")
	public String getSunshilv() {
		return this.sunshilv;
	}

	public void setSunshilv(String sunshilv) {
		this.sunshilv = sunshilv;
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