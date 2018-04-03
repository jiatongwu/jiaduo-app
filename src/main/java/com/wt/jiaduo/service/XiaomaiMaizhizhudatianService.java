package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiMaizhizhudatian;

public interface XiaomaiMaizhizhudatianService {
	public Page<XiaomaiMaizhizhudatian> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiMaizhizhudatian saveOne(XiaomaiMaizhizhudatian xiaomaiMaizhizhudatian);
	public XiaomaiMaizhizhudatian modify(XiaomaiMaizhizhudatian xiaomaiMaizhizhudatian);
	public void delete(Integer id);
	public XiaomaiMaizhizhudatian getOne(Integer id);
}
