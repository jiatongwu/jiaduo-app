package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiCongaibingHuifeishichongkoumidu;

public interface XiaomaiCongaibingHuifeishichongkoumiduService {
	public Page<XiaomaiCongaibingHuifeishichongkoumidu> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiCongaibingHuifeishichongkoumidu saveOne(XiaomaiCongaibingHuifeishichongkoumidu xiaomaiCongaibingHuifeishichongkoumidu);
	public XiaomaiCongaibingHuifeishichongkoumidu modify(XiaomaiCongaibingHuifeishichongkoumidu xiaomaiCongaibingHuifeishichongkoumidu);
	public void delete(Integer id);
	public XiaomaiCongaibingHuifeishichongkoumidu getOne(Integer id);
}
