package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.XiaomaiCongaibingHuifeishizirandaidulv;

public interface XiaomaiCongaibingHuifeishizirandaidulvService {
	public Page<XiaomaiCongaibingHuifeishizirandaidulv> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiCongaibingHuifeishizirandaidulv saveOne(XiaomaiCongaibingHuifeishizirandaidulv xiaomaiCongaibingHuifeishizirandaidulv);
	public XiaomaiCongaibingHuifeishizirandaidulv modify(XiaomaiCongaibingHuifeishizirandaidulv xiaomaiCongaibingHuifeishizirandaidulv);
	public void delete(Integer id);
	public XiaomaiCongaibingHuifeishizirandaidulv getOne(Integer id);
}
