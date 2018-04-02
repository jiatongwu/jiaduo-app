package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.XiaomaiYachongDatian;

public interface XiaomaiYachongDatianService {
	public Page<XiaomaiYachongDatian> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiYachongDatian saveOne(XiaomaiYachongDatian xiaomaiYachongDatian);
	public XiaomaiYachongDatian modify(XiaomaiYachongDatian xiaomaiYachongDatian);
	public void delete(Integer id);
	public XiaomaiYachongDatian getOne(Integer id);
}
