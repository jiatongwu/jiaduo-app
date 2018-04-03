package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiCongaibingTianjianzishengmaimiao;

public interface XiaomaiCongaibingTianjianzishengmaimiaoService {
	public Page<XiaomaiCongaibingTianjianzishengmaimiao> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiCongaibingTianjianzishengmaimiao saveOne(XiaomaiCongaibingTianjianzishengmaimiao xiaomaiCongaibingTianjianzishengmaimiao);
	public XiaomaiCongaibingTianjianzishengmaimiao modify(XiaomaiCongaibingTianjianzishengmaimiao xiaomaiCongaibingTianjianzishengmaimiao);
	public void delete(Integer id);
	public XiaomaiCongaibingTianjianzishengmaimiao getOne(Integer id);
}
