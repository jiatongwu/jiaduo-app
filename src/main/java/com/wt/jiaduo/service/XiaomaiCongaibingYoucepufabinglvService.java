package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiCongaibingYoucepufabinglv;

public interface XiaomaiCongaibingYoucepufabinglvService {
	public Page<XiaomaiCongaibingYoucepufabinglv> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiCongaibingYoucepufabinglv saveOne(XiaomaiCongaibingYoucepufabinglv xiaomaiCongaibingYoucepufabinglv);
	public XiaomaiCongaibingYoucepufabinglv modify(XiaomaiCongaibingYoucepufabinglv xiaomaiCongaibingYoucepufabinglv);
	public void delete(Integer id);
	public XiaomaiCongaibingYoucepufabinglv getOne(Integer id);
}
