package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.XiaomaiCongaibingBingqingpucha;

public interface XiaomaiCongaibingBingqingpuchaService {
	public Page<XiaomaiCongaibingBingqingpucha> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiCongaibingBingqingpucha saveOne(XiaomaiCongaibingBingqingpucha xiaomaiCongaibingBingqingpucha);
	public XiaomaiCongaibingBingqingpucha modify(XiaomaiCongaibingBingqingpucha xiaomaiCongaibingBingqingpucha);
	public void delete(Integer id);
	public XiaomaiCongaibingBingqingpucha getOne(Integer id);
}
